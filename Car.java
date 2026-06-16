public class Car {
    
    // Private fields
    private String brand;
    private int age;
    private String numberPlate;

    // Constructor
    public Car(String brand, int age, String numberPlate) {
        this.brand = brand;
        this.age = age;
        this.numberPlate = numberPlate;
    }

    // Accessors (Getters)
    public String getBrand() {
        return brand;
    }

    public int getAge() {
        return age;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    // Mutators (Setters)
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setAge(int age) {
        System.out.println("the age is ....");
        this.age = age;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    // toString method
    @Override
    public String toString() {
        return "Car [brand=" + brand +
               ", age=" + age +
               ", numberPlate=" + numberPlate + "]";
    }


}