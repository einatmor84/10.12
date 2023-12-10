import Second.C;

public class Main {
    public static void main(String[] args) {
        A aObj = new A(4); //error private
        System.out.println(aObj.x); //error private
        aObj.classAMethod(); // error private

        C cObj = new C();
        System.out.println(cObj.x); //Error
        cObj.classAMethod();  //Error
    }
}