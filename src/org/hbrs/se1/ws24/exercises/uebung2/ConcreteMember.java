package org.hbrs.se1.ws24.exercises.uebung2;

public class ConcreteMember implements Member{
    private int id;
    private static int nextNr = 0;
    public ConcreteMember(){
      id=nextNr++;
    }
    @Override
    public Integer getID() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String toString() {
        return "ConcreteMember [id=" + id + "]";
    }
}
