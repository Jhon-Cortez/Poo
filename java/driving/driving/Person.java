package driving;

public abstract class Person {
    protected String name;
    protected String lastName;
    protected int identification;
    protected String address;
    protected String phone;
    protected String bloodType;

    public Person(String name, String lastName, int identification, String address, String phone, String bloodType) {
        this.name = name;
        this.lastName = lastName;
        this.identification = identification;
        this.address = address;
        this.phone = phone;
        this.bloodType = bloodType;
    }

    public abstract void showInfo();
}