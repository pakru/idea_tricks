package templates.refactoring;

import java.util.ArrayList;

public class ExtractConst {

    public void method() {
        ArrayList<String> list = new ArrayList<>();
        list.add("some string value");
        anotherMethod("some string value");
    }

    public void anotherMethod(String str) {
        System.out.println(str);
    }
}
