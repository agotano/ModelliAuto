public class Auto {


    // attributi
    private String brand;
    private String model;
    private String color;
    private int numDoors;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //costruttori
    public Auto(String brand, String model, String color, int numDoors) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.numDoors = numDoors;
    }

    public Auto(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Auto(String color, int numDoors) {
        this.color = color;
        this.numDoors = numDoors;
    }

    public Auto(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = "verde";
    }

    //metodi
    public void start() {
        System.out.println(brand + " " + model + " " + numDoors + " " + "è partito");

    }

    public void stop() {
        System.out.println(brand + " " + model + " " + numDoors + " " + "si è fermata");
    }

    public void showInfo() {
        System.out.println("brand" + " " + brand);
        System.out.println("model" + " " + model);
        System.out.println("color" + " " + color);
        System.out.println("numDoors" + " " + numDoors);

    }
}
