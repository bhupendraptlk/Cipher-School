import java.util.*;
/*
Description
Suppose you want to know the total score of the Indian cricket team in a given match. To do so, your task is to find the sum of all the scores of the Indian team players. The scores are provided as a list, with each element as an individual score of the players. Also, there is a condition that if the number of elements in the list is more than 11, then it is an invalid input and the output should be -1.

--------------------------------------------------------------------------------------------

Input - List
Output - An integer

--------------------------------------------------------------------------------------------

Sample Input : [11, 13, 101, 14, 33, 141]
Sample Output : 313

---------------------------------------------------------------------------------------------

Sample Input : [11, 13, 101, 14, 33, 141, 12, 144, 54, 67, 8, 11]
Sample Output : -1
---------------------------------------------------------------------------------------------

Sample Input : [100, 80, 30, 10, 0, 1, 2, 0]
Sample Output : 223



 */
//Bhupendra Patel
public class CricketTeam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<Integer>();
        System.out.println("Enter the scores of players");
        scan.useDelimiter("\\D");
        while (scan.hasNextInt()) {
            scores.add(scan.nextInt());
        }
        if(scores.size()>11){
            System.out.println("-1");
        }
        else{
            int total = 0;
            for(int i=0;i<scores.size();i++){
                total+=scores.get(i);
            }
            System.out.println(total);
        }
    }
}
