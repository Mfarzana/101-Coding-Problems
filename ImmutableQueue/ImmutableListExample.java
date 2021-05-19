import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
## Immutable List in Java
* Immutable means read-only.
* If any attempt made to add, delete and update elements in the List, UnsupportedOperationException is thrown.
* An ImmutableList does not allow null element either.
* If any attempt made to create an ImmutableList with null element, NullPointerException is thrown. If any attempt is made to add null element in List, UnsupportedOperationException is thrown.
*/
public class ImmutableListExample {
    public static void main(String[] args) {

        List<String> list = List.of("one", "two", "three");
        System.out.println(list);
        list.add("four");

    }

}
