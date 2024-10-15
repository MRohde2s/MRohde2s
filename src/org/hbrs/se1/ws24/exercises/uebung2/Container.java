package org.hbrs.se1.ws24.exercises.uebung2;

public class Container {
    private Member[] memberArray = new Member[100];

    public void addMember(Member member) throws ContainerException {
        for (int i = 0; i < memberArray.length; i++) {
            int memberID = memberArray[i].getID();
            if (memberID == member.getID()) {
                throw new ContainerException("Das Member-Objekt mit der ID" + memberID + " ist bereits vorhanden");
            }
        }
    }

    public String deleteMember(int id) {
        for (int i = 0; i < memberArray.length; i++) {
            if (memberArray[i].getID() == id) {
                memberArray[i] = null;
            }
            else{
                return "Member nicht vrhanden";
            }
        }
        return "Member gelöscht";
    }
    public void dump(){
        for (int i = 0; i < memberArray.length; i++) {
            System.out.println(memberArray[i].toString());
        }
    }
    public int size() {
        int size = 0;
        for (int i = 0; i < memberArray.length; i++) {
            if (memberArray[i] != null) {
                size++;
            }
        }
        return size;
    }
    @Override
    public String toString() {
        return "Member (ID=" + memberArray[0].getID() + ")";
    }
}

