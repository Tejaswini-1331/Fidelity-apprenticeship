package Day3.PracticeAssessment;

public class MultimediaDevice {
    String brand;
    int model;
    int yearOfManufacture;

    MultimediaDevice(String brand, int model,int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }
    public void displayInfo(){
        System.out.print("Brand: " + brand + " Model: " + model + " Year of Manufacture: " + yearOfManufacture);
        System.out.println("");
    }
}
