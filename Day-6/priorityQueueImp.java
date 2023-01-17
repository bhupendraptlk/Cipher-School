//BufferedReader is used for file handling
//Scanner is used to take input from multiple sources
import java.io.*;
import java.util.PriorityQueue;

//Priority Queueu  is derived from Queue interface
//Priority Queueu is used when want to process elements by their priority.
//It doesn't accept null as an element
public class priorityQueueImp{
    public static void main(String[] args) throws IOException {
        PriorityQueue<String> customerComplaints = new PriorityQueue<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<4;i++){
            System.out.println("Type your complaints");
            String text =br.readLine();
            customerComplaints.add(text);
        }
        System.out.println("First complaint : "+customerComplaints.peek());
        System.out.println("First complaint : "+customerComplaints.element());
        System.out.println("De-registering complaint no 1 : "+customerComplaints.remove());
        System.out.println("Total complaints that we are left with are : "+customerComplaints.size());

        while(customerComplaints.size()>0){
            System.out.println("Closing complaints, current complaint : "+customerComplaints.poll());
        }
        System.out.println("Total complaints that are left are : "+customerComplaints.size());
    }
}
//.element() throws exception if the queue is empty
//.peek() returns null value if the queue is empty
//poll() is used to fetch and removes the head element from the queue
