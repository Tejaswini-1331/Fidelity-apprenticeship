package Day3.PracticeAssessment;

public class SmartTv extends MultimediaDevice{
    int screenSize;
    String smartFeatures;

    SmartTv(String brand,int model,int yearOfManufacture,int screenSize,String smartFeatures){
        super(brand,model,yearOfManufacture);
        this.screenSize = screenSize;
        this.smartFeatures = smartFeatures;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Screen Size: "+screenSize+" inches" + "Smart features: "+smartFeatures);
    }
    public void adjustments(){
        System.out.println("Adjusting volume in SmartTv");
    }
}
