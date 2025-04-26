package Gym;

public class BasicPlan extends PlanGym {
    @Override
    public void ShowService() {
        System.out.println("Basic Plan: Acces to general instalations");
    }

    @Override
    public double calculate() {
        return 50000;
    }
}