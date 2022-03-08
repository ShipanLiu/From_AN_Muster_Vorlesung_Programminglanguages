package Tree;

public class Child implements FamilyMember{
    private String name;
    private int age;

    public Child(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Getter Setter

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
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

    @Override
    public void calmChild() {
        throw new UnsupportedOperationException();
    }

    @Override
    public FamilyMember getChild(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addMember(FamilyMember member) {
        System.out.println(this.name + " has become a parent");
    }

    @Override
    public void remove(FamilyMember member) {
        throw new UnsupportedOperationException();
    }

    // Unique methods
    @Override
    public void cry(){
        System.out.println("Cryyyyyyy");
    }

}
