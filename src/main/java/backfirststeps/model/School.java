package backfirststeps.model;

import java.lang.Class;
import java.util.ArrayList;

public class School {
    private String nome;
    private String code;
    private ArrayList<Student> students;
    private ArrayList<Professor> professors;
    private ArrayList<Metter> metters;
    private ArrayList<Class> classes;
    private ArrayList<Notes> notes;

    public School(String nome, String code, ArrayList<Professor> professors, ArrayList<Metter> metters,
                  ArrayList<Notes> notes, ArrayList<Student> students, ArrayList<Class> classes) {
        this.nome = nome;
        this.code = code;
        this.professors = professors;
        this.metters = metters;
        this.notes = notes;
        this.students = students;
        this.classes = classes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Class> classes) {
        this.classes = classes;
    }

    public ArrayList<Metter> getMetters() {
        return metters;
    }

    public void setMetters(ArrayList<Metter> metters) {
        this.metters = metters;
    }

    public ArrayList<Notes> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Notes> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "School{" +
                "nome='" + nome + '\'' +
                ", code='" + code + '\'' +
                ", students=" + students +
                ", professors=" + professors +
                ", metters=" + metters +
                ", classes=" + classes +
                ", notes=" + notes +
                '}';
    }
}
