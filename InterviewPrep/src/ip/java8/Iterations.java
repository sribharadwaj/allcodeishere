package ip.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Iterations {

	public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1,8,9,4 );

	
	//External iterators	
	for(int i=0;i<numbers.size();i++) {
		System.out.println(numbers.get(i));
	}

	for(int e:numbers) {
		System.out.println(e);
	}
	
	
	//Internal iterator
	//
	numbers.forEach(
			//System.out.println(value);
			System.out::println
		
	);
	numbers.stream()
			.map(String::valueOf)//reference to static method
		   .forEach(System.out::println);//reference to instance method
	
	
	numbers.stream()
				.map(e->e.toString())
				.map(String::toString)//instance method
				.forEach(System.out::println);
	
	System.out.println(
	numbers.stream()
			//.reduce(0,(total,e)->Integer.sum(total,e))
			.reduce(0,Integer::sum)
	);
	
	System.out.println(
	numbers.stream()
			.map(String::valueOf)
			//.reduce("",(carry,str)->carry.concat(str))
			.reduce("",String::concat)
	);
	
	//int result =0;
	
	/*
	 * for(int num:numbers) { if(num%2==0) { num=num*2; result+=num; } }
	 * System.out.println("Result:::: "+result);
	 */
	
	System.out.println(numbers.stream()
			.filter(num->num%2==0)
			.reduce(0,(result,num)->Integer.sum(result, num))
			);
	
	}
}


class Animal{
	int i=10;
	public static void main(String[] args) {
	Cat a = new Cat();
	System.out.println(a.i);
	}
}
class Cat extends Animal{
	
	int i=20;
	
	public static void main(String[] args) {
		Animal a = new Cat();
		System.out.println(a.i);
		}
	
	
}