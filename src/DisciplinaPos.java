public class DisciplinaPos extends Disciplina{
    private String professor;
    
    public DisciplinaPos(String n, String c, String p){
        super(n,c);
        this.setProfessor(p);
    }
    public void setProfessor(String p){
        this.professor = p;
    }
    public String getProfessor(){
        return this.professor;
    }
}
    