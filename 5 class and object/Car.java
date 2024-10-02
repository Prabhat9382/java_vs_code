public class Car {
   
    int noOfWheels; // instance properties/ variables
    String color;
    float maxSpeed;
    float cureentFuelLevel;
    int noOfSeats;
    Car() {
        noOfWheels = 4;
        color = "Black";
        maxSpeed = 120;
        cureentFuelLevel = 4;
        noOfSeats = 5;
    }
    public Car start() {
        if(cureentFuelLevel == 0){
            System.err.println("Tel nahi hain");
        } else if(cureentFuelLevel < 5){
            System.err.println("Car has low fuel..tel de de bhai");
            cureentFuelLevel--;
        } else {
            System.err.println("Car Starts");
            cureentFuelLevel--;
        }
        return this;
    }
    public void drive(){ // instance method
        System.err.println("Car is moving");
        this.cureentFuelLevel--;
    }
    public void addFuel(float cureentFuelLevel){
         this.cureentFuelLevel += cureentFuelLevel; // this keyword is used to refer to the current class instance variable
    }
     // If you omit the "this" keyword in this line, the code would still compile and run, assuming there is no local variable with the same name `currentFuelLevel` in the method or block where this code is located. However, it is considered a good practice to use "this" to make the code more readable and to avoid any potential confusion.

    public float getCurrentFuelLevel() {
        return cureentFuelLevel;
    }
}
