package eg.edu.alexu.csd.datastructure.queue;

public class LQueue  implements IQueue, ILinkedBased{
	private class Node {
		private Object data;
		private Node next;

		public Node(Object element,Node Next) {
			data = element; 
			next = Next;
		}
		
		public Object getElement() { 
			return data;
		}
		
		public Node getNext() { 
			return next; 
		}
		
		public void setNext(Node n) {
			next = n;
		}
	}
	
	private Node Head;
	private Node Tail;
	private int Size;
	public LQueue() {
		Head = Tail =null;
		Size = 0;
	}
	
	
	@Override
	public void enqueue(Object item) {
		Node n = new Node(item,null);
		Size++;
		if(Size==1)
			Head=n;
		else
			Tail.setNext(n);
		Tail = n;
	}
	
	@Override
	public Object dequeue() {
		if(Size==0)
			throw new RuntimeException("Queue is empty");
		Object temp = Head.getElement();
		Size--;
		if(Size==0)
			Head=Tail=null;
		else
			Head = Head.getNext();
		return temp;
	}
	
	@Override
	public boolean isEmpty() {
		return Size==0;
	}
	
	@Override
	public int size() {
		return Size;
	}
}
