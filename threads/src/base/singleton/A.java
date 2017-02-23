package base.singleton;

public class A {
    private A(){};
    private static A a = null;
    public static A getA(){
        if(a == null){
            a = new A();
        }
        return a;
    }
}
