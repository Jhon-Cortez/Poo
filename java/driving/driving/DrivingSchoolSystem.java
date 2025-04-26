package driving;

public class DrivingSchoolSystem {
    public static void main(String[] args) {
        Student studentA = new Student("David", "Parada", 1079123712, "calle 70 #23-2", "3006170543", "O+", new LicenseA());
        Student studentB = new Student("Maria", "Olaya", 1088123712, "Carrera 5 #23-78", "3148599455", "A-", new LicenseB());
        Student studentC = new Student("James", "Rodrigues", 108771238, "Calle 12 #2-3", "3125743061", "B+", new LicenseC());

        System.out.println("STUDENT A:");
        studentA.showInfo();
        System.out.println();

        System.out.println("STUDENT B:");
        studentB.showInfo();
        System.out.println();

        System.out.println("STUDENT C;");
        studentC.showInfo();
    }
}