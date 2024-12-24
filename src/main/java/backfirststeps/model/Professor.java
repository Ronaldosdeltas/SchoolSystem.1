package backfirststeps.model;

import java.util.ArrayList;

public class Professor extends Person {
    private ArrayList<Cless> classs;
    private Metter metter;

    public Professor(String name, int id, ArrayList<Cless> classses, Metter metter) {
        super(name, id);
        this.classs = classses;
        this.metter = metter;
    }

    public ArrayList<Cless> getClasss() {
        return classs;
    }

    public void setClasss(ArrayList<Cless> classses) {
        this.classs = classses;
    }

    public Metter getMetter() {
        return metter;
    }

    public void setMetter(Metter metter) {
        this.metter = metter;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "classs=" + classs +
                ", metter=" + metter +
                '}';
    }
}
