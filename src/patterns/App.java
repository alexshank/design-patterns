package patterns;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        List<DesignPattern> designPatterns = new ArrayList<>();
        designPatterns.add(new DesignPattern("Abstract Factory", DesignPatternType.CREATIONAL));

        designPatterns.add(new DesignPattern("Factory", DesignPatternType.CREATIONAL));

        System.out.println();
        designPatterns.stream()
                .map(DesignPattern::toString)
                .forEach(System.out::println);

    }
}
