package newton;

public class ThirdLaw extends LawNewton {
    @Override
    public void explicationLaw() {
        System.out.println("Newton's Third Law: To every action there is an equal and opposite reaction");
    }

    @Override
    public void calculate() {
        System.out.println("Simulation: If you apply a force to the right, a reaction to the left with equal magnitude is generated.");
    }
}