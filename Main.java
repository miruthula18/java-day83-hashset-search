import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");
        String search = "Mango";
        if (fruits.contains(search)) {
            System.out.println(search + " is present");
        } else {
            System.out.println(search + " is not present");
        }
    }
}