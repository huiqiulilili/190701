class Demoo{
    int num;
    Demoo(int num){
        this.num = num;
    }

    public boolean equals(Object obj){  // Object obj = new Demoo(5);
        if(!(obj instanceof Demoo)){
            return false;
        }
        Demoo p = (Demoo) obj;
        return this.num == p.num;
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Demoo d1 = new Demoo(4);
        Demoo d2 = new Demoo(5);
        System.out.println(d1.equals(d2));
    }
}
