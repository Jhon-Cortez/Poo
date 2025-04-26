package driving;

public class Student extends Person {
    private DrivingLicense license;

    public Student(String name, String lastName, int identification, String address, String phone, String bloodType, DrivingLicense license) {
        super(name, lastName, identification, address, phone, bloodType);
        this.license = license;
    }

    @Override
    public void showInfo() {
        System.out.println("Student: " + name + " " + lastName);
        System.out.println("ID: " + identification);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Blood Type: " + bloodType);
        license.showLicenseDetails();
        System.out.println("Total cost: $" + license.calculateCost());
    }
}