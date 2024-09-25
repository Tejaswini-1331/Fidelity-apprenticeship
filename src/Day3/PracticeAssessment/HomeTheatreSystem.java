package Day3.PracticeAssessment;

public class HomeTheatreSystem extends SmartTv{
    int soundSurround;
    String subWoofer;

    HomeTheatreSystem(String brand,int model,int yearOfManufacture,int screenSize,String smartFeatures,int soundSurround,String subWoofer)
    {
        super(brand,model,yearOfManufacture,screenSize,smartFeatures);
        this.soundSurround=soundSurround;
        this.subWoofer=subWoofer;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("  Sound Surround: "+soundSurround +" dbps" +" Sub Woofer " + subWoofer);
    }

    public void adjustment(){
        System.out.println("Adjusting volume on Home Theatre System");
    }

    public void changeChannel(){
        System.out.println("Changing channel on Home Theatre System");
    }

    public void bass(){
        System.out.println("Changing bass on Home Theatre System");
    }

    public void tremblel(){
        System.out.println("Changing tremble on Home Theatre System");
    }
}
