import java.util.Random;
import java.util.Scanner;

public class useScript {

    int ID = 0;

    // * 스크립트 1번은 반드시 새로운 왕 즉위시 사용
    // * 1~100 까지의 숫자 랜덤 연산 -> 추후 스크립트 개수에 맞춰 수정

    getScript gets = new getScript();
    Script script = new Script();
    /*
     * int money = gets.returnMoney(script.getMoney(ID));
     * int person = gets.returnPerson(script.getPerson(ID));
     * int army = gets.returnArmy(script.getArmy(ID));
     * int religion = gets.returnReligion(script.getReligion(ID));
     */

    // * 프로그레스 바 구현
    int money = 50;
    int person = 50;
    int army = 50;
    int religion = 50;

    public void printCLI() {
        System.out.print("MONEY    ");
        for (int i = 0; i < money / 2; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.print("PERSON   ");
        for (int i = 0; i < person / 2; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.print("ARMY     ");
        for (int i = 0; i < army / 2; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.print("RELIGION ");
        for (int i = 0; i < religion / 2; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    // * 지문, 답변 출력
    public void randSentence(int randID) {
        System.out.println(script.getSentence(randID));
    }

    public void randAnswer1(int randID) {
        System.out.println(script.getAnswer1(randID));
    }

    public void randAnswer2(int randID) {
        System.out.println(script.getAnswer2(randID));
    }

    public void firstSentence() {
        System.out.println(script.getSentence(0));
    }

    public void firstAnswer1() {
        System.out.println(script.getAnswer1(0));
    }

    public void firstAnswer2() {
        System.out.println(script.getAnswer2(0));
    }

    public static void main(String[] args) {

        int select = 0;
        int age = 0;
        Scanner in = new Scanner(System.in);
        useScript use = new useScript();

        for (int i = 0; i < 25; i++) {
            System.out.println();
        }
        use.printCLI();
        use.firstSentence();
        use.firstAnswer1();
        use.firstAnswer2();
        System.out.print("선택 : ");
        select = in.nextInt();

        while (true) {
            Random random = new Random();
            int randID = random.nextInt(50) + 1;

            if (select == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            else if (select > 3) {
                System.out.println("잘못 입력하였습니다.");
                System.out.print("선택 : ");
                select = in.nextInt();
            }

            else if (select != 3) {

                for (int i = 0; i < 25; i++)
                    System.out.println();
                use.printCLI();
                use.randSentence(randID);
                use.randAnswer1(randID);
                use.randAnswer2(randID);

                System.out.print("선택 : ");
                select = in.nextInt();
                age++;

            }
        }
        in.close();
    }

}
