//Implementation #2 - Simple Array List Test File
//Lindsey Vetvick - CI487

public class SimpleArrayListTest {

	public static void main(String[] args) {

		/* Add + toString and Ensure Capacity */
		System.out.println(".add(E e), toString(), and ensureCapacity() Tests:");
		SimpleList<Integer> integerList = new SimpleArrayList<>();
		for (int i = 1; i <= 100; i++) {
			integerList.add(i);
		}
		System.out.println(integerList);

		/* indexOf tests */
		System.out.println("\n.indexOf(E e) Tests");
		System.out.println("The index of 2 is: " + integerList.indexOf(2));
		System.out.println("The index of 3 is: " + integerList.indexOf(3));
		System.out.println("The index of 7 is: " + integerList.indexOf(7));

		/* Add and Remove on List of Strings */
		System.out.println("\n.add(E e) and .remove(E e) Tests");
		SimpleList<String> stringList = new SimpleArrayList<>();
		stringList.add("hi");
		stringList.add("hello");
		stringList.add("hola");
		System.out.println(stringList);
		stringList.add("ni hao");
		stringList.remove("hi");
		System.out.println(stringList);

		/* Get Tests */
		System.out.println("\n.get(E e) Method Tests:");
		System.out.println("We got '" + stringList.get(0) + "' from the list at position 0");
		System.out.println("We got '" + stringList.get(1) + "' from the list at index 1");

		/* Contains Tests */
		System.out.println("\n.contains(E e) Method Tests:");
		System.out.println("Is 'hello' in the list? " + stringList.contains("hello"));
		System.out.println("Is 'hi' in the list? " + stringList.contains("hi"));

		/* isEmpty Tests */
		System.out.println("\n.isEmpty() Method Tests:");
		SimpleList<Integer> emptyList = new SimpleArrayList<>();
		System.out.println("Is the empty list empty? " + emptyList.isEmpty());

	}

}
