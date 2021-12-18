
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
        
        Money[26] = "minusSmall"; //부정: none
        Person[26] = "none";
        Army[26] = "none";
        Religion[26] = "none"; //부정: plusSmall
        Sentence[26] = "왕비께서 큰 병에 걸리셨습니다. 뛰어난 의사를 찾아야합니다.";
        Answer1[26] = "얼른 찾거라.";
        Answer2[26] = "기도하며 기다리면 나을 것이다.";
        
        Money[27] = "none";
        Person[27] = "plusSmall"; //부정: none
        Army[27] = "plusBig"; //부정: minusSmall
        Religion[27] = "none";
        Sentence[27] = "군사들의 기강이 헤이해지고 있습니다. 훈련 강도를 올려야합니다!";
        Answer1[27] = "알겠다.";
        Answer2[27] = "아니된다.";
        
        Money[28] = "none";
        Person[28] = "plusSmall"; //부정: minusSmall
        Army[28] = "plusSmall"; //부정: none
        Religion[28] = "none";
        Sentence[28] = "전설의 검을 손에 얻었습니다. 뛰어난 장군에게 하사하여 영웅으로 만드십시오!";
        Answer1[28] = "알겠다.";
        Answer2[28] = "아니된다.";
        
        Money[29] = "minusSmall"; //부정: none
        Person[29] = "minusSmall"; //부정: none
        Army[29] = "plusBig"; //부정: none
        Religion[29] = "none";
        Sentence[29] = "다른 나라에서 쳐들어온다는 소식이 들렸습니다. 대장간을 늘려 전쟁을 준비합시다!";
        Answer1[29] = "알겠다.";
        Answer2[29] = "아니된다.";
        
        Money[30] = "plusBig"; //부정: none
        Person[30] = "plusSmall"; //부정: minusSmall
        Army[30] = "none";
        Religion[30] = "none";
        Sentence[30] = "곧 겨울이 닥칩니다. 식량을 비축합시다!";
        Answer1[30] = "알겠다.";
        Answer2[30] = "아니된다.";
        
        Money[31] = "none";
        Person[31] = "plusSmall"; //부정: minusSmall
        Army[31] = "plusSmall"; //부정: minusSmall
        Religion[31] = "none";
        Sentence[31] = "군인들이 도박을 하다 적발되었습니다. 엄벌을 내려주세요!";
        Answer1[31] = "알겠다.";
        Answer2[31] = "아니된다.";
        
        Money[32] = "plusSmall"; //부정: none
        Person[32] = "none";
        Army[32] = "minusSmall"; //부정: plusSmall
        Religion[32] = "none";
        Sentence[32] = "병사들이 호랑이를 잡아 가죽을 가져왔습니다. 압수해서 팔아 돈을 법시다!";
        Answer1[32] = "알겠다.";
        Answer2[32] = "아니된다.";
        
        Money[33] = "plusSmall"; //부정: none
        Person[33] = "plusSmall"; //부정: minusSmall
        Army[33] = "minusSmall"; //부정: none
        Religion[33] = "none";
        Sentence[33] = "늑대무리를 발견했습니다. 안전을 위해 처치합시다!";
        Answer1[33] = "알겠다.";
        Answer2[33] = "아니된다.";
        
        Money[34] = "none";
        Person[34] = "none";
        Army[34] = "none";
        Religion[34] = "plusSmall"; //부정: minusBig
        Sentence[34] = "이교도가 나타나 혼란을 일으키고 있습니다! 전부 내쫒아버립시다!";
        Answer1[34] = "알겠다.";
        Answer2[34] = "아니된다.";
        
        Money[35] = "plusBig"; //부정: none
        Person[35] = "none";
        Army[35] = "minusSmall"; //부정: none
        Religion[35] = "none";
        Sentence[35] = "모험가가 새로운 섬을 발견했습니다! 얼른 군대를 투입해 우리땅으로 만듭시다!";
        Answer1[35] = "알겠다.";
        Answer2[35] = "아니된다.";
        
        Money[36] = "minusSmall"; //부정: none
        Person[36] = "none";
        Army[36] = "none";
        Religion[36] = "plusSmall"; //부정: none
        Sentence[36] = "음유시인이 나타나 백성들을 즐겁게 해주고 있습니다. 왕성과 중앙교회로도 불러들입시다!";
        Answer1[36] = "알겠다.";
        Answer2[36] = "아니된다.";
        
        Money[37] = "plusSmall"; //부정: none
        Person[37] = "none";
        Army[37] = "minusSmall"; //부정: none
        Religion[37] = "none";
        Sentence[37] = "나라가 평화로우니 군인의 수를 줄입시다.";
        Answer1[37] = "알겠다.";
        Answer2[37] = "아니된다.";
        
        Money[38] = "plusBig"; //부정: none
        Person[38] = "none";
        Army[38] = "none";
        Religion[38] = "none";
        Sentence[38] = "큰 상인이 와서 보물을 바칩니다. 받아들이겠습니까?";
        Answer1[38] = "알겠다.";
        Answer2[38] = "아니된다.";
        
        Money[39] = "none";
        Person[39] = "plusSmall"; //부정: minusBig
        Army[39] = "plusSmall"; //부정: none
        Religion[39] = "plusSmall"; //부정: none
        Sentence[39] = "지나가던 여행자가 왕자님을 모욕했습니다. 처벌하시겠습니까?";
        Answer1[39] = "처벌하라.";
        Answer2[39] = "보내주거라.";
        
        Money[40] = "none";
        Person[40] = "plusBig"; //부정: minusBig
        Army[40] = "minusSmall"; //부정: none
        Religion[40] = "minusSmall"; //부정: plusSmall
        Sentence[40] = "수도에서 마녀사냥이 이루어지고 있습니다! 조치를 취해주십시오!";
        Answer1[40] = "멈추게 하거라.";
        Answer2[40] = "내버려 두거라.";
        
        Money[41] = "minusSmall"; //부정: plusSmall
        Person[41] = "none";
        Army[41] = "none";
        Religion[41] = "none";
        Sentence[41] = "윌리엄 공을 영주로 임명해, 그 땅을 고치게 하는 건 어떻습니까? 물론 그만한 대가도 지불하게 하죠";
        Answer1[41] = "알겠다.";
        Answer2[41] = "아니된다.";
        
        Money[42] = "plusSmall"; //부정: minusSmall
        Person[42] = "none";
        Army[42] = "none";
        Religion[42] = "none";
        Sentence[42] = "우리 상인 길드가 상거래를 통제한 덕에, 우리 나라 경제가 성장했습니다. 중앙 은행을 설립합시다";
        Answer1[42] = "알겠다.";
        Answer2[42] = "아니된다.";
        
        Money[43] = "plusSmall"; //부정: minusSmall
        Person[43] = "plusSmall"; //부정: minusSmall
        Army[43] = "plusSmall"; //부정: minusSmall
        Religion[43] = "plusSmall"; //부정: minusSmall
        Sentence[43] = "이 나라는 대단히 궁핍하고 빈약합니다. 저의 친절한 친구가 원조를 제공하겠다합니다. 대가는 일절 요구하지 않고요.";
        Answer1[43] = "알겠다.";
        Answer2[43] = "아니된다.";
        
        Money[44] = "plusSmall"; //부정: minusSmall
        Person[44] = "plusSmall"; //부정: minusSmall
        Army[44] = "none";
        Religion[44] = "none";
        Sentence[44] = "왕도에서 폭발이 일어났습니다! 자세한 것은 모르겠습니다만, 신중을 가해 거리의 문을 폐쇄할까요?";
        Answer1[44] = "알겠다.";
        Answer2[44] = "아니된다.";
        
        Money[45] = "none";
        Person[45] = "none";
        Army[45] = "minusSmall"; //부정: plusSmall
        Religion[45] = "none";
        Sentence[45] = "적군이 투석기로 성벽을 공격해 옵니다!";
        Answer1[45] = "공격하라.";
        Answer2[45] = "방어를 굳혀라.";
        
        Money[46] = "none";
        Person[46] = "none";
        Army[46] = "plusSmall"; //부정: minusSmall
        Religion[46] = "none";
        Sentence[46] = "새로운 장군을 임명하지 않으면, 지금 쳐들어오는 적군을 억제할 수 없을 것입니다.";
        Answer1[46] = "알겠다.";
        Answer2[46] = "아니된다.";
        
        Money[47] = "none";
        Person[47] = "plusSmall"; //부정: minusSmall
        Army[47] = "minusSmall"; //부정: plusSmall
        Religion[47] = "none";
        Sentence[47] = "폐하, 비상사태 선언을 하셔야합니다, 테러 공격에 대처하려면 이제 이것밖에 없습니다!";
        Answer1[47] = "알겠다.";
        Answer2[47] = "아니된다.";
        
        Money[48] = "none";
        Person[48] = "plusSmall"; //부정: minusSmall
        Army[48] = "none";
        Religion[48] = "none";
        Sentence[48] = "아이들이 늑대에게 습격을 당했습니다. 우리들(백성) 만으로 퇴치해도 괜찮을까요?";
        Answer1[48] = "내가 퇴치해주지.";
        Answer2[48] = "또 농담하는군.";
        
        Money[49] = "none";
        Person[49] = "none";
        Army[49] = "plusSmall"; //부정: minusSmall
        Religion[49] = "none";
        Sentence[49] = "동부의 야만인들이 국경에 다가오고 있습니다! 방어를 다져야 합니다!";
        Answer1[49] = "알겠다.";
        Answer2[49] = "아니된다.";
        
        Money[50] = "none";
        Person[50] = "plusSmall"; //부정: minusSmall
        Army[50] = "none";
        Religion[50] = "none";
        Sentence[50] = "광산의 광부들이 임금 인상을 요구하며, 일하려 들지 않습니다.";
        Answer1[50] = "인상하겠노라.";
        Answer2[50] = "그렇게는 못하겠노라.";
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
