import java.util.*;
/*
    Question:
        List of Features Required in ToDo App.

            User Must be Able to Add Todo
            User Must be Able to List All Todo
            User Must be Able to Select and View any ToDo
            User Must be Able to Delete ToDO
            User Must be Able to Replace/Update ToDo.

 */
//Bhupendra Patel
public class ToDo{
    int sno=0;
    String task = new String();
    String status = new String();
    public ToDo(int sno,String task,String status){
        this.sno=sno;
        this.task=task;
        this.status=status;
    }
    public void showList(){
        System.out.println(sno+"\t"+task+"\t"+status);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ToDo> obs = new ArrayList<ToDo>();
        //Added two lists by default
        obs.add(new ToDo(1,"write program","ongoing"));
        obs.add(new ToDo(2,"check program","start"));
        System.out.println("1-ADD, 2-list all todo,3-Select and view List, 4-delete ToDo, 5-update ToDo");
        int choice = scan.nextInt();
        switch(choice){
            case 1: //ADD to list
                System.out.println("Present List : ");
                for(int i =0;i<obs.size();i++){
                    obs.get(i).showList();
                }
                System.out.println("How many tasks you want to add?");
                int n = scan.nextInt();
                for(int i=0;i<n;i++){
                    System.out.println("Enter Sno, task,status");
                    int sno=scan.nextInt();
                    String task=scan.next(); //make nextLine()
                    String status = scan.next();
                    obs.add(new ToDo(sno,task,status));
                }
                System.out.println("List after adding tasks : ");
                for(int i =0;i<obs.size();i++){
                    obs.get(i).showList();
                }
                break;
            case 2: //List all ToDo's
                System.out.println("List of ToDo's : ");
                int size = obs.size();
                if(size==0){
                    System.out.println("The list is empty");
                }
                for(int i =0;i<size;i++){
                    obs.get(i).showList();
                }
                break;
            case 3: //Select and view ToDo
                System.out.println("There are "+obs.size()+" ToDo lists"+", Which Sno would you like to select and view?");
                obs.get(scan.nextInt()-1).showList();
                break;
            case 4: //Delete a ToDo
                System.out.println("Present List : ");
                for(int i =0;i<obs.size();i++){
                    obs.get(i).showList();
                }
                System.out.println("Which sno you want to delete?");
                obs.remove(obs.get(scan.nextInt()-1));
                System.out.println("List after deletion : ");
                for(int i =0;i<obs.size();i++){
                    obs.get(i).showList();
                }
                break;
            case 5: //Update a ToDo
                System.out.println("Present List : ");
                for(int i =0;i<obs.size();i++){
                    obs.get(i).showList();
                }
                System.out.println("Which Sno would you like to update?");
                int sUpdate = scan.nextInt();
                System.out.println("Enter new task and status");
                String newTask = scan.next(); //nextLine()
                String status = scan.next();
                obs.set(sUpdate-1,new ToDo(sUpdate,newTask,status));
                System.out.println("List after updating : ");
                for(int i =0;i<obs.size();i++){
                    obs.get(i).showList();
                }
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
