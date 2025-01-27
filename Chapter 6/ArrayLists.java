import java.util.ArrayList;

public class ArrayLists{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("John");
		list.add("Henry");
		list.add("Mary");
		list.add("Jack");
		list.add("Blessing");
		
		
		//Adding the object of an array
		list.add(2, "clinton");//replacing the value of index nuber 2 to clinton
		
		//Updating a value
		list.set(3, "Peter");
		
		//Removing from the list
		list.remove("Henry");
		//removing based of index---list.remove(3);
		
		//Clearing the list
		//list.clear();
		
		//using a loop to display the array...		
		for(String name : list){
			System.out.printf("%s%n", name);
		}
		System.out.println("==============");
		System.out.println(list.get(2));
		
	}
}