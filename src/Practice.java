class Person{
    public String name;
    public int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getPersonInfo(){
        return "姓名" + this.name + "年龄" + this.age;
    }
}
public class Practice {
    public static void main(String[] args) {

        Person p1 = new Person("zhansan",25);
        System.out.println(p1.name);
        System.out.println(p1.getPersonInfo());

    }


}
