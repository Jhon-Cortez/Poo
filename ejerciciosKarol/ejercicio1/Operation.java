package ejerciciosKarol.ejercicio1;

public class Operation {
    private double num1;
    
    public Operation(double num1) {
        this.num1 = num1;
    }
    public double getNum1() {
        return num1;
    }

    public void calculate(){
        for (int i = 2; i*i<=num1; i++){
            if(num1 % i ==0){
                 System.out.println("No es Primo");;
            }
        }
        System.out.println("Es primo");
        }
    }