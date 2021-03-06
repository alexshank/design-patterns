package patterns.creational.factories.models.factories;

import patterns.creational.factories.models.products.FoldingDisplay;
import patterns.creational.factories.models.products.LiquidRetinaDisplay;

/*
 * This is a concrete factory (not abstract) that creates display products.
 */
public class PhoneDisplayFactory {
    public static LiquidRetinaDisplay createAppleDisplay(){
        return new LiquidRetinaDisplay();
    }

    public static FoldingDisplay createAndroidDisplay(){
        return new FoldingDisplay();
    }
}
