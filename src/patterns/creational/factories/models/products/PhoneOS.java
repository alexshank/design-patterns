package patterns.creational.factories.models.products;

/*
 * Our concrete factories will construct products that adhere to a common interface. This way, our client can
 * use the products without knowing their implementation details.
 */
public abstract class PhoneOS {

    /*
     * Here we use a factory method. It let's us vary the object that is created before we use some common
     * functionality from a parent class.
     *
     * In this example, we vary the String representation of a particular OS version.
     */
    protected abstract String createVersion();

    public String upgradeVersion(){
        return "Upgrading from version " + createVersion();
    }
}
