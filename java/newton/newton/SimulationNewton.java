package newton;

public class SimulationNewton {
    public static void main(String[] args) {
        LawNewton ley1 = new FirstLaw();
        LawNewton ley2 = new SecondLaw(10, 2);
        LawNewton ley3 = new ThirdLaw();

        System.out.println("FIRST LAW");
        ley1.explicationLaw();
        ley1.calculate();

        System.out.println("SECOND LAW");
        ley2.explicationLaw();
        ley2.calculate();

        System.out.println("THIRD LAW");
        ley3.explicationLaw();
        ley3.calculate();
    }
}