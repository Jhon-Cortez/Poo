package newton;

public class FirstLaw extends LawNewton {
    @Override
    public void explicationLaw() {
        System.out.println("Newton's First Law: An object at rest or in uniform rectilinear motion will remain so unless acted upon by an external force");
    }

    @Override
    public void calculate() {
        System.out.println("Simulation: F = 0, the object maintains its state (rest or constant movement)");
    }
}