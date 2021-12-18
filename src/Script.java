
public class Script {
    // * 재정, 민심, 군사, 종교, 스크립트 문장, 대답1, 대답2 순
    private String Money[] = new String[100];
    private String Person[] = new String[100];
    private String Army[] = new String[100];
    private String Religion[] = new String[100];
    private String Sentence[] = new String[100];
    private String Answer1[] = new String[100];
    private String Answer2[] = new String[100];

    // * set메서드
    // * 배열형태로 저장, 호출시 int ID 이용
    public void setScript() {
        Money[0] = "none";
        Person[0] = "none";
        Army[0] = "none";
        Religion[0] = "none";
        Sentence[0] = "새로운 왕이 즉위하였습니다.";
        Answer1[0] = "전하..!";
        Answer2[0] = "아뢰옵니다!!";

    }

    // * get메서드
    // * setScript.java에서 호출시 이용
    public String getMoney(int ID) {
        return Money[ID];
    }

    public String getPerson(int ID) {
        return Person[ID];
    }

    public String getArmy(int ID) {
        return Army[ID];
    }

    public String getReligion(int ID) {
        return Religion[ID];
    }

    public String getSentence(int ID) {
        return Sentence[ID];
    }

    public String getAnswer1(int ID) {
        return Answer1[ID];
    }

    public String getAnswer2(int ID) {
        return Answer2[ID];
    }

}
