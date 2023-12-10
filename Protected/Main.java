import Second.C;

public class Main {
    public static void main(String[] args) {
        A aObj = new A(4);
        System.out.println(aObj.x); //private
        aObj.classAMethod(); // private

        /*C cObj = new C();
        System.out.println(cObj.x);
        cObj.classAMethod();*/
    }
}