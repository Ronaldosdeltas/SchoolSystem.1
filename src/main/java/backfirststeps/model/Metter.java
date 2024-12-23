package backfirststeps.model;

import java.util.ArrayList;

public class Metter {
    private String codigo;
    private ArrayList<Student> students;
    private Professor professor;
    private ArrayList<Notes> notas;

    public Metter(String codigo, ArrayList<Student> student, Professor professor, ArrayList<Notes> notas) {
        this.codigo = codigo;
        this.students = student;
        this.professor = professor;
        this.notas = notas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> student) {
        this.students = student;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Notes> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Notes> notas) {
        this.notas = notas;
    }
     public void addStudent(Student student){
        students.add(student);
     }
     public void removeStudent(Student student){
        students.remove(student);
     }
     public void removenota(Notes Notas){
        notas.remove(Notas);
     }
     public Student finStudent(String name, int id) {
         for (Student student : students) {
             if (student.getName().equals(name) && student.getId().equals(id)) {
                 return student;
             }
         }
         return null;

     }

    @Override
    public String toString() {
        return "Metter{" +
                "codigo='" + codigo + '\'' +
                ", students=" + students +
                ", professor=" + professor +
                ", notas=" + notas +
                '}';
    }
}
