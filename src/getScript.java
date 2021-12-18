import java.util.Random;

public class getScript extends Script {
    int money, person, army, religion;
    /*
     * 순서대로 재정, 민심, 군사, 종교
     * 변동값을 결정하는 변수
     * (+)와 (-)부호로 증감 결정(작은변동 = 1~10, 큰 변동 11~20, 랜덤 이용)
     */

    Random getRandom = new Random();

    public int returnMoney(String money) {
        switch (money) {
            case "plusBig":
                this.money = getRandom.nextInt(11);
                break;

            case "plusSmall":
                this.money = getRandom.nextInt(11) + 10;
                break;

            case "minusBig":
                this.money = -getRandom.nextInt(11);
                break;

            case "minusSmall":
                this.money = -(getRandom.nextInt(11) + 10);
                break;

            case "none":
                this.money = 0;
                break;

        }
        return this.money;
    }

    public int returnPerson(String person) {
        switch (person)

        {
            case "plusBig":
                this.person = getRandom.nextInt(11);
                break;

            case "plusSmall":
                this.person = getRandom.nextInt(11) + 10;
                break;

            case "minusBig":
                this.person = -getRandom.nextInt(11);
                break;

            case "minusSmall":
                this.person = -(getRandom.nextInt(11) + 10);
                break;

            case "none":
                this.person = 0;
                break;
        }
        return this.person;
    }

    public int returnArmy(String army) {
        switch (army)

        {
            case "plusBig":
                this.army = getRandom.nextInt(11);
                break;

            case "plusSmall":
                this.army = getRandom.nextInt(11) + 10;
                break;

            case "minusBig":
                this.army = -getRandom.nextInt(11);
                break;

            case "minusSmall":
                this.army = -(getRandom.nextInt(11) + 10);
                break;

            case "none":
                this.army = 0;
                break;
        }
        return this.army;
    }

    public int returnReligion(String religion) {
        switch (religion) {
            case "plusBig":
                this.religion = getRandom.nextInt(11);
                break;

            case "plusSmall":
                this.religion = getRandom.nextInt(11) + 10;
                break;

            case "minusBig":
                this.religion = -getRandom.nextInt(11);
                break;

            case "minusSmall":
                this.religion = -(getRandom.nextInt(11) + 10);
                break;

            case "none":
                this.religion = 0;
                break;

        }
        return this.religion;
    }

}
