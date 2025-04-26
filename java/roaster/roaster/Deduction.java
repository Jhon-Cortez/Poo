package roaster.roaster;

public class Deduction {
    private double baseSalary;
    private int riskLevel;

    public Deduction(double baseSalary, int riskLevel) {
        this.baseSalary = baseSalary;
        this.riskLevel = riskLevel;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public int getRiskLevel() {
        return riskLevel;
    }
    public double calculateArl() {
        double arl = 0;
        if (riskLevel == 1) {
            arl = baseSalary * 0.04;
        } else if (riskLevel == 2) {
            arl = baseSalary * 0.03;
        } else if (riskLevel == 3) {
            arl = baseSalary * 0.02;
        } else if (riskLevel == 4) {
            arl = baseSalary * 0.01;
        }
        return arl;
    }
    public double calculateTotalDeductions() {
        double arl = calculateArl();
        double pension = baseSalary * 0.04;
        double health = baseSalary * 0.04;
        return arl + pension + health;
    }
}
