package ejerciciosKarol.ejercicio5;

public class Operation {
    private double num;

    public Operation(double num) {
        this.num = num;
    }
    public double getNum1(){
        return num;
    }

    public void calculate(){
        if (num>0) {
            System.out.println("El número es positivo.");
        } else if (num < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }
}
