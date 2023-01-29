import java.awt.*;

/*
    Write a class called ColourChecking. Define a color with red = 193, green =255 and blue = 183. No separate the rgb values.
    Find the Hue, saturation and brightness of this color.
 */
//Bhupendra Patel
class ColourChecking{
    int red=193;
    int green=255;
    int blue=183;
}
public class p3{
    public static void main(String[] args) {
        ColourChecking ob = new ColourChecking();
        float[] HSB= Color.RGBtoHSB(ob.red,ob.green,ob.blue,null);
        System.out.println("Hue : "+HSB[0]);
        System.out.println("Saturation : "+HSB[1]);
        System.out.println("Brightness : "+HSB[2]);
    }
}
