import Tree.Child;
import Tree.FamilyMember;
import Tree.Parent;

public class Main {
    public static void main(String[] args) {
        FamilyMember grandparent = new Parent(new Child("The Old One", 100));
        FamilyMember parent = new Parent(new Child("Max Mustermann", 50));
        FamilyMember child = new Child("Max MusterKind", 17);

        parent.addMember(child);
        grandparent.addMember(parent);

        System.out.println(grandparent.toString());
        System.out.println(grandparent.getChild(0).toString());
        System.out.println(parent.toString());
        System.out.println(parent.getChild(0).toString());
    }
}
