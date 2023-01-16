public class JaggedArray {
    public static void main(String[] args) {
        int[][] testArr = {
                {10,20,30,40,50},
                {70,80,90},
                {100}
        };
        //Method 1
        for(int i=0;i<3;i++){
            for(int j : testArr[i]){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //Method 2
//        for(int[] arr1D : testArr){
//            for(int element : arr1D){
//                System.out.print(element+" ");
//            }
//            System.out.println();
//        }
        //Method 3
//        for(int row=0;row<3;row++){
//            for(int col = 0;col<testArr[row].length;col++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
    }
}
