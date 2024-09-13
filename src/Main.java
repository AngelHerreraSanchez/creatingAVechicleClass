public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Vehicle("Ford", "Fusion");
        System.out.println(myCar.getMake());
        myCar.setMake("fart");
        System.out.println(myCar.getModel());
        myCar.setMake("bag");
    }


}
