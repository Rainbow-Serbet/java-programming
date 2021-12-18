
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
    // Answer1 선택시 4개변수 1이 작동(Money1, Person1 등)
    public void setScript() {
        Money[0] = "none";
        Person[0] = "none";
        Army[0] = "none";
        Religion[0] = "none";
        Sentence[0] = "새로운 왕이 즉위하였습니다.";
        Answer1[0] = "전하..!";
        Answer2[0] = "아뢰옵니다!!";

        Money[1] = "none";
        Person[1] = "none";
        Army[1] = "plusSmall"; //부정: none
        Religion[1] = "none";
        Sentence[1] = "다른 왕궁이 나날이 힘을 발휘하고 있습니다. 지금 쳐들어갑시다!";
        Answer1[1] = "알겠다.";
        Answer2[1] = "아니된다.";
        
        Money[2] = "minusSmall"; //부정: none
        Person[2] = "none";
        Army[2] = "none";
        Religion[2] = "plusSmall"; //부정: minusSmall
        Sentence[2] = "폐하, 새로운 교회를 건설해야 합니다!";
        Answer1[2] = "알겠다.";
        Answer2[2] = "아니된다.";
        
        Money[3] = "none";
        Person[3] = "plusSmall"; //부정: minusSmall
        Army[3] = "none";
        Religion[3] = "none";
        Sentence[3] = "감옥으로부터 많은 죄수가 탈옥했습니다. 수색대를 보내주세요!";
        Answer1[3] = "알겠다.";
        Answer2[3] = "자유를 찾게 두거라.";
        
        Money[4] = "minusSmall"; //긍정: none
        Person[4] = "plusBig"; //부정: none
        Army[4] = "minusSmall"; //긍정: none
        Religion[4] = "minusSmall"; //긍정: none
        Sentence[4] = "강이 범람해 나라 전체에 홍수 피해가 났습니다! 교회와 군도 구원 활동에 손을 빌려 주세요!";
        Answer1[4] = "알겠다.";
        Answer2[4] = "아니된다.";
        
        Money[5] = "plusSmall"; //부정: minusSmall
        Person[5] = "plusSmall"; //부정: minusSmall
        Army[5] = "plusSmall"; //부정: minusSmall
        Religion[5] = "plusSmall"; //부정: minusSmall
        Sentence[5] = "적국으로부터 종전 요청이 있었습니다. 수락 하실껍니까?";
        Answer1[5] = "수락하라.";
        Answer2[5] = "거절하라.";
        
        Money[6] = "plusBig";  //부정: none
        Person[6] = "none";
        Army[6] = "none";
        Religion[6] = "none";
        Sentence[6] = "폐하, 광산에서 금이 넘쳐납니다!";
        Answer1[6] = "가져오거라.";
        Answer2[6] = "내버려두거라.";
        
        Money[7] = "minusSmall"; //부정: none
        Person[7] = "none";
        Army[7] = "none";
        Religion[7] = "plusBig"; //부정: minusBig
        Sentence[7] = "백성들이 미신에 현혹되어 신을 믿으려 하지 않습니다. 좀 더 교회를 늘리시는 것이 어떨까요?";
        Answer1[7] = "알겠다.";
        Answer2[7] = "아니된다.";
        
        Money[8] = "none";
        Person[8] = "plusBig"; //부정: minusBig
        Army[8] = "none";
        Religion[8] = "none";
        Sentence[8] = "강의 하구 부근에, 위험한 늪지대가 퍼져 있습니다. 그 일대를 소독합시다!";
        Answer1[8] = "알겠다.";
        Answer2[8] = "아니된다.";
        
        Money[9] = "minusBig"; //부정: plusBig
        Person[9] = "minusBig"; //부정: none
        Army[9] = "minusBig"; //부정: plusBig
        Religion[9] = "minusBig"; // 부정: minusBig
        Sentence[9] = "교회의 권위가 약해져 이미 백성의 폭동을 억제할 수 없습니다.. 폐하도 어서 도망쳐주세요!";
        Answer1[9] = "알겠다.";
        Answer2[9] = "왕이 도망치는건 수치다!";
        
        Money[10] = "plusBig"; //부정: minusBig
        Person[10] = "none";
        Army[10] = "minusSmall"; //부정: none
        Religion[10] = "none";
        Sentence[10] = "광산에서 금이 발견되었습니다. 한 층 더 깊이 파 볼까요?";
        Answer1[10] = "더 파보거라.";
        Answer2[10] = "이쯤하고 돌아가자.";
        
        Money[11] = "minusBig"; //부정: none
        Person[11] = "minusBig"; //긍정: none
        Army[11] = "plusBig"; //부정: none
        Religion[11] = "none";
        Sentence[11] = "대지진으로 왕도에 심각한 피해가 났습니다 ! 위병대에 지시를 부탁드려요!";
        Answer1[11] = "백성을 구휼하거라.";
        Answer2[11] = "내버려두거라.";
        
        Money[12] = "minusSmall"; //부정: none
        Person[12] = "none";
        Army[12] = "none";
        Religion[12] = "plusBig"; //부정: minusBig
        Sentence[12] = "떠나간 아버님을 추모하는 미사를 거행합시다.";
        Answer1[12] = "알겠다.";
        Answer2[12] = "아니된다.";
        
        Money[13] = "minusSmall"; //부정: none
        Person[13] = "none";
        Army[13] = "plusBig"; //부정: minusBig
        Religion[13] = "none";
        Sentence[13] = "폐하, 성의 방어 시설이 견고하지 않습니다. 새로 요새를 건설합시다.";
        Answer1[13] = "알겠다.";
        Answer2[13] = "아니된다.";
        
        Money[14] = "none";
        Person[14] = "none";
        Army[14] = "none";
        Religion[14] = "plusSmall"; //부정: minusSmall
        Sentence[14] = "폐하, 치세와 번영을 기원하며 기도를 바칩시다.";
        Answer1[14] = "알겠다. 기도를 올리거라.";
        Answer2[14] = "아니된다..";
        
        Money[15] = "minusSmall"; //부정: plusSmall
        Person[15] = "none";
        Army[15] = "plusSmall"; //부정: minusSmall
        Religion[15] = "plusSmall"; //부정: minusSmall
        Sentence[15] = "폐하, 새로운 시장을 마련합시다. 여러 나라와 교역을 할 수 있게 됩니다!";
        Answer1[15] = "알겠다.";
        Answer2[15] = "아니된다.";
        
        Money[16] = "minusBig"; //부정: none
        Person[16] = "minusBig"; //긍정: none
        Army[16] = "minusBig"; //부정: none
        Religion[16] = "none";
        Sentence[16] = "농민들의 반란입니다! 수많은 폭도가 왕도에서 약탈 행위를 하고 있습니다. 지원이 필요합니다!";
        Answer1[16] = "군을 증원하라.";
        Answer2[16] = "성문을 잠그라.";
        
        Money[17] = "minusSmall"; //부정: none
        Person[17] = "plusSmall"; //부정: minusSmall
        Army[17] = "none";
        Religion[17] = "none";
        Sentence[17] = "왕도에 학교를 건설해서 백성들을 계몽시킵시다!";
        Answer1[17] = "알겠다.";
        Answer2[17] = "아니된다.";
        
        Money[18] = "plusBig"; //부정: none
        Person[18] = "minusBig"; //부정: none
        Army[18] = "none";
        Religion[18] = "none";
        Sentence[18] = "폐하, 이건 제가 받치는 뇌물입니다.";
        Answer1[18] = "고맙다.";
        Answer2[18] = "아니된다.";
        
        Money[19] = "plusBig"; //부정: minusBig
        Person[19] = "minusBig"; //부정: none
        Army[19] = "minusBig"; //부정: minusBig
        Religion[19] = "minusBig"; //부정: none
        Sentence[19] = "동부의 재후가 다시 싸우기 시작했습니다. 이러는 동안에도 영주 지배 아래에 있는 백성들이 우리나라에 몰려옵니다! 막으십시오!";
        Answer1[19] = "받아들여라.";
        Answer2[19] = "국경을 봉쇄하라.";
        
        Money[20] = "minusSmall"; //부정: plusSmall
        Person[20] = "minusSmall"; //부정: minusSmall
        Army[20] = "minusSmall"; //부정: plusSmall
        Religion[20] = "none";
        Sentence[20] = "왕도에서 콜레라가 맹위를 흔들고 있습니다! 환자들을 처리하십시오!";
        Answer1[20] = "한자들을 처리하라.";
        Answer2[20] = "성문을 잠그라.";
        
        Money[21] = "plusBig"; //부정: minusBig
        Person[21] = "plusBig"; //부정: minusBig
        Army[21] = "plusBig"; //부정: minusBig
        Religion[21] = "plusBig"; //부정: minusBig
        Sentence[21] = "남쪽 왕국에 젋은 왕녀가 있는데, 거기서 폐하와 왕녀의 약혼을 요구하고 있습니다. 거절한다면 전쟁으로 번질 수 있습니다.";
        Answer1[21] = "알겠다.";
        Answer2[21] = "아니된다.";
        
        Money[22] = "none";
        Person[22] = "none";
        Army[22] = "minusSmall"; //부정: plusSmall
        Religion[22] = "plusSmall"; //부정: minusBig
        Sentence[22] = "술 취한 병사들이 수도원을 덮쳐, 갚비싼 물건들을 훔쳐 갔습니다. 폐하, 엄벌을 부탁드립니다!";
        Answer1[22] = "알겠다.";
        Answer2[22] = "아니된다.";
        
        Money[23] = "minusBig"; //부정: none
        Person[23] = "plusBig"; //부정: minusBig
        Army[23] = "none";
        Religion[23] = "none";
        Sentence[23] = "강이 또 바싹 말라버렸습니다. 부디 댐을 건설해 주세요.";
        Answer1[23] = "알겠다.";
        Answer2[23] = "아니된다.";
        
        Money[24] = "none";
        Person[24] = "plusBig"; //부정: minusBig
        Army[24] = "minusSmall"; //부정: plusSmall
        Religion[24] = "none";
        Sentence[24] = "무고한 젋은 시민들이 차례차례 학살당하고 있습니다. 부디 멈추어 주십시오.";
        Answer1[24] = "알겠다.";
        Answer2[24] = "아니된다.";
        
        Money[25] = "none";
        Person[25] = "none";
        Army[25] = "plusBig"; //부정: minusBig
        Religion[25] = "none";
        Sentence[25] = "이 나라의 병사들에겐 우수한 사령관이 필요합니다. 폐하는 저를 선택하셨습니다. 제발 제 조언에 귀를 기울여 주세요!";
        Answer1[25] = "알겠다.";
        Answer2[25] = "아니된다.";
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
