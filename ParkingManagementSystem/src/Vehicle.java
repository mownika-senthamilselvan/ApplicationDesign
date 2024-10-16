public class Vehicle {
    private static int vehicleId=0;
    private String licensePlate;
    private String vType;

    public Vehicle(String licensePlate, String vType) {
        this.licensePlate = licensePlate;
        this.vType = vType;
        vehicleId += vehicleId;
    }
}
