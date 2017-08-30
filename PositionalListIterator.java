import java.util.Iterator;
import java.util.NoSuchElementException;

public class PositionalListIterator<E> implements Iterator<E> {
	
	//TODO: choose private member variables
	private LinkedPositionalList<E> List;
	private Position<E> cursor;
	
	public PositionalListIterator(LinkedPositionalList<E> List) { //TODO: choose parameters
		//TODO: implement this
		this.List = List;
		cursor = List.first();
	}
	
	@Override
	public boolean hasNext() {
		//TODO: implement this
		return cursor != null;
	}

	@Override
	public E next() {
		//TODO: implement this
		if(List.isEmpty())
		{
			throw new NoSuchElementException();
		}
		E element = cursor.getElement();
		cursor = List.after(cursor);
		return element;
	}

}