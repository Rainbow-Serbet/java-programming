import java.util.Random;
import java.util.Scanner;

public class useScript {
    Random random = new Random();
    // int ID = random.nextInt(100) + 1;
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

    int money = 50;
    int person = 50;
    int army = 50;
    int religion = 50;

    String setence = script.getSentence(ID);
    String Answer1 = script.getAnswer1(ID);
    String Answer2 = script.getAnswer2(ID);

    public void printCLI() {
        System.out.print("MONEY    ");
        for (int i = 0; i < money / 5; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.print("PERSON   ");
        for (int i = 0; i < person / 5; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.print("ARMY     ");
        for (int i = 0; i < army / 5; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.print("RELIGION ");
        for (int i = 0; i < religion / 5; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    int ranID = random.nextInt(100) + 1;

    public void randSentence() {
        System.out.println(script.getSentence(ranID));
    }

    public void randAnswer1() {
        System.out.println(script.getAnswer1(ranID));
    }

    public void randAnswer2() {
        System.out.println(script.getAnswer2(ranID));
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

    // public void value() {
    // calcValue calc = new calcValue(1, );

    // }

    public static void main(String[] args) {

        int select = 0;
        Scanner in = new Scanner(System.in);
        useScript use = new useScript();

        for (int i = 0; i < 25; i++) {
            System.out.println();
        }
        use.firstSentence();
        use.firstAnswer1();
        use.firstAnswer2();
        System.out.print("선택 : ");
        select = in.nextInt();

        while (true) {
            if (select == 5) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (select > 5) {
                System.out.println("잘못 입력하였습니다.");
                System.out.print("선택 : ");
                select = in.nextInt();
            } else if (select != 5) {

                for (int i = 0; i < 25; i++)
                    System.out.println();
                use.printCLI();
                use.randSentence();
                use.randAnswer1();
                use.randAnswer2();

                System.out.print("선택 : ");
                select = in.nextInt();

            }
        }
        in.close();
    }

}
