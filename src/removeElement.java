import java.util.LinkedList;

public class removeElement {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Gawesh");
        ll.add("Chamath");
        ll.add("Damith");
        ll.add("Maleesha");
        ll.add("Sachitha");
        System.out.println("Before :- "+ ll);
        String str = ll.remove(3);
        System.out.println("Removed Element:- " + str);
        System.out.println("After :- " + ll);

    }
}
