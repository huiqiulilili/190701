class Computer{
    String color;
    int size;
    public void show(){
        System.out.println("color = " + color + "\nsize = "+ size);
    }

    public static void show1(){
        System.out.println("haha");
    }
}
public class Student {
    public static void main(String[] args) {
        Computer c = new Computer();
        //c.show();
        Computer.show1();
    }
}
