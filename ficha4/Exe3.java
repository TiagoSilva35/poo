class Disciplina{
    private String nome;
    private int numeroAluno, NotaNormal, NotaRecurso, NotaEspecial;

    public Disciplina(String nome){
        this.nome = nome;
        NotaNormal = -1;
        NotaRecurso = -1;
        NotaEspecial = -1;
    }
    public Disciplina(String nome, int num){
        this(nome);
        numeroAluno = num;
    }
    public void setNotaNormal(int NotaNormal){this.NotaNormal = NotaNormal;}
    public void setNotaRecurso(int NotaRecurso){this.NotaRecurso = NotaRecurso;}
    public void setNotaEspecial(int NotaEspecial){this.NotaEspecial = NotaEspecial;}
    public int getNotaNormal(){return NotaNormal;}
    public int getNotaRecurso(){return NotaRecurso;}
    public int getNotaEspecial(){return NotaEspecial;}

    
    /** 
     * @return int
     */
    wpublic int melhorNota(){
        return Math.max(Math.max(NotaNormal, NotaEspecial), NotaRecurso);
    }
    public String toString(){
        String txt = "";
        txt += nome + " - Avaliação do aluno nº " + numeroAluno + "\n";
        txt += "Época Normal: " + NotaNormal + " valores" + "\n";
        txt += "Época Recurso: " + NotaRecurso + " valores" + "\n";
        txt += "Época Especial: " + NotaEspecial + " valores" + "\n";
        txt += "Melhor Nota: " + melhorNota() + " valores" + "\n";
        return txt;
    }
}

public class Exe3 {
    public static void main(String[] args) {
        String nome = "AM3";
        int numeroAluno = 1234;
        Disciplina novaDisciplina = new Disciplina(nome, numeroAluno);
        novaDisciplina.setNotaNormal(16);
        novaDisciplina.setNotaRecurso(17);
        novaDisciplina.setNotaEspecial(15);
        System.out.println(novaDisciplina);
    }
}
