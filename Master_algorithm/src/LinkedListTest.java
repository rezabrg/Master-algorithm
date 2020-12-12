import java.util.LinkedList;

public class LinkedListTest {
    public void operation()
    {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Reza");
        ll.add("Alif");
        ll.add(1, "Keya");

        System.out.println("Initial LinkedList " + ll);

        ll.set(1, "Arif");

        System.out.println("Updated LinkedList " + ll);
    }
}
