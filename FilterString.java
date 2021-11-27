package dsa.assignment.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterString {
	public static void main(String[] args) {
		List<String> namesList = new ArrayList<>();
		namesList.add("shreya");
		namesList.add("kavya");
		namesList.add("dhiru");
		namesList.add("Vini");
		
		System.out.println(namesList.toString());
		
		List<String> modifiedList = namesList.stream().filter(name -> name.startsWith("R")).collect(Collectors.toList());
		
		System.out.println(modifiedList.toString());

	}

}

