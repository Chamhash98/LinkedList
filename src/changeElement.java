import java.util.LinkedList;

public class changeElement {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Gawesh");
        ll.add("Chamath");
        ll.add("Damith");
        ll.add("Maleesha");
        ll.add("Damith");
        System.out.println("Before :- " + ll);
        ll.set(4,"Sachitha");
        System.out.println("After :- " + ll);
    }
}
