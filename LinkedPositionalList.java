import java.util.Iterator;

/*
 * This class is the one you need to complete. Only the member variables
 * and constructor have been implemented for you.
 */
public class LinkedPositionalList<E> implements PositionalList<E>, Iterable<E> {
	
	/*
	 * This nested class contains a completed implementation of Position
	 * which you should use within LinkedPositionalList.
	 * 
	 * You do not need to edit this class.
	 */
	private class Node<E> implements Position<E> {
		
		private Node<E> prev;
		private Node<E> next;
		private E element;
		
		public Node(E element) {
			this.element = element;
			this.prev = null;
			this.next = null;
		}
		
		public Node<E> getPrev() {return prev;}
		public Node<E> getNext() {return next;}
		public E getElement() {return element;}
		public void setPrev(Node<E> prev) {this.prev = prev;}
		public void setNext(Node<E> next) {this.next= next;}
		public void setElement(E element) {this.element = element;}
	}
	
	//The header sentinel
	private Node<E> header;

	//The trailer sentinel
	private Node<E> trailer;

	//The number of positions in the list, not counting sentinels
	int size;

	//This constructor creates an empty list
	public LinkedPositionalList() {
		header = new Node<E>(null);
		trailer = new Node<E>(null);
		header.setNext(trailer);
		trailer.setPrev(header);
		size = 0;
	}

	//TODO: You will need to implement the remaining methods!

	@Override
	public int size() {
		// TODO Implement this.
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Implement this.
		if(size == 0 )
		{
			return true;
		}
		return false;
	}

	@Override
	public Position<E> first() {
		// TODO Implement this.
		if (size == 0 )
		{
			return null;
		}
		return header.getNext();
	}

	@Override
	public Position<E> last() {
		// TODO Implement this.
		if (size == 0)
		{
			return null;
		}
		return trailer.getPrev();
	}

	@Override
	public Position<E> before(Position<E> p) {
		// TODO Implement this.
		
		if (((Node<E>) p).getPrev() == header)
		{
			return null;
		}
		return ((Node<E>) p).getPrev();
	}

	@Override
	public Position<E> after(Position<E> p) {
		// TODO Implement this.
		if (((Node<E>)p).getNext() == trailer)
		{
			return null;
		}
		return ((Node<E>) p).getNext();
	}

	@Override
	public Position<E> addFirst(E e) {
		// TODO Implement this.
		
		Node<E> n = new Node<E>(e);
		n.setNext(header.getNext());
		header.getNext().setPrev(n);
		n.setPrev(header);
		header.setNext(n);
		size++;
		return n;
	}

	@Override
	public Position<E> addLast(E e) {
		// TODO Implement this.
		
		Node<E> n = new Node<E>(e);
		n.setPrev(trailer.getPrev());
		trailer.getPrev().setNext(n);
		n.setNext(trailer);
		trailer.setPrev(n);
		size++;
		return n;
	}

	@Override
	public Position<E> addBefore(Position<E> p, E e) {
		// TODO Implement this.
		Node<E> n = new Node<E>(e);
		n.setPrev(((Node<E>) p).getPrev());
		n.getPrev().setNext(n);
		// ((Node<E>)p).getPrev().setNext(n);
		n.setNext((Node<E>) p);
		((Node<E>)p).setPrev(n);
		size++;
		return n;
	}

	@Override
	public Position<E> addAfter(Position<E> p, E e) {
		// TODO Implement this.
		Node<E> n = new Node<E>(e);
		n.setNext(((Node<E>) p).getNext());
		n.getNext().setPrev(n);
		// ((Node<E>)p).getNext().setPrev(n);
		n.setPrev((Node<E>) p);
		((Node<E>) p).setNext(n);
		size++;
		return n;
	}

	@Override
	public E set(Position<E> p, E e) {
		// TODO Implement this.
		E element = ((Node<E>) p).getElement();
		((Node<E>) p).setElement(e);
		return element;
	}																																																																																																																																																																																																																							

	@Override
	public E remove(Position<E> p) {
		// TODO Implement this.
		E prevElement = ((Node<E>) p).getElement();
		((Node<E>) p).getPrev().setNext(((Node<E>) p).getNext());
		((Node<E>) p).getNext().setPrev(((Node<E>) p).getPrev());
		return prevElement;
	}
	
	@Override
	public Iterator<E> iterator() {
		return new PositionalListIterator<E>(this);
		//return LinkedPositionalList<E>(this);
	}
		
}
