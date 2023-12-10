import Second.C;
public class A extends C {
    protected A(int x) {
        this.x = x;
    }

    protected int x ;
    protected void classAMethod(){
        System.out.println("hello from class A");
        System.out.println(x);
        A obj = new A(40);
        obj.classCMethod();

    }

}
