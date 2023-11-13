public class Exe1 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno(2022216215, "Tiago");
        Docente docente = new Docente(1010101010, "João");
        System.out.println(aluno);
        System.out.println(docente);
        System.out.println(aluno.comunica());
        System.out.println(docente.comunica());
    }
}
