package com.example.demo;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PreDefinedFunctionalInterfaces {


public <T> Consumer buildConsumer(){
    Consumer<T> myConsumer =  System.out::println;
    return myConsumer;
}

public  <T> Supplier buildSupplier(T arg){
    Supplier<T> mySupplier = ()-> arg;
    return mySupplier;
}

public <T>Predicate check(){
    Predicate<T> myPredicate = num -> (Integer) num % 2 == 0;
    return  myPredicate;
}



public void usingPredefinedFunctionalInterfaces(){
    List<Integer> ages = Arrays.asList(11,12,1,3,5);
    Collections.sort(ages);
    var magicList =  buildSupplier(ages).get();
    boolean condition = magicList instanceof List;
    if (condition) {
        ((List<?>) magicList).stream().filter(check()).forEach(buildConsumer()::accept);
    }else {
        System.out.println("arg is not list");
    }
}




}
