package patterns.creational.factories.models.products;

public class FoldingDisplay implements PhoneDisplay {
    @Override
    public String turnOffDisplay() {
        return "Turning off the folding screen...";
    }
}
