public class driver {
    public static void main(String[] args){
        Car myCar = new Car(); //car name er object creation, new keyword use kore object create kora hoy 
        //Car is a class, myCar is a reference variable, new Car() is an new instance(object)
        //Car() is a constructor of the Car class...class & constructor name Same hoy
        // to access the 'new Car()' object, we use the reference variable 'myCar'.
        // 'myCar',a reference variable of type 'Car' class, stores the memory address of the 'new Car()' object.
        // new Car(): This part creates a new instance (object) of the Car class. The new keyword is used to allocate..
        // ..memory for the new object, and Car() calls the constructor of the Car class to initialize the object.
        // 'new' dynamic memory allocation, 'Car()' constructor call
        // myCar.addFuel(6);
        // myCar.drive();
        // System.out.println("Current fuel level: " + myCar.getCurrentFuelLevel());
        // myCar.drive();
        // myCar.drive();
        // myCar.drive();
        // System.out.println("Current fuel level: " + myCar.getCurrentFuelLevel());
        myCar.start().drive();
        System.err.println("myCar has " + myCar.noOfSeats + " seats");
        System.out.println();

        Car tigor = new Car();
        tigor.addFuel(6);
        // tigor.start(); // to call drive method, we are using the object 'tigor' of the class 'Car'
        // tigor.drive(); // so in the 'car'class, if we return the objct itself, we can call the methods
                          // one after another
        tigor.start().drive();
        System.err.println("tigor has " + tigor.noOfSeats + " seats");
        System.out.println();

        // Importance of "This" keyword
        // This keyword is used to refer to the current class instance variable (object)
        // In Java, the keyword "this" is used to refer to the current instance of a class. It is typically used to distinguish between instance variables and local variables that have the same name.


        This newThis = new This();
        newThis.decreaseFuelLevel();
    }
}
