import java.util.Random;

public class useScript {
    Random random = new Random();
    int ID = random.nextInt(100) + 1;
    // * 스크립트 1번은 반드시 새로운 왕 즉위시 사용
    // * 1~100 까지의 숫자 랜덤 연산

    getScript gets = new getScript();
    Script script = new Script();

    int money = gets.returnMoney(script.getMoney(ID));
    int person = gets.returnPerson(script.getPerson(ID));
    int army = gets.returnArmy(script.getArmy(ID));
    int religion = gets.returnReligion(script.getReligion(ID));
    String setence = script.getSentence(ID);
    String Answer1 = script.getAnswer1(ID);
    String Answer2 = script.getAnswer2(ID);

}
