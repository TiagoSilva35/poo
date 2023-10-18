class Data{
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public String toString(){
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}; 
        String txt =  String.join(" de ", Integer.toString(dia), meses[mes - 1], Integer.toString(ano));
        txt += "\n";
        return txt;
    }
}

public class Exe1 {
    public static void main(String[] args) {
        Data novaData = new Data(16, 10, 2023);
        String dataFormatada = novaData.toString();
        System.out.printf("%s", dataFormatada);
    }
}
