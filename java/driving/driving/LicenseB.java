package driving;

public class LicenseB extends DrivingLicense {
    @Override
    public void showLicenseDetails() {
        System.out.println("License B: Private vehicle license. Duration: 1.5 months.");
    }

    @Override
    public double calculateCost() {
        return 300000;
    }
}