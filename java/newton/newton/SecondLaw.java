package newton;

public class SecondLaw extends LawNewton {
    private double mass;
    private double aceleration;
    private double force;

    public SecondLaw(double mass, double aceleration) {
        this.mass = mass;
        this.aceleration = aceleration;
    }
    public double getMass() {
        return mass;
    }
    public double getAceleration() {
        return aceleration;
    }
    public double getForce() {
        return force;
    }
    @Override
    public void explicationLaw() {
        System.out.println("Second law of Newton: The force is equal to aceleration for force (F = m * a)");
    }

    @Override
    public void calculate() {
        double force = mass * aceleration;
        System.out.println("Simulation: F = " + mass + " * " + aceleration + " = " + force + " N");
    }
}