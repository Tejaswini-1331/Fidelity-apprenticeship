package Day6.AssignmentMain;

public class MotorInsurance extends Insurance {
    private double idv;
    private float depPercent;

    MotorInsurance( String InsuranceNo, String InsuranceName, double AmountCovered, float DepPercent) {
        super(InsuranceNo, InsuranceName, AmountCovered);

        this.depPercent = DepPercent;
    }

    public void setIdv(double Idv) {
        this.idv = Idv;
    }

    public void setDepPercent(float DepPercent) {
        this.depPercent = DepPercent;
    }
    public double getIdv() {
        return idv;
    }
    public float getDepPercent() {
        return depPercent;
    }

    public double calculatePremium(){
        idv = getAmountCovered() - ((getAmountCovered()*depPercent)/100);
        return idv*0.03;
    }
}
