package patterns.creational.builder;

import patterns.creational.builder.modelsA.Vacation;
import patterns.creational.builder.modelsB.VacationExtended;

public class BuilderAppB {

    /*
     * This builder example assumes the client IS the delegator and directly uses the builder. In the
     * book for example, a text parser is exists between the client and builder. The client
     * just provide the delegator with the text that needs to be parsed, and the delegator
     * uses the builder accordingly.
     */
    public static void main(String[] args) {

        // Inspired by the Spring framework, we can return instances of the VacationBuilder class
        // repeatedly and chain our building commands.
        //
        // TODO the Decorator pattern is used by Spring to create generic builders
        // TODO Spring somehow ads the builder() method to the base class, whereas
        // TODO I had to extend the base class here. How can I just use
        // TODO Vacation.builder().getVacation()? with an annotation?
        Vacation vacation = VacationExtended.builder()
                .buildDestination("Oregon")
                .buildCost(2000.00)
                .buildTransportation("Car")
                .getVacation();

        // show that the building worked
        System.out.println(vacation.toString());
   }
}
