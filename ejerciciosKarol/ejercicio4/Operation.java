package ejerciciosKarol.ejercicio4;

public class Operation {
    private double num1;

    public Operation(double num1) {
        this.num1 = num1;
    }
    public double getNum1() {
        return num1;
    }
    public void Calculate(){
        num1 = Math.abs(num1);
        System.out.println("El valor absoluto de " + num1 + " es: " + num1);

    }
}
