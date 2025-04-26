package driving;

public class LicenseA extends DrivingLicense {
    @Override
    public void showLicenseDetails() {
        System.out.println("License A: Motorcycle license. Duration: 1 month.");
    }

    @Override
    public double calculateCost() {
        return 200000;
    }
}