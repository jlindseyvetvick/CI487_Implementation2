//Implementation #2 - Simple Array List File
//Lindsey Vetvick - CI487

import java.util.Arrays;

public class SimpleArrayList<E> implements SimpleList<E> {

	private static final int INITIAL_SIZE = 3;
	private static final int INCREASE_SIZE = 15;
	private Object items[];
	private int size;

	SimpleArrayList() {
		this.items = new Object[INITIAL_SIZE];
	}

	private void ensureCapacity(int minSize) {
		if (items.length < minSize) {
			// items = Arrays.copyOf(items, size + INCREASE_SIZE);

			// 1. create a new array of objects
			Object moreItems[] = new Object[items.length + INCREASE_SIZE];

			// 2. copy contents of old array into new one
			for (int i = 0; i < items.length; i++) {
				moreItems[i] = items[i];
			}

			// 3. set items attribute equal to new array
			items = moreItems;
		}
	}

	public void add(E e) {
		ensureCapacity(size + 1);
		items[size] = e;
		size++;
	}

	public int indexOf(E e) {
		for (int i = 0; i < size; i++) {
			if (items[i].equals(e)) {
				return i;
			}
		}
		return -1;
	}

	public boolean remove(E e) {

		Object modItems[] = new Object[items.length];

		String i = (String) e;

		if (i.equals(null)) {
			return false;
		}
		
		for (int j = 0; j < size; j++) {
			if (i.equals(i)){
				items[j] = null;
				modItems[j] = i;
				items[size - 1] = null;
				items = modItems;
			}
			size--;
		}
		return true;

	}

	@SuppressWarnings("unchecked")
	public E get(int i) {
		if (i > 0 && i < size) {
			return (E) items[i];
		}
		return null;
	}

	public boolean contains(E e) {
		for (int i = 0; i < size; i++) {
			if (items[i].equals(e)) {
				return true;
			}
		}
		return false;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			String itemsString = items[i].toString();
			sb.append(itemsString);
			sb.append(", ");
		}

		System.out.println(sb.toString());
		return null;
	}
}
