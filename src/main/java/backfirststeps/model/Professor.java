package backfirststeps.model;

import java.util.ArrayList;

public class Professor extends Person {
    private ArrayList<Class> classs;
    private Metter metter;

    public Professor(String name, int id, ArrayList<Class> classs, Metter metter) {
        super(name, id);
        this.classs = classs;
        this.metter = metter;
    }

    public ArrayList<Class> getClasss() {
        return classs;
    }

    public void setClasss(ArrayList<Class> classs) {
        this.classs = classs;
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
