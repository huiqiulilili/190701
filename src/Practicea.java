class Person1{
    public  String name;
    public int age;
    public Person1(){
        this.name = name;
        this.age  = age;
    }
    public String getNPerson(){
        return "姓名" + name + "年龄" + age;
    }
}
public class Practicea {
    public static void main(String[] args) {
        Person1 p = new Person1();
        p.name = "张三";
        p.age = 15;
        System.out.println(p.getNPerson());
    }
}
