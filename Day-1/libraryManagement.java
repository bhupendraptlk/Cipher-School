import java.util.*;
/*
    authorName,Books
 */
public class libraryManagement{
    String authorName = new String();
    ArrayList<String> books = new ArrayList<String>();
    public libraryManagement(String authorName,ArrayList<String> books){
        this.authorName=authorName;
        this.books=books;
    }
    public void showList(){
        System.out.println(authorName+" "+books);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<libraryManagement> obs = new ArrayList<libraryManagement>();
        //Added two lists by default
        ArrayList<String> b1 = new ArrayList<String>(){
            {
                add("write program");
                add("ongoing");
            }
        };
        ArrayList<String> b2 = new ArrayList<String>(){
            {
                add("program");
                add("efks ongoing");
            }
        };
        obs.add(new libraryManagement("hehe",b1));
        obs.add(new libraryManagement("hmm",b2));
//        obs.add(new libraryManagement("hmm",{"write program","ongoing"});
        System.out.println("1-ADD, 2-Display book info,3-List all books of an author, 4-List count of books in library");
        int choice = scan.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter Book's authorName : ");
                String author=scan.next();
                System.out.println("Enter number of books you want to add for this author");
                int count = scan.nextInt();
                ArrayList<String> books = new ArrayList<String>();
                for(int i=0;i<count;i++){
                    books.add(scan.next());
                }
                obs.add(new libraryManagement(author,books));

                System.out.println("List after adding book info : ");
                for(int i =0;i<obs.size();i++){
                    obs.get(i).showList();
                }
                break;
            case 2:
                for(int i =0;i<obs.size();i++){
                    obs.get(i).showList();
                }
                break;
            case 3:
                System.out.println("Enter author's name : ");
                String auth = scan.next();
                for(int i=0;i<obs.size();i++){
                    if(auth==obs.get(i).authorName){
                        obs.get(i).showList();
                    }
                }
                break;
            case 4:
                int total = 0;
                for(int i=0;i<obs.size();i++){
                    total=total+(obs.get(i).books.size());
                }
                System.out.println(total);
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
