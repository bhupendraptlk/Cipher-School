import java.util.Stack;

//The stack class is derived from vector
//Stack follow LIFO Data structure
//Stack provides methods like push,pop and peek to work with data
public class stackImp{
    public static void main(String[] args) {
        Stack<String> cakeLayers = new Stack<>();
        cakeLayers.push("Chocolate");
        cakeLayers.push("Vannila");
        cakeLayers.push("Strawberry");
        cakeLayers.push("Rum-Raisen");
        cakeLayers.push("Tooty-fruity");
        System.out.println("Layers addded : "+cakeLayers.size());
        System.out.println("Layers at the top is : "+cakeLayers.peek());
        System.out.println("Eating the top layer : "+cakeLayers.pop());
        System.out.println("Layer's left : "+cakeLayers.size());
    }
}
