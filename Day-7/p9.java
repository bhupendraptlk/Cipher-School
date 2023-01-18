/*
    Input:
    list: [Bluehost, GoDaddy, Amazon AWS, LiquidWeb, FatCow]

    Output:
    map: {Bluehost=8, GoDaddy=7, Amazon AWS=10, LiquidWeb=9, FatCow=6}

 */
//Bhupendra Patel
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class p9 {
    public static void main(String[] args) {
        Stream<String> values = Stream.of("Bluehost","GoDaddy","Amazon AWS","LiquidWeb","FatCow")
                .map(ele->ele.concat("=").concat(String.valueOf(ele.length())));
        System.out.println(values.collect(Collectors.joining(",","{","}")));
    }
}
