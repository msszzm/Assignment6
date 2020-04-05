package eg.edu.alexu.csd.datastructure.queue;

public class AQueue implements IQueue, IArrayBased{

    /**
     * Size of the array.(maximum number of elements).
     */
    private final int maxSize;
    private Object[] queue;
    private int size=0;
    public int front=0;
    public int end=0;

    public AQueue(int size) {
        this.maxSize = size;
        queue=new Object[size];
    }

    /**
     * Insert an object to queue.
     * if front and end are adjacent then queue is full.
     * insert at first of array iff end is at it's last.
     * Insert at last otherwise.
     * @param item
     */
    @Override
    public void enqueue(Object item) {
        if(isEmpty()){
            queue[front]=item;
        }
        else if((end+1<maxSize&&front==end+1)||((end+1)-front==maxSize))
            throw new RuntimeException("Queue is full!");

        else if(end+1==maxSize) {
            queue[0] = item;
            end = 0;
        }
        else{
            queue[++end]=item;
        }
        size++;
    }
    @Override
    public Object dequeue() {
        if(isEmpty())
            throw new RuntimeException("Queue is empty!");
        Object temp=queue[front];
        queue[front]=null;
        if(front==maxSize-1)
            front=0;
        else{
            front++;
        }
        size--;
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }
    
    	public Object front(){
            if(size == 0)
                throw new RuntimeException("Queue is empty");
            return queue[front];
        }
}
