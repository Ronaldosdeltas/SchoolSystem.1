package backfirststeps;

import backfirststeps.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("Ronaldoss",1 );
        Student student2 = new Student("Ronaldoss",2 );
        Student student3 = new Student("Ronaldoss",3 );
        Student student4 = new Student("Ronaldoss",4 );
        Student student5 = new Student("Ronaldoss",5 );
        Student student6 = new Student("Ronaldoss",6 );
        Student student7 = new Student("Ronaldoss",7 );
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        ArrayList<Notes> notes = new ArrayList<>();
        ArrayList<Professor> professor = new ArrayList<>();
        ArrayList<Cless> clesses =new ArrayList<>();
        ArrayList<Metter> metters = new ArrayList<>();

        Cless cless = new Cless("tB","",professor,metters,students);
        clesses.add(cless);

        Metter metter = new Metter("1",students,professor,notes);
        metters.add(metter);

        Notes notess = new Notes("1",professor,students,metters);
        notes.add(notess);
    }
}