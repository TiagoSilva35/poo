class Fracao{

    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public void setNumerador(int numerador){this.numerador = numerador;}  
    public void setDenominador(int denominador){this.denominador = denominador;}
    public int getNumerador(){return numerador;}
    public int getDenominador(){return denominador;}

    private int mdc (int a, int b){
        if (a == 0) return b;
        if (b == 0) return a;
        return mdc(Math.min(a,b), Math.max(a,b) % Math.min(a,b));
    } 
    private int mmc (int a, int b){
        return a*b/mdc(a,b);
    }
    public Fracao sum (Fracao b){
        if (this.denominador == b.denominador){
            return new Fracao(this.numerador + b.numerador, denominador);
        }
        else{
            int tempMmc = mmc(this.denominador, b.denominador);
            int novoNumerador = this.numerador * b.denominador + b.numerador * this.denominador;
            return new Fracao(novoNumerador, tempMmc);
        }
    }
    public Fracao sub (Fracao b){
        if (this.denominador == b.denominador){
            return new Fracao(this.numerador - b.numerador, denominador);
        }
        else{
            int tempMmc = mmc(this.denominador, b.denominador);
            int novoNumerador = this.numerador * b.denominador - b.numerador * this.denominador;
            return new Fracao(novoNumerador, tempMmc);
        }        
    }
    public Fracao mul (Fracao b){
        return new Fracao(this.numerador * b.numerador, this.denominador * b.denominador);
    }
    public Fracao div (Fracao b){
        return mul(new Fracao(b.denominador, b.numerador));
    }
    public void printFracao(){
        System.out.println("Fracao: " + this.numerador + " / " + this.denominador + "\n");
    }
}


public class Exe4 {
    public static void main(String[] args) {
        Fracao fracao1 = new Fracao(1, 2);
        Fracao fracao2 = new Fracao(2, 3);
        Fracao fracaoResultados = fracao1.sum(fracao2);
        System.out.printf("Soma -> ");
        fracaoResultados.printFracao();
        fracaoResultados = fracao1.sub(fracao2);
        System.out.printf("Subtração -> ");
        fracaoResultados.printFracao();
        fracaoResultados = fracao1.mul(fracao2);
        System.out.printf("Multiplicação -> ");
        fracaoResultados.printFracao();
        fracaoResultados = fracao1.div(fracao2);
        System.out.printf("Divisão -> ");
        fracaoResultados.printFracao();
    }
}
