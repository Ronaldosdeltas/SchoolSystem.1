package backfirststeps.model;

import java.util.ArrayList;

public class Cless {
    private String name;
    private String code;
    private ArrayList<Metter> metters;
    private ArrayList<Professor> professors;
    private ArrayList<Student> students;

    public Cless(String name, String code, ArrayList<Professor> professors, ArrayList<Metter> metters,
                 ArrayList<Student> students) {
        this.name = name;
        this.code = code;
        this.professors = professors;
        this.metters = metters;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<Metter> getMetters() {
        return metters;
    }

    public void setMetters(ArrayList<Metter> metters) {
        this.metters = metters;
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

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", metters=" + metters +
                ", professors=" + professors +
                ", students=" + students +
                '}';
    }
}
