package Day6.AssignmentMain;

public class LifeInsurance extends Insurance  {
    private int policyTerm;
    private float benefitPercent;

    public LifeInsurance(String InsuranceNo, String InsuranceName, double AmountCovered, int PolicyTerm, float BenefitPercent) {
        super(InsuranceNo, InsuranceName, AmountCovered);
        this.policyTerm = PolicyTerm;
        this.benefitPercent = BenefitPercent;
    }
    public void setPolicyTerm(int policyTerm) {
        this.policyTerm = policyTerm;
    }
    public int getPolicyTerm() {
        return policyTerm;
    }

    public void setBenefitPercent(float benefitPercent) {
        this.benefitPercent = benefitPercent;
    }
    public double calculatePremium(){
        return (getAmountCovered() -(getAmountCovered()*benefitPercent)/100)/policyTerm;
    }

}
