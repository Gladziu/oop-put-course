public class Vehicle{
    private String model;
    private String carMake;
    private int carMileage;
    private boolean electric;

    public Vehicle(String model, String carMake, int carMileage, boolean electric){
        this.model = model;
        this.carMake = carMake;
        this.carMileage = carMileage;
        this.electric = electric;
    }

    
    public void print(){
        System.out.println("About car");
        System.out.println("model: " + model);
        System.out.println("make: " + carMake);
        System.out.println("mileage: " + carMileage);
        System.out.println("electric: " + electric);
    }
    
}

class main{
    public static void main(String[] args){
        Vehicle car = new Vehicle("astra", "Opel", 120000, false);
        car.print();
    }
}
