package ejerciciosKarol.ejercicio7;

public class Operation {
    private double num;

    public Operation(double num) {
        this.num = num;
    }
    public double getNum() {
        return num;
    }
    public void Calculate(){
        if (num>50 && num<100) {
            System.out.println("El numero esta entre 50 y 100");
        }else {
            System.out.println("El numero no esta entre 50 y 100");
        }
    }
}
