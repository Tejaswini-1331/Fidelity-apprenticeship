package Day3.Assessment;

public class TemporaryEmployee extends Employee {
    int dailyWages;
    int noOfDays;

    TemporaryEmployee(int id, String name, int dailyWages, int noOfDays) {
        super(id, name);
        this.dailyWages = dailyWages;
        this.noOfDays = noOfDays;
    }

    public float salary(){
        return netSalary= dailyWages * noOfDays;
    }

    public float getBonus(){
    if(dailyWages<1000) {
        this.bonus= (15/100)*netSalary;
    }
        else if (dailyWages>=1000 && dailyWages<1500) {
        this.bonus= (12/100)*netSalary;
    }
        else if (dailyWages>=1500 && dailyWages<1750) {
        this.bonus= (12/100)*netSalary;
    }
        else  {
        this.bonus=(8/100)*netSalary;
    }
        return this.bonus;
    }

    float b = getBonus();


    @Override
    public void display() {
        super.display();
        System.out.println("Daily Wages: " + dailyWages);
        System.out.println("No. of Days: " + noOfDays);
        System.out.println("Net salary : " + netSalary);
        System.out.println("Bonus" +b);
    }

}
