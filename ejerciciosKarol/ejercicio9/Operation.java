package ejerciciosKarol.ejercicio9;

public class Operation {
    public double num;


    public Operation(double num) {
        this.num = num;
    }
    public double getNum() {
        return num;
    }


    public String Calculate(){
        String result;
        if (num%2 == 0) {
            result = "es par";
        } else {
            result = "es impar";
            
        }
        
        return result;
    }
    public String Calculate1(){
        String result2="";
        if (num<0) {
            result2 = "es negativo";
        } else if (num>=0) {
            result2 = "es positivo";
        }
        return result2;
    }
}
