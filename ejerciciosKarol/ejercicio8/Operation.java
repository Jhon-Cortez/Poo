package ejerciciosKarol.ejercicio8;

public class Operation {
    private double num;

    public Operation(double num) {
        this.num = num;
    }
    public double getNum() {
        return num;
    }
    public void Calculate(){
        if (num%2 == 0) {
            System.out.println("El número " + num + " es par.");
        } else {
            System.out.println("El número " + num + " es impar.");
            
        }
    }
}
