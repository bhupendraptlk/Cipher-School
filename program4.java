import java.util.Arrays;

public class program4 {
    public static void main(String[] args) {
        String animal = "crocodile";
        System.out.println(animal.charAt(1));
        for(int i=0;i<animal.length();i++){
            System.out.print(animal.charAt(i));
        }
        char[] letters = animal.toCharArray();
        System.out.println(Arrays.toString(letters));
        letters[4] = 'a';
        System.out.println(Arrays.toString(letters));
        String newAnimal = new String(letters);
        System.out.println(newAnimal);
    }
}
