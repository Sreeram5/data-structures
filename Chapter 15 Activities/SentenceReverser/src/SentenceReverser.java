import java.util.Scanner;
import java.util.Stack;

/**
 * Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
    /**
     * Reverses the given sentence.
     *
     * @param sentence Sentence to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {
    	Scanner scanner = new Scanner(sentence);
        String superString = "";
    	
        // Complete this method. Use a Stack.
        String nextThing = scanner.next();
        while(scanner.hasNext())
        {
            Stack<String> words = new Stack<>();
            String string = "";
        	while (scanner.hasNext() && nextThing.contains(".") == false)
            {
        	    words.push(nextThing);
                nextThing = scanner.next();
            }
            words.push(nextThing.substring(0, nextThing.length() - 1));
            if(scanner.hasNext())
                nextThing = scanner.next();
            

            while (words.size() > 0)   
            {
                string += words.pop() + " ";
            }
            string = string.substring(0, string.length() - 1);
            string += ".";
            string = string.toLowerCase();
            string = string.substring(0, 1).toUpperCase() + string.substring(1);
            superString += string + " ";
        }
        
        

        return superString.substring(0, superString.length() - 1);





    }
}
