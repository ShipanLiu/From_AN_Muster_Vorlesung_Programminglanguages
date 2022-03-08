package Tree;

import java.util.ArrayList;

public class Parent implements FamilyMember{
    private ArrayList<FamilyMember> children = new ArrayList<FamilyMember>();
    private String name;
    private int age;

    public Parent(FamilyMember child){
        this.name = child.getName();
        this.age = child.getAge();
    }

    // Getter Setter

    @Override
    public String toString() {
        return "Parent{" +
                "children=" + children +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // implements Methods
    @Override
    public void addMember(FamilyMember member) {
        this.children.add(member);
    }

    @Override
    public void remove(FamilyMember member) {
        this.children.remove(member);
    }

    @Override
    public FamilyMember getChild(int index) {
        return this.children.get(index);
    }

    // Unique Methods
    @Override
    public void calmChild(){
        System.out.println("Calm down child");
    }

    @Override
    public void cry() {
        throw new UnsupportedOperationException();
    }
}
