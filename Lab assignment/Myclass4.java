// There were two errors. : ->; and Void -> void. Output is 24
public class Myclass4 {
    static int a = 20;
    Myclass4() {
    a++;
    }
    void m1() {
    a++;
    System.out.println(a);
    }
    public static void main(String[]
    args)
    {
    Myclass4 obj = new Myclass4();
    Myclass4 obj2 = new Myclass4();
    Myclass4 obj3 = new Myclass4();
    obj3.m1();
    }
    }
