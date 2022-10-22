import java.util.ArrayList;
import java.util.List;

public class ListDemoMain {
    public static void main(String[] args) {
        List list = new ArrayList(1);
        System.out.println("list.size() = " + list.size());//0
        list.add("vaibhav");
        list.add("ravi");
        list.add("Akash");
        list.add("Ramesh");
        System.out.println("list.size() = " + list.size());//4
        System.out.println("list.indexOf(\"Ramesh\") = " + list.indexOf("Ramesh"));//3
        System.out.println("list.get((2)) = " + list.get(2));//Akash
        System.out.println("list.contains(\"Vaibhav\") = " + list.contains("Vaibhav"));//false

    }
}
