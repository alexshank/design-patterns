package patterns.creational.factories.models.factories;

import patterns.creational.factories.models.products.PhoneOS;
import patterns.creational.factories.models.products.PhoneDisplay;

/*
 * This is one of the concrete implementations of our abstract factory
 */
public class AndroidFactory implements PhoneAbstractFactory {

    @Override
    public PhoneOS createOS() {
        return PhoneOSFactory.createAndroidOS();
    }

    @Override
    public PhoneDisplay createDisplay() {
        return PhoneDisplayFactory.createAndroidDisplay();
    }
}
