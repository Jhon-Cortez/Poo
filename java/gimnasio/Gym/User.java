package Gym;

public class User extends Person {
    private PlanGym plan;

    public User(String name, String lastName, int identification, double weight, double tall, PlanGym plan) {
        super(name, lastName, identification, weight, tall);
        this.plan = plan;
    }
    public PlanGym getPlan() {
        return this.plan;
    }

    @Override
    public void showInformation() {
        System.out.println("User: " + name + " " + lastName);
        System.out.println("Identification: " + identification);
        System.out.println("Weigth: " + weight + " kg");
        System.out.println("Tall: " + tall + " m");
        plan.ShowService();
        System.out.println("Price plan: $" + plan.calculate());
    }
}