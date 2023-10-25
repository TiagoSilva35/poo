class Aluno extends Pessoa{
    private int numeroAluno;

    public Aluno(int numeroAluno, String nome){
        super(nome);
        this.numeroAluno = numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno){this.numeroAluno = numeroAluno;}
    public int getNumeroAluno(){return numeroAluno;}

    public String missao(){
        return "aprender";
    }
    public String toString(){
        return "O aluno com o número de aluno " + Integer.toString(numeroAluno) + " tem uma missão de " + missao() + "!"; 
    }
}
