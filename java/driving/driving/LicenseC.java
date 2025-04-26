package driving;

public class LicenseC extends DrivingLicense {
    @Override
    public void showLicenseDetails() {
        System.out.println("License C: Public service vehicle license. Duration: 2 months.");
    }

    @Override
    public double calculateCost() {
        return 400000;
    }
}