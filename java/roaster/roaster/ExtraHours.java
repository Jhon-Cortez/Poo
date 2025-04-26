package roaster.roaster;

public class ExtraHours {
   private double dalyHours;
   private double nocturnalHours;
   private double holydayHours;
   private double valueHour = 6189;

   public ExtraHours(double dalyHours, double nocturnalHours, double holydayHours) {
       this.dalyHours = dalyHours;
       this.nocturnalHours = nocturnalHours;
       this.holydayHours = holydayHours;
   }
   public double getDalyHours() {
       return dalyHours;
   }
    public double getNocturnalHours() {
         return nocturnalHours;
    }
    public double getHolydayHours() {
         return holydayHours;
    }
    public double getValueHour() {
         return valueHour;
    }

    public double calculateTotalExtraHours(){
        dalyHours = valueHour * 1.25;
        nocturnalHours = valueHour * 1.75;
        holydayHours = valueHour * 2;
        return dalyHours + nocturnalHours + holydayHours;

    }
}
