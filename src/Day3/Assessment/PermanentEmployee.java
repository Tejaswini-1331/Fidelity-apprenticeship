package Day3.Assessment;

public class PermanentEmployee extends Employee {
    int pf;

    PermanentEmployee(int id, String name, float BasicSalary,int pf){
        super(id, name);
        this.pf=pf;
        this.BasicSalary=BasicSalary;
    }


    public float salary(){
        return netSalary = BasicSalary-pf;
    }

    public float getBonus(){
        if(pf<1000) {
            bonus=(float) 0.10*BasicSalary;
        }
        else if (pf>=1000 && pf<1500) {
            bonus= (float)1.15%BasicSalary;
        }
        else if (pf>=1500 && pf<1800) {
            bonus= (float)1.12%BasicSalary;
        }
        else  {
            bonus= (float)0.15*BasicSalary;
        }
        System.out.println(bonus);
        return bonus;
    }
     float b = getBonus();



    public void display(){
        super.display();

        System.out.println("NetSalary: "+netSalary+"\n");
        System.out.println("BasicSalary: "+BasicSalary+"\n");
        System.out.println("PF:" +pf);
        System.out.println("Bonus: " +b);
    }
}
