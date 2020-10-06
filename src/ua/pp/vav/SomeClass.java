package ua.pp.vav;

import java.util.ArrayList;

public class SomeClass {
	public static void main(String[] args) {
		int a = 10;
		a = a + a-- - a--;
		System.out.println(a);
		
		int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;

        System.out.println(result);
        
     // look inside c:
        String greeting = "Hello";
        String s = greeting.substring(0,3);
        
        ArrayList<Egg> myList = new ArrayList<Egg>();
        Egg egg1 = new Egg();
        myList.add(egg1);
        myList.add(new Egg());
        int listSize = myList.size();
        System.out.println("listSize: " + listSize);
        
        System.out.println("some new text for git diff");
	}
}
