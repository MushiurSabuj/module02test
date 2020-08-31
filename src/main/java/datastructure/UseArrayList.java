package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
			String name=new String("john");
			System.out.println(name);

			ArrayList<String> departmentName= new ArrayList<String>();
			departmentName.add("math");
			departmentName.add("CIS");
			departmentName.add("Science");
			departmentName.add("English");
			departmentName.add("Reading");

		System.out.println("Print ArrayList: " + departmentName.size());
		System.out.println("Print ArrayList: " + departmentName.get(4));

		for(int i=0; i<= departmentName.size() -1; i++){
			System.out.println(departmentName.get(i));

			for(Object px: departmentName ){
				System.out.println(px);

			}
		}

		}

	}


		/**
		 * @author Jahidul Islam
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
	



