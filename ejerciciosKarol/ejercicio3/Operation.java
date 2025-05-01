package ejerciciosKarol.ejercicio3;

public class Operation {
    private double num1;

    public Operation(double num1) {
        this.num1 = num1;
    }
    public double getNum1() {
        return num1;
    }
    public void Calculate(){
        double result = num1*num1;
        if (result >5000) {
            System.out.println("El resultado es mayor que 5000: " + result);
        } else if (result < 5000) {
            System.out.println("El resultado es menor que 5000: " + result);
        }
    }
}
