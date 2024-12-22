package backfirststeps.model;

import java.util.ArrayList;

public class  Student extends Person {
    private ArrayList<Metter> metter;
    private int DataMatricula;

    public Student(String name, int id, ArrayList<Metter> metter, int dataMatricula) {
        super(name, id);
        this.metter = metter;
        DataMatricula = dataMatricula;
    }
}
