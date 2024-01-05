package com.example.demo;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import lombok.val;

interface Evaluate<T>{
	boolean isNegative(T t);
}

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	final static Integer IVA = 19;



	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//Lambda implementa la interface, con functional programming
	Evaluate<Integer> evaluate = number -> number<0;
		System.out.println("is Negative ? : "+ evaluate.isNegative(-1));

	//Predicate and BiPredicate, se usa para filtros o coincidencias
	Predicate<Integer> predicate = number -> number<0;

		System.out.println("is Negative ? : "+ check("Kevin Armando", name -> name.startsWith("Kevin")));

	BiPredicate<String, Integer> checkLength = (str,len)-> str.length() == len;
	System.out.println(checkLength.test("Kevin", 5));

	//Supplier, se usa para suministrar data sin ninguna entrada
	Supplier<StringBuilder> sSB = ()-> new StringBuilder();
	System.out.println(sSB.get().append("KEVIN"));

	Supplier<LocalTime> supTime = ()-> LocalTime.now();
	System.out.println(supTime.get());

	Supplier<Double> sRandom = ()->  Math.random();
	System.out.println(sRandom.get());

	//Consumer
	List<String> names = Arrays.asList("Kevin","Zed","Sylas","Yone","Diana");
	java.util.function.Consumer<String> printElement = elment -> System.out.println(elment);
	BiConsumer<String,String> printElementBi = (name,lastname) -> System.out.println(name+lastname);
	names.forEach(printElement);
	//Function and BiFunction
	Function<String, Integer> myBecome = str -> str.length();
	System.out.println(myBecome.apply("Kevin"));

		BiFunction<String, String, Integer> myBecome2 = (str1,str2) -> str1.length() + str2.length();
	System.out.println(myBecome2.apply("Kevin","Armando"));


	//UnaryOperatir and BinaryOpeRATOR
		Map<Object,Object>  product1 = new HashMap<>();
		product1.put("name", "MacBook");
		product1.put("desc", "test");
		product1.put("price", 23000);
			Map<Object,Object>  product2 = new HashMap<>();
		product2.put("name", "Asus");
		product2.put("desc", "test");
		product2.put("price", 21000);
			Map<Object,Object>  product3 = new HashMap<>();
		product3.put("name", "Gigabyte");
		product3.put("desc", "test");
		product3.put("price", 15000);

		List<Map<?,?>> products = Arrays.asList(product1,product2,product3);
		UnaryOperator<Integer> returnTaxValue = priceProduct -> priceProduct *  IVA  / 100;

		for (Map<?,?> product : products) {
			String productName = (String) product.get("name");
			Integer price = (Integer) product.get("price");
			System.out.println(price);
			Integer valueTax = returnTaxValue.apply(price);
			System.out.println("Value Tax of " + productName +": " + valueTax);
		}
	 BinaryOperator<Integer> sumNums = (num1,num2)-> num1+num2;
	 System.out.println(sumNums.apply(IVA, IVA));

	//Iterat0r
	Iterator<String> iterator = names.iterator();
	
	while (iterator.hasNext()) {
		String element = iterator.next();
		System.out.println(element);	
	}

	// System.out.println(iterator);



	//Streams

	List<Integer> numbers =  Arrays.asList(2,1,3,4,5,6,7,8,9,11,13);
	//Consumer<List<Integer>> sortNumbers = list -> Collections.sort(numbers);
	//Static methods references
	Consumer<List<Integer>> sortNumbers = Collections::sort;
	sortNumbers.accept(numbers);
	//Unbound method references
	Function<String,String> toUpperInLambda =  str-> str.toUpperCase();
	toUpperInLambda.apply("Kevin");
	Function<String,String> toUpperInUnbound =  String::toUpperCase;
	toUpperInUnbound.apply("Vanessa");
	//Bound method references
	String myname = "Kevin";
	//Supplier<String> sRandom2 = ()->  random.toLowerCase();
	Supplier<String> sRandom3 = myname::toLowerCase;
	sRandom.get();




	sortNumbers.accept(numbers);
	System.out.println(numbers.toString());

	
	Predicate<Integer> checkIsEven = num-> num % 2 == 0;
	Predicate<Integer> checkIsNotEven = num-> num % 2 != 0;

	numbers.stream().filter(checkIsEven)
	.peek(num-> System.out.println(num))
	.collect(Collectors.toList());

	numbers.stream().filter(checkIsNotEven)
	.peek(num-> System.out.println(num))
	.collect(Collectors.toList());


		System.out.println("New Practice");

		PreDefinedFunctionalInterfaces myUses = new PreDefinedFunctionalInterfaces();
		myUses.usingPredefinedFunctionalInterfaces();



	}

	public static <T> boolean check(T t, Predicate<T> lambda){
		return lambda.test(t);
	}



}
