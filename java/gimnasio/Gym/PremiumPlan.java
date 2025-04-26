package Gym;

public class PremiumPlan extends PlanGym {
    @Override
    public void ShowService() {
        System.out.println("Premium Plan: Full access + Personal trainer + Wet area.");
    }

    @Override
    public double calculate() {
        return 100000;
    }
}