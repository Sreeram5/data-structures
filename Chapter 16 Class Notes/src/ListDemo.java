import java.util.LinkedList;
import java.util.ListIterator;

/**
 *   A program that demonstrates the LinkedList class
 */
public class ListDemo
{
    public static void main(String[] args)
    {
        /* The addLast method can be used to populate a list */
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Tony");
        staff.addLast("Natasha");
        staff.addLast("Peter");
        staff.addLast("Steve");

        System.out.println(staff);

        // the list is currently: TNPS
        /*
         * the listIterator method creates a new lst iterator
         * that is positioned before the first element
         * the | symbol indicates the iterator position
         */

        ListIterator<String> iterator = staff.listIterator(); // |TNPS

        /* the next method advances the iterator OVER the next element in the list */

        iterator.next(); // T|NPS

        /* the next method also returns the element that the iterator passes over. */
        String avenger = iterator.next(); // TN|PS
        System.out.println(avenger + " is a Marvel Avenger"); //Natasha is a Marvel Avenger

    }
}
