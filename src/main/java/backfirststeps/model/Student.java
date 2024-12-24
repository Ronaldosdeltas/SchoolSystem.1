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
    public Student(String name,int id){
        super(name,id);
    }

    public ArrayList<Metter> getMetter() {
        return metter;
    }

    public void setMetter(ArrayList<Metter> metter) {
        this.metter = metter;
    }

    public int getDataMatricula() {
        return DataMatricula;
    }

    public void setDataMatricula(int dataMatricula) {
        DataMatricula = dataMatricula;
    }

    @Override
    public String toString() {
        return "Student{" +
                "metter=" + metter +
                ", DataMatricula=" + DataMatricula +
                '}';
    }
}
