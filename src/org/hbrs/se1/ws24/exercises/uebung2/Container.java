package org.hbrs.se1.ws24.exercises.uebung2;
import java.util.ArrayList;
public class Container {
   private ArrayList<Member> members;

    public void addMember(Member member) throws ContainerException {
       if (members == null) {
           ContainerException ex = new ContainerException();
           throw ex;
       }
       if (members.contains(member)) {
           ContainerException ex = new ContainerException();
           throw ex;
       }
       members.add(member);
    }

    public String deleteMember(int id) {
       Member rec = getMember(id);
    }
    public boolean contains(Member member) {
        int id = member.getID();
        for (Member rec : members) {
            if (rec.getID() == id) {
                return true;
            }
        }
        return false;
    }
    public void dump(){
        for (int i = 0; i < members.size(); i++) {
            System.out.println(members.get(i).toString());
        }
    }
    public int size() {
        int size = 0;
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i) != null) {
                size++;
            }
        }
        return size;
    }
    private Member getMember(int id) {
        for( E rec : member){
            if (id == (rec).getID().intValue()){
                return (members) rec;
            }
        }
    }
    @Override
    public String toString() {
        return "Member (ID=" + members.get(0).getID() + ")";
    }
}

