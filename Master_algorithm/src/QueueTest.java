import java.util.*;
class QueueTest{
    public void operation(){
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Saiful");
        queue.add("Reza");
        queue.add("Arif");
        queue.add("Sajol");
        queue.add("Mahmud");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("Iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("After removing two Elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}  