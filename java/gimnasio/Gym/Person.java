package Gym;

public abstract class Person {
    protected String name;
    protected String lastName;
    protected int identification;
    protected double weight;
    protected double tall;

    public Person(String name, String lastName, int identification, double weight, double tall) {

        this.name = name;
        this.lastName = lastName;
        this.identification = identification;
        this.weight = weight;
        this.tall = tall;
    }
    public String getName() {
        return this.name;
    }
    public String getLastName() {
        return this.lastName;
    }       
    public int getIdentification() {
        return this.identification;
    }
    public double getWeight() {
        return this.weight;
    }
    public double getTall() {
        return this.tall;
    }

    public abstract void showInformation();
}