package Gym;

public class SistemRegister {
    public static void main(String[] args) {
        User basicUser = new User("Laura", "González", 107911231, 65.5, 1.68,new BasicPlan());
        User mediumUser = new User("Carlos", "Ramírez", 1077023123, 75.2, 1.75,new MediumPlan());
        User premiumUser = new User("Santiago", "polania", 1080321413, 60.0, 1.60,new PremiumPlan());

        System.out.println("Basic User:");
        basicUser.showInformation();
        System.out.println("");

        System.out.println("Medium User");
        mediumUser.showInformation();
        System.out.println("");

        System.out.println("Premium User");
        premiumUser.showInformation();
    }
}