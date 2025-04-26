package roaster.roaster;

public class Roaster {
    public static void main(String[] args) {
        ExtraHours extraHours = new ExtraHours(2,2,2);
        Employee employee = new Employee("John", "Doe", 123456789, 3000000, 2, null);

        employee.inf();
    }
}
