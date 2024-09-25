package Day3.PracticeAssessment;

public class BasicMediaPlayer extends MultimediaDevice{
    String supportedFormats;

    BasicMediaPlayer(String brand,int model,int yearOfManufacture,String supportedFormats)
    {
        super(brand,model,yearOfManufacture);
        this.supportedFormats=supportedFormats;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println(supportedFormats);
    }
    public void play(){
        System.out.println("playing music");
    }
}
