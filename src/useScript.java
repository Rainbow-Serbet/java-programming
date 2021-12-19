import java.util.Random;
import java.util.Scanner;

public class useScript {

    int ID = 0;

    // * 스크립트 1번은 반드시 새로운 왕 즉위시 사용
    // * 1~50 까지의 숫자 랜덤 연산 -> 추후 스크립트 개수에 맞춰 수정

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

    public void calCLI(int select, int randID) {
        if (select == 1) {
            money = money + gets.returnMoney(script.getMoney(randID));
            person = person + gets.returnPerson(script.getPerson(randID));
            army = army + gets.returnArmy(script.getArmy(randID));
            religion = religion + gets.returnReligion(script.getReligion(randID));
        } else if (select == 2) {
            money = money - gets.returnMoney(script.getMoney(randID));
            person = person - gets.returnPerson(script.getPerson(randID));
            army = army - gets.returnArmy(script.getArmy(randID));
            religion = religion - gets.returnReligion(script.getReligion(randID));
        }
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

        Scanner in = new Scanner(System.in);
        useScript use = new useScript();

        for (int i = 0; i < 25; i++) {
            System.out.println();
        }
        use.printCLI();
        use.firstSentence();
        System.out.print("1. ");
        use.firstAnswer1();
        System.out.print("2. ");
        use.firstAnswer2();
        System.out.println("3. 종료");
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

                if (use.money > 100) {
                    for (int i = 0; i < 25; i++)
                        System.out.println();

                    System.out.println("넘치는 돈을 주체할 수 없습니다!!");
                    System.out.println("귀족들이 흥청망청 돈을 사용합니다");
                    System.out.println("1.  이런..");
                    System.out.println("2.  이런..");
                    select = in.nextInt();

                    use.money = 50;
                    use.person = 50;
                    use.army = 50;
                    use.religion = 50;

                    System.out.println("왕은 그 동안의 정치 실력을 인정받아 이웃 국가에서 재상이 되었습니다.");
                    System.out.println("1. 재시작  2. 재시작  3. 종료");
                    select = in.nextInt();

                } else if (use.money < 0) {
                    for (int i = 0; i < 25; i++)
                        System.out.println();

                    System.out.println("국고가 거덜났습니다..");
                    System.out.println("굶주린 백성들이 반란을 일으켰습니다..!");

                    System.out.println("1.  이런..");
                    System.out.println("2.  이런..");
                    select = in.nextInt();

                    use.money = 50;
                    use.person = 50;
                    use.army = 50;
                    use.religion = 50;

                    System.out.println("백성은 굶주렸지만 무난한 정치를 보인 왕은 평민으로 추방 되었습니다.");

                    System.out.println("1. 재시작  2. 재시작  3. 종료");
                    select = in.nextInt();
                } else if (use.person > 100) {
                    for (int i = 0; i < 25; i++)
                        System.out.println();

                    System.out.println("백성들이 즐거워 하는 모습이 보기 좋군요.");
                    System.out.println("축제엔 사건사고가 많습니다. 조심하시죠.");

                    System.out.println("1.  이런..");
                    System.out.println("2.  이런..");
                    select = in.nextInt();

                    use.money = 50;
                    use.person = 50;
                    use.army = 50;
                    use.religion = 50;

                    System.out.println("우리나라를 시기한 이웃국가의 자객에 의해 사망하였습니다.");

                    System.out.println("1. 재시작  2. 재시작  3. 종료");
                    select = in.nextInt();
                } else if (use.person < 0) {
                    for (int i = 0; i < 25; i++)
                        System.out.println();

                    System.out.println("왕의 폭정을 참지 못한 백성이 반란을 일으켰습니다..!!");

                    System.out.println("1.  이런..");
                    System.out.println("2.  이런..");
                    select = in.nextInt();

                    use.money = 50;
                    use.person = 50;
                    use.army = 50;
                    use.religion = 50;

                    System.out.println("참을대로 참은 백성은 왕을 단두대에 매달았습니다.");

                    System.out.println("1. 재시작  2. 재시작  3. 종료");
                    select = in.nextInt();
                } else if (use.army > 100) {
                    for (int i = 0; i < 25; i++)
                        System.out.println();

                    System.out.println("장군들이 반란을 일으켰습니다..!");

                    System.out.println("1.  이런..");
                    System.out.println("2.  이런..");
                    select = in.nextInt();

                    use.money = 50;
                    use.person = 50;
                    use.army = 50;
                    use.religion = 50;

                    System.out.println("왕은 명분이 필요했던 군인들에 의해 국외로 추방되었습니다.");

                    System.out.println("1. 재시작  2. 재시작  3. 종료");
                    select = in.nextInt();
                } else if (use.army < 0) {
                    for (int i = 0; i < 25; i++)
                        System.out.println();

                    System.out.println("적이 쳐들어왔습니다!!");
                    System.out.println("우리 나라는 막을 힘이 없습니다..");

                    System.out.println("1.  이런..");
                    System.out.println("2.  이런..");
                    select = in.nextInt();

                    use.money = 50;
                    use.person = 50;
                    use.army = 50;
                    use.religion = 50;

                    System.out.println("전쟁에서 대패한 왕은 포로로 끌려가게 되었습니다.");

                    System.out.println("1. 재시작  2. 재시작  3. 종료");
                    select = in.nextInt();
                } else if (use.religion > 100) {
                    for (int i = 0; i < 25; i++)
                        System.out.println();

                    System.out.println("한 나라에 두 태양은 필요없다..!");
                    System.out.println("교황이 반란을 일으켰습니다.");

                    System.out.println("1.  이런..");
                    System.out.println("2.  이런..");
                    select = in.nextInt();

                    use.money = 50;
                    use.person = 50;
                    use.army = 50;
                    use.religion = 50;

                    System.out.println("왕은 교회가 힘을 잡은 이 나라의 첫번째 마녀사냥 대상이 되어 화형에 쳐했습니다.");

                    System.out.println("1. 재시작  2. 재시작  3. 종료");
                    select = in.nextInt();
                } else if (use.religion < 0) {
                    for (int i = 0; i < 25; i++)
                        System.out.println();

                    System.out.println("지방의 교회가 모두 몰락했습니다..!");
                    System.out.println("지방 약소 도시가 무법지대가 되었습니다!!!");

                    System.out.println("1.  이런..");
                    System.out.println("2.  이런..");
                    select = in.nextInt();

                    use.money = 50;
                    use.person = 50;
                    use.army = 50;
                    use.religion = 50;

                    System.out.println("교회가 관리하던 지방의 고아원, 복지시설이 몰락하면서 지방 영지가 파산하였습니다.");
                    System.out.println("지방 영지들이 탈퇴하여 봉건제가 무너져 국가가 해산됩니다.");

                    System.out.println("1. 재시작  2. 재시작  3. 종료");
                    select = in.nextInt();
                } else {
                    for (int i = 0; i < 25; i++)
                        System.out.println();
                    use.printCLI();
                    use.randSentence(randID);
                    System.out.print("1. ");
                    use.randAnswer1(randID);
                    System.out.print("2. ");
                    use.randAnswer2(randID);
                    System.out.println("3. 종료");
                    System.out.print("선택 : ");
                    select = in.nextInt();

                    use.calCLI(select, randID);
                }

            }
        }
        in.close();
    }

}
