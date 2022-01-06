package com.alexshank.patterns.creational.builder;

import com.alexshank.patterns.creational.builder.models.EuropeanVacationBuilder;
import com.alexshank.patterns.creational.builder.models.Vacation;
import com.alexshank.patterns.creational.builder.models.VacationBuilder;

import java.util.Arrays;
import java.util.List;

public class BuilderApp {

    public static void main(String[] args) {

        // the client specifies the builder they want to use, and some data to handle
        String[] userInputs = {"France", "5000.00", "United Airlines"};
        VacationBuilder vacationBuilder = new EuropeanVacationBuilder();

        // the delegator leverages the builder however it needs to
        // note: the other builder example just assumes the client IS the delegator
        VacationDelegator vacationDelegator = new VacationDelegator(userInputs, vacationBuilder);

        // run the delegator, which will leverage the builder to get a vacation
        Vacation vacation = vacationDelegator.delegate();
        System.out.println(vacation.toString());
   }

   private static class VacationDelegator{
        private String[] inputs;
        private VacationBuilder builder;

        public VacationDelegator(String[] inputs, VacationBuilder builder) {
            this.inputs = inputs;
            this.builder = builder;
        }

        public Vacation delegate(){
            // here, the delegate knows how to correctly parse the user input
            // in practice, the delegator could be much more complex
            this.builder.buildDestination(this.inputs[0]);
            this.builder.buildCost(Double.valueOf(this.inputs[1]));
            this.builder.buildTransportation(this.inputs[2]);
            return this.builder.getVacation();
        }
   }
}
