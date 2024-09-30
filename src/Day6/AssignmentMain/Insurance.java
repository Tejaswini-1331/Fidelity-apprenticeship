package Day6.AssignmentMain;

public class Insurance {
    private String insuranceNo;
    private String insuranceName;
    private double amountCovered;

    Insurance(String InsuranceNo, String InsuranceName, double AmountCovered) {
        this.insuranceNo = InsuranceNo;
        this.insuranceName = InsuranceName;
        this.amountCovered = AmountCovered;
    }

    public void setInsuranceNo(String InsuranceNo) {
        this.insuranceNo = InsuranceNo;
    }

    public String getInsuranceNo(){
        return insuranceNo;
    }
    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }
    public String getInsuranceName(){
        return insuranceName;
    }
    public void setAmountCovered(double amountCovered) {
        this.amountCovered = amountCovered;
    }
    public double getAmountCovered(){
        return amountCovered;
    }
}
