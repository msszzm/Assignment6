package eg.edu.alexu.csd.datastructure.queue;


public class Main {
    public static int ens=0;
    public static int des=0;
    public static AQueue x=new AQueue(8);
    public static void main(String[] args) {
      enq("S");
      enq("M");
      deq();
      enq("B");
      enq("Z");
      deq();
      enq("W");
      enq("Hello Lab");
      enq("A");
      deq();
      enq("Hello");
      enq("Hi");
      enq("Now");
      enq("It's empty");
      enq("This gives error");

    }
    public static void enq(Object item){
        ens++;
        System.out.println("==============Enque==================");
        System.out.println(item.toString());
        x.enqueue(item);
        System.out.println("Front is "+x.front);
        System.out.println("End is "+x.end);
        System.out.println("Size is "+x.size());
        System.out.println("Ens are "+ens+"\t\t\t Des are "+des);
        System.out.println("===========================");
    }
    public static void deq(){
        des++;
        System.out.println("==============deque==================");
        Object temp=x.dequeue();
        System.out.println("Front is "+x.front);
        System.out.println("End is "+x.end);
        System.out.println("Size is "+x.size());
        System.out.println(temp.toString());
        System.out.println("Ens are "+ens+"\t\t\t Des are "+des);
        System.out.println("===========================");
    }

}
