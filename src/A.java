/**
 * Created by Alyona on 18.05.2015.
 */
public class A {
    static int i = 0;
    int b = 3;
    public A() {
        // для контроля количества созданных объектов можно конструктором ее считать:
        System.out.println(i++);
    }
    static {
        System.out.println("static");
    }
    {
        System.out.println("nonStatic");
    }
    void printA() {
        System.out.println("int i = " + i);
        System.out.println("int b = " + b);
    }
}
