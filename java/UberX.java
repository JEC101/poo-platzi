class UberX extends Car {
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    @Override //POLIMORFISMO sobre-escribe método padre, agregado bran y modelo al print
    void printDataCar() {
        super.printDataCar();
        System.out.println("Modelo: " + model + " Marca: " + brand);
    }
}