package Gym;

public class MediumPlan extends PlanGym {
    @Override
    public void ShowService() {
        System.out.println("Medium plan: General access + Guided classes.");
    }
    
    @Override
    public double calculate() {
        return 75000;
    }
}