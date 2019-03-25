public class Car {
    private String Model;
    private String Manufacturer;
    private String Transmission;
    private String FuelType;
    private String Wheel;

    public Car(String model, String manufacturer, String transmission, String fuelType, String wheel) {
        Model = model;
        Manufacturer = manufacturer;
        Transmission = transmission;
        FuelType = fuelType;
        Wheel = wheel;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getTransmission() {
        return Transmission;
    }

    public void setTransmission(String transmission) {
        Transmission = transmission;
    }

    public String getFuelType() {
        return FuelType;
    }

    public void setFuelType(String fuelType) {
        FuelType = fuelType;
    }

    public String getWheel() {
        return Wheel;
    }

    public void setWheel(String wheel) {
        Wheel = wheel;
    }

    public String toString() {
        return  this.getModel() + " "+ this.getManufacturer()+ " "+ this.getTransmission()+ " "+ this.getWheel()+ " "+ this.getFuelType();
    }
}