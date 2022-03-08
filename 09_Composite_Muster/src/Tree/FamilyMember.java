package Tree;

public interface FamilyMember {
    String getName();
    int getAge();

    void addMember(FamilyMember member);
    void remove(FamilyMember member);
    FamilyMember getChild(int index);
    String toString();
    void cry();
    void calmChild();
}
