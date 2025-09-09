import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        /*The Map Interface is generic
         * The firt type given is the key .
         * the second type is the value
         */

        Map<String, Color> favColors = new HashMap<>();

        //add elements to the map using the put method
        favColors.put("Sreeram", Color.GREEN);
        favColors.put("Cam", Color.BLUE);
        favColors.put("Nimai", Color.RED);

        //Two different elements with the same value
        favColors.put("Kaitlyn", Color.GREEN);

        //the same key CANNOT have two different values
        //using put with an existing key will replace the previous value
        favColors.put("Cam", Color.ORANGE); //this will replace the previous value for Cam

        //create a set of the keys in a map
        Set<String> keys = favColors.keySet();
        for (String key:keys)
            //[name] ([hashCode]): [color]
            System.out.println(key + "(" + key.hashCode() + "): " + favColors.get(key));



    }   
}
