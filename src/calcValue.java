public class calcValue {
    public int money, person, army, religion = 50;

    public calcValue(int answer, int money, int person, int army, int religion) {
        if (answer == 1) {
            this.money = this.money + money;
            this.person = this.person + person;
            this.army = this.army + army;
            this.religion = this.religion + religion;
        } else if (answer == 2) {
            this.money = this.money - money;
            this.person = this.person - person;
            this.army = this.army - army;
            this.religion = this.religion - religion;
        }
    }

    public int getMoney() {
        return this.money;
    }

    public int getPerson() {
        return this.person;
    }

    public int getArmy() {
        return this.army;
    }

    public int getReligion() {
        return this.religion;
    }
}
