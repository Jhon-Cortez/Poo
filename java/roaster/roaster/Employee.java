package roaster.roaster;
public class Employee {
    private String name;
    private String lastName;
    private double identification;
    private double baseSalary;
    private int riskLevel;
    //private ExtraHours extraHours;
    private Deduction deduction;
    private double SMMLV = 1423500;

    public Employee(String name, String lastName, double identification, double baseSalary, int riskLevel /*ExtraHours extraHours*/) {
        this.name = name;
        this.lastName = lastName;
        this.identification = identification;
        this.baseSalary = baseSalary;
        this.riskLevel = riskLevel;
        this.deduction = new Deduction(baseSalary, riskLevel);
    }
    public String getName() {
        return this.name;
    }
    public String getLastName() {
        return this.lastName;
    }
    public double getIdentification() {
        return this.identification;
    }
    public double getBaseSalary() {
        return this.baseSalary;
    }
    public int getRiskLevel() {
        return this.riskLevel;
    }
    public double calculateTotalSalary() {
        if (baseSalary > SMMLV*2 ) {
             baseSalary = baseSalary + SMMLV;
        }
        //double calculateTotalExtraHours = extraHours.calculateTotalExtraHours();
        double calculateTotalDeductions = deduction.calculateTotalDeductions();
        return baseSalary /*calculateTotalExtraHours */- calculateTotalDeductions;
    }
    public void inf(){
        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + lastName);
        System.out.println("Identificacion: " + identification);
        System.out.println("Salario Base: " + baseSalary);
        System.out.println("Nivel de Riesgo: " + riskLevel);
        System.out.println("Salario Total: " + calculateTotalSalary());
    }
}
