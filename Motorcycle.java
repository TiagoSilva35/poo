class Motorcycle{
    String make;
    String color;
    boolean engineState;

    void startEngine(){
        if (engineState == true)
            System.out.println("The engine is already on.");
        else{
            engineState = true;
            System.out.println("The engine is now on.");
        }
    }
    void showAtts(){
        System.out.println("This motocycle is a "
         + color + " " + make);
        if (engineState)
            System.out.println("The engine is on.");
        else 
            System.out.println("The engine is off");
    }


    public static void main(String args[]){
        Motorcycle m = new Motorcycle();//1
        m.make = "Yamaha RZ350";//2
        m.color = "yellow";//3
        System.out.println("Calling showAtts...");//4
        m.showAtts();//5
        System.out.println("-------");
        System.out.println("Starting engine...");
        m.startEngine();
        System.out.println("-------");
        System.out.println("Calling showAtts");
        m.showAtts();
        System.out.println("-------");
        System.out.println("Starting engine");
        m.startEngine();
    }
}