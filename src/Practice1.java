class Student3{
    private String name;
    private int age;
    private char sex;
    //构造方法
    public Student3(){

    }
    //有参构造
    public Student3(String name,int age,char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    //普通方法
    public void show(){
        System.out.println("name = "+ name + "age = " + age + "sex = "+ age );
    }
    public void setName( String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSex(char sex){
        this.sex = sex;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public char getSex(){
        return sex;
    }
}
public class Practice2 {
    public static void main(String[] args) {
        Student3 s = new Student3();
        s.setName("小明");
        s.setAge(15);
        s.setSex('男');
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getSex());

    }
}
