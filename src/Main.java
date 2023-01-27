import org.fasttrackit.course8HW.code.person.Person;
import org.fasttrackit.course8HW.code.person.Programmer;
import org.fasttrackit.course8HW.code.product.Cosmetics;
import org.fasttrackit.course8HW.code.product.Fridge;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Fridge fridge = new Fridge("Cool fridge", "One door fridge", 50, 60, 170, 100, 1500, "A box that keeps stuff cool", 3, -15);
        Cosmetics cosmetic = new Cosmetics("Parfume", 300, "A liquid that smells nice", 30, "Blue", 30);
        System.out.println(fridge.getDescription());
        System.out.println(cosmetic.getDescription());


        Programmer programmer =new Programmer("Mircea", "Ion", 10.10.2000, "programmer", )

    }

}
