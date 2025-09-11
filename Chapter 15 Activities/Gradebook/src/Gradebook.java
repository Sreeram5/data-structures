import java.util.*;
/**
 * A program to add, remove, modify or print
 * student names and grades.
*/
public class Gradebook
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Map<String, String> grades = new HashMap<>();
        boolean done = false;
        while(!done)
        {
            System.out.println("A)dd R)emove M)odify P)rint Q)uit");
            String input = in.next().toUpperCase();
            if (input.equals("Q"))
            {
                done = true;
            } else if (input.equals("A"))
            {
                System.out.println("Enter the student's name: ");
                String name = in.next();
                System.out.println("Enter the student's grade: ");
                String grade = in.next();
                grades.put(name, grade);
                System.out.println(name + " has been added.");

            } else if (input.equals("R"))
            {
                System.out.println("Enter the student's name: ");
                String name = in.next();
                if (grades.containsKey(name))
                {
                    grades.remove(name);
                    System.out.println(name + " has been removed.");
                } else
                    System.out.println(name + " is not in the gradebook.");

            } else if (input.equals("M"))
            {
                System.out.println("Enter the student's name: ");
                String name = in.next();
                if (grades.containsKey(name))
                {
                    System.out.println("Enter the student's new grade: ");
                    String grade = in.next();
                    grades.put(name, grade);
                    System.out.println(name + "'s grade has been updated.");
                } else
                    System.out.println(name + " is not in the gradebook.");

            } else if (input.equalsIgnoreCase("P"))
            {
                Set<String> keys = grades.keySet();
                for (String key: keys)
                    System.out.println(key + ": " + grades.get(key));
            } else
            {
                done = true;
            }
        }
    }
}
