//Implementation #2 - Simple List Interface File
//Lindsey Vetvick - CI487

interface SimpleList<E>{
	
	public void add(E e);
	public int indexOf(E e);
	public boolean remove(E e);
	public E get(int i);
	public boolean contains(E e);
	public boolean isEmpty();
	
}
