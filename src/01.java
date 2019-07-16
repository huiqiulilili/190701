class Person{
    private int age;
    String name;
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
public class Text {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(15);
        System.out.println(p.getAge());
    }



}
