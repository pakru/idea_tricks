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

        addParams.addParamMethod(initValue);
    }

    public AddParamsSecondary(int defValue) {
        AddParams addParams = new AddParams();

        addParams.addParamMethod(defValue);
    }
}
