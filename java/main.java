class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        UberX uberX = new UberX("AMQ123", new Account("Juan Carlos", "AND123"), "Chevrolet", "Cruze");
        uberX.setPassenger(3);
        uberX.printDataCar();

        // Car car2 = new Car("QWE567", new Account("Andres Herrera", "ANSA876"));
        // car2.passenger = 3;
        // car2.printDataCar();
    }
}