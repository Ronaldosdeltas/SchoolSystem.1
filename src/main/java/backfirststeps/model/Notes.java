package backfirststeps.model;

import java.util.ArrayList;

public class Notes {
    private String codigo;
    private ArrayList<Professor> professors;
    private ArrayList<Student> students;
    private ArrayList<Metter> metters;

    public Notes(String codigo, ArrayList<Professor> professors, ArrayList<Student> students, ArrayList<Metter> metters) {
        this.codigo = codigo;
        this.professors = professors;
        this.students = students;
        this.metters = metters;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(ArrayList<Professor> professors) {
        this.professors = professors;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Metter> getMetters() {
        return metters;
    }

    public void setMetters(ArrayList<Metter> metters) {
        this.metters = metters;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "codigo='" + codigo + '\'' +
                ", professors=" + professors +
                ", students=" + students +
                ", metters=" + metters +
                '}';
    }
}
