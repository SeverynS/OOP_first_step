public class Car {

    private String manufacturer;
    private String model;
    private String bodyType;
    private short transmission;
    private short gasType;

    private void going() {
        System.out.println(this.manufacturer + " " + this.model + " amazing car going to ...");
    }

    private void undergoingMaintenance() {
        System.out.println("The " + this.model + "car is on maintenance now");
    }

    private void horning() {
        System.out.println("Beeeeeep");
    }

    private void refueling() {
        System.out.println("The car is refuleing now");
    }

    private void breking(){
        System.out.println(this.model + " is breking now");
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public short getTransmission() {
        return transmission;
    }

    public void setTransmission(short transmission) {
        this.transmission = transmission;
    }

    public short getGasType() {
        return gasType;
    }

    public void setGasType(short gasType) {
        this.gasType = gasType;
    }
}
