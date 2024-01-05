package com.magic.dsa;

import com.magic.dsa.exercises.LinkedList;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class DsaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LinkedList list = new LinkedList(1);





		list.append(2);
		list.append(3);
		list.prepend(5);
		//list.removeLast();
		;
		System.out.println(list.removeFirst().value);
		list.printList();
	}
}
