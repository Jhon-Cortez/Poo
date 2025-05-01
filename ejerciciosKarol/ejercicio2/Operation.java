package ejerciciosKarol.ejercicio2;

public class Operation {
    private double num1;
    
    public Operation(double num1) {
        this.num1 = num1;
    }
    public double getNum1() {
        return num1;
    }

    public void calculate(){
        if (num1>5) {
            System.out.println("El número "+num1+" es mayor que 5");
        }else{
            System.out.println("El número "+num1+" es menor que 5");
    }
    }
}
