package patterns.creational.factories.models.Phones;

import patterns.creational.factories.models.products.PhoneOS;
import patterns.creational.factories.models.products.PhoneDisplay;

/*
 * This is a complex object that's constructor requires a family of related objects. We use the abstract factory
 * to make sure the products we use for construction are from one family (Apple products or Google/Android products).
 */
public class MobilePhone {
    private PhoneOS os;
    private PhoneDisplay display;

    public MobilePhone(PhoneOS os, PhoneDisplay screen){
        this.os = os;
        this.display = screen;
    }

    // functionality of the mobile phone changes based on the product family we constructed it with
    public void updatePhone(){
        System.out.println();
        System.out.println("Starting update...");
        System.out.println(display.turnOffDisplay());
        System.out.println(os.upgradeVersion());
        System.out.println("Update finished!");
    }
}
