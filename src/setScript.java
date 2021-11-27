import java.util.Random;

public class setScript {
    int ID; // * 스크립트 번호
    int money, person, army, religion; // * : 순서대로 재정, 민심, 군사, 종교
                                       // * : 변동값을 결정하는 변수
                                       // * : (+)와 (-)부호로 증감 결정(작은변동 = 1~10, 큰 변동 11~20, 랜덤 이용)
    String sentence; // * : 스크립트 내용, 문장단위
    String yes, no; // * : 문장에 대한 대답, 2지선다로 "예, 아니요" 등의 내용

    public setScript(int ID, String getMoney, String getPerson, String getArmy, String getReligion,
            String getSentence, String getYes, String getNo) {
        Random getRandom = new Random();

        this.ID = ID;

        switch (getMoney) {
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
        }

        switch (getPerson) {
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
        }

        switch (getArmy) {
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
        }

        switch (getReligion) {
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
        }

        this.sentence = getSentence;
        this.yes = getYes;
        this.no = getNo;
    }
}
