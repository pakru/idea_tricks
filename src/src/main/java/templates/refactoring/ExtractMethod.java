package templates.refactoring;

public class ExtractMethod {

    public void method() {
        int a = 1;
        int b = 2;

        int c = a + b;
        int d = a + c;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
