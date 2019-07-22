package templates.refactoring;

public class AddParams {


    public void addParamMethod(int value) {

    }
}

class AddParamsSecondary {

    public AddParamsSecondary() {
        AddParams addParams = new AddParams();

        int initValue = 10;
        float price = 15.5f;
        if (price > 22) {
            System.out.println("price = " + price);
        }

        addParams.addParamMethod(initValue);
    }

    public AddParamsSecondary(int defValue) {
        AddParams addParams = new AddParams();

        addParams.addParamMethod(defValue);
    }

    public void testMethod(){
        System.out.println("This is test method");
    }
}
