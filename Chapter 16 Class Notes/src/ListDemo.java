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

        /* the add method inserts an element at the iterator position
         * the iterator is positioned AFTER the inserted element
         */
        iterator.add("Clint"); // TNC|PS
        iterator.add("Bruce"); // TNCB|PS
        System.out.println(staff); // [Tony, Natasha, Clint, Bruce, Peter, Steve]

        /*the remove method can ONLY be called after calling next or previous. */
        //iterator.remove(); // this line would throw an IllegalStateException
        //the remove method removes the last element returned by next or previous
        iterator.next(); // TNCBP|S
        iterator.remove(); // TNCB|S removes Peter
        System.out.println(staff); // [Tony, Natasha, Clint, Bruce, Steve]

        /*the Set method updates the element returned by the last call to next or previous */

        iterator.previous(); // TNC|BS
        iterator.set("Thor"); //bruce is replaced by thor
        System.out.println(staff); // [Tony, Natasha, Clint, Thor, Steve] 

        /* the hasNext metod is used to determine if there is a next node
         * after the iterator. The hasNext method is often usedin the condition of a while loop
         */

        iterator = staff.listIterator(); // |TNCBS
        while (iterator.hasNext())
        {
            String n = iterator.next();
            if (n.equals("Natasha")) // TN|CTS
                iterator.remove();
        }
        // the list is now TCBS|

        /*Enchanced for loops work with linked lists as well */
        for (String n : staff)
            System.out.println(n + " ");
        System.out.println();

        /*ConcurrentModificationException
         * 
         * CANNOT modify a linked list without using the iterator
         */
        iterator = staff.listIterator(); // |TCBS
        while (iterator.hasNext())
        {
            String n = iterator.next();
            if (n.equals("Tony")) // TC|BS
                //staff.remove("Tony")// this line would throw a ConcurrentModificationException
        }

        for(string n : staff)
        {
            if (n.equals("Tony"))
                staff.add("Tchalla"); // this line would throw a ConcurrentModificationException
        }

        System.out.println(staff); // [Clint, Thor, Steve, Tchalla]


    }
}
