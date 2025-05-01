package ejerciciosKarol.ejercicio6;

public class Operation {
    private double num;

    public Operation(double num) {
        this.num = num;
    }
    public double getNum() {
        return num;
    }

    public void calculate(){
        if (num > 200) {
            System.out.println("El número es mayor que 200.");
        } else if (num < 200) {
            System.out.println("El número es menor que 200.");
        } else {
            System.out.println("El número es igual a 200.");
            
        }
    }
}
