import java.lang.Math;

class Angulo{
   private double graus;

   public Angulo(){this.graus = 0.0;}

   public Angulo(double graus){
      this.graus = graus;
   }
   
   /** 
    * @param graus
    */
   public void setGraus(double graus){
      this.graus = graus;
   }
   public double getGraus(){
      return graus;
   }
   public String toString(){
      String txt = "";
      txt = String.join(" ", "Ângulo", "de", Double.toString(graus), "graus"); 
      return txt;
   }
   public Angulo add(Angulo ang){
      double soma = this.graus + ang.getGraus();
      return new Angulo(soma % 360);
   }
   public Angulo sub(Angulo ang){
      double sub = this.graus - ang.getGraus();
      return new Angulo(sub % 360);
   }
   public double radianos(){
      return Math.toRadians(this.graus);
   }
   public boolean equals(Angulo ang){
      return (this.radianos() == ang.radianos());
   }
   public double sin(){
      return Math.sin(this.graus);
   }
   public double cos(){
      return Math.cos(this.graus);
   }
   public double tan(){
      return Math.tan(this.graus);
   }
}

public class Exe2 {
   public static void main(String[] args) {
      Angulo angulo1 = new Angulo(0);
      Angulo angulo2 = new Angulo(Math.PI/4);
      /*String output_angulo1 = angulo1.toString();
      String output_angulo2 = angulo2.toString();
      System.out.println(output_angulo1);
      System.out.println(output_angulo2);
      Angulo sum = angulo1.add(angulo2);
      Angulo dif = angulo1.sub(angulo2);
      String outputSum = sum.toString();
      String outputDif = dif.toString();
      System.out.println(outputSum);
      System.out.println(outputDif);
      System.out.println(angulo2.radianos());*/
      boolean flag = angulo2.equals(angulo1);
      System.out.println("Os Ângulos são iguais? " + (flag ? "Sim" : "Não"));
      Angulo sum = angulo1.add(angulo2);
      if (sum.sin() == sum.cos()){
         if (sum.sin() == sum.tan()){
            System.out.println("Sin, cos e tan do ângulo soma são iguais");
            return;
         }
         else{
            System.out.println("Sin e cos iguais, tangente diferente");
            return;
         }
      }
      else{
         if (sum.sin() == sum.tan()){
            System.out.println("Sin e tan iguais");
            return;
         }
         else if (sum.cos() == sum.tan()){
            System.out.println("Cos e tan iguais");
            return; 
         }
      }
      System.out.println("Sin, cos e tan diferentes");
   }
}
