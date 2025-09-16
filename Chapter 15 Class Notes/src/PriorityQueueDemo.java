import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        //create a priority queue of strings
        Queue<String> students = new PriorityQueue<>();
        students.add("Neel");
        students.add("Jonathan");
        students.add("Cam");
        students.add("Kaitlyn");
        students.add("Dylan");
        
        // The next highest priority object is moved to the front of the queue when the head of the queue is removed
        while (students.size() > 0)
        {
            System.out.println("Next student: " + students.remove());
        }

        //Create a to do list
        //the work order class has a priority and a description
        Queue<WorkOrder> toDo = new PriorityQueue<>();

        //lower priority is more important
        toDo.add(new WorkOrder(3, "Water the Plants"));
        toDo.add(new WorkOrder(2, "Make Dinner"));
        toDo.add(new WorkOrder(1,"Conquer the World"));
        toDo.add(new WorkOrder(9, "Play Video Games"));
        toDo.add(new WorkOrder(1, "Study for the Ch.15 Test"));

        // Objects are NOT stored in priority order
        System.out.println(toDo);

        //Objects will be removed in priority order
        while (toDo.size() > 0)
        {
            System.out.println(toDo.remove());
        }
    }
}
