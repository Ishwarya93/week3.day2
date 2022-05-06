package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LL {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("1");
		list.add("4");
		list.add("5");
		list.add("1");
		list.add("6");
		int count=0;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).contains("1")) {
				count=count+1;
			}
		}
		System.out.println("no.of 1s:"    +count);
		
		
		
	}

}
