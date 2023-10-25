class Docente extends Pessoa {
    private int numeroMecanográfico;

    public Docente(int numeroMecanográfico, String nome){
        super(nome);
        this.numeroMecanográfico = numeroMecanográfico;
    }
    public String missao(){
        return "ensinar";
    }
    public String toString(){
        return "O docente com o número mecanográfico " + Integer.toString(numeroMecanográfico) + " tem uma missão de " + missao() + "!"; 
    }
}
