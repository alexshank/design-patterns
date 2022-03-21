package patterns.creational.factories.models.products;

public class iOS extends PhoneOS {
    @Override
    public String createVersion() {
        return "apple-version-1.0";
    }
}
