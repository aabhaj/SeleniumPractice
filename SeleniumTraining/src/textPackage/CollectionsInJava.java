package textPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsInJava {
	
	public static void main(String[] args) {
		//list_collection();
		set_collection();
		
		
	}
	
	public static void list_collection() {
		// list collection
		List<String> list = new ArrayList<>();
		list.add("Aabha");
		list.add("Prashant");
		list.add("Ramaa");
		
		System.out.println("List values are as follwos" + list);
		
		for(int i=0; i < list.size(); i++) {
			
			System.out.println("Index values " + i + " for the list value" + list.get(i));
		}
		
	}
    
	public static void set_collection() {
		//set collection
		Set<String> set = new HashSet<>();
		set.add("Aabha");
		set.add("Prashant");
		set.add("Ramaa");
		
		System.out.println("List values are as follwos" + set);
		
		//for(int i=0; i < set.size(); i++) {
			
			//System.out.println("Index values " + i + " for the list value" + set.hashCode(i));
		//}
		
		
		
	}
}
