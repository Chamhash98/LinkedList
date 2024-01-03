import java.util.LinkedList;

public class getElement {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Java");
        ll.add("Python");
        ll.add("C");
        ll.add("JavaScript");

        String str = ll.get(2);
        System.out.println("Element at Index 2 :- " + str);
    }
}
