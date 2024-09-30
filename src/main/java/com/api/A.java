package com.api;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A {
    public static void main(String[] args) {



//Predicate<Integer> val = x -> x > 300;
//        boolean result = val.test(100);
//        System.out.println(result);


//        Predicate<String> val = x -> x.equals("mike");
//        boolean result = val.test("mike");
//        System.out.println(result);


//        List<Integer> data=Arrays.asList(100, 10, 35, 2, 15, 500, 700);
//        List<Integer> newData = data.stream().filter(x -> x > 100).collect(Collectors.toList());
//        System.out.println(newData);

//        List<String> data=Arrays.asList("mike","adam","madam","bike","me");
//        List<String> newData = data.stream().filter(x -> x.startsWith("m")).collect(Collectors.toList());
//        System.out.println(newData);


//        List<Integer> data=Arrays.asList(10,11,13,14,16,19);
//        List<Integer> newData = data.stream().filter(t -> t % 2 == 0).collect(Collectors.toList());
//        System.out.println(newData);

//        List<Integer>data=Arrays.asList(10,11,13,14,16,19);
//        List<Integer>newData=data.stream().filter(t-> t % 2 !=0).collect(Collectors.toList());
//        System.out.println(newData);


//        (2)       //Function Functional Interface

//        It will take the input and it will produce an output

//String is the input and Integer is the output

//        Function<String,Integer> x= s->s.length();
//        Integer val = x.apply("mike");
//        System.out.println(val);

//Integer input and integer output  and squares of numbers

//        Function<Integer,Integer>x=s->s*s;
//        Integer val = x.apply(100);
//        System.out.println(val);

//        To calculate the sqaures of the numbers

//        List<Integer> data = Arrays.asList(10, 20, 35, 12, 14);
//        List<Integer> newData = data.stream().map(x -> x * x).collect(Collectors.toList());
//        System.out.println(newData);

//        To add the numbers 5 to all

//        List<Integer> data = Arrays.asList(10, 20, 35, 12, 14);
//        List<Integer> newData = data.stream().map(x -> x + 5).collect(Collectors.toList());
//        System.out.println(newData);

//        Convert every word to UpperCase

//        List<String> data = Arrays.asList("mike", "stallin", "adam");
//        List<String> newData = data.stream().map(x-> x.toUpperCase()).collect(Collectors.toList());
//        System.out.println(newData);

//        Convert every word to LowerCase

//        List<String> data = Arrays.asList("Mike", "STALLIN", "ADAM");
//        List<String> newData = data.stream().map(x -> x.toLowerCase()).collect(Collectors.toList());
//        System.out.println(newData);

//        To find the length of the string

//        List<String> data = Arrays.asList("mike", "stallin", "adam");
//        List<Integer> newData = data.stream().map(x -> x.length()).collect(Collectors.toList());
//        System.out.println(newData);

//        To find the sorted string

//        List<String> data = Arrays.asList("mike", "stalling", "adam");
//        List<String> newData = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newData);

//        To remove the duplicates

//        List<String> data = Arrays.asList("mike", "stallin", "adam", "mike", "stallin");
//        List<String> newData = data.stream().distinct().collect(Collectors.toList());
//        System.out.println(newData);

//        Give me those names which is more than 4

//        List<String> data = Arrays.asList("mike", "adam", "stalling", "Rishav");
//        List<String> newData = data.stream().filter(x -> x.length() > 4).collect(Collectors.toList());
//        System.out.println(newData);



//        (3) consumer
//        It will take input and produce no output.

//        Consumer<String>x=s->System.out.println(s);
//        x.accept("mike");
//        List<String> names = Arrays.asList("Alice", "Bob", "charley");
//        Consumer<String> val = s -> System.out.println(s);
//        names.forEach(val);




//1) Give me those employee objects whose salary is greater than 4000



//      In this arrays I will start creating the Employee objects and I will stored that address
//      into this array of that object.
//
//        List<Employee> data = Arrays.asList(
//
//          new Employee(1,"mike",5000),
//          new Employee(2,"stallin",4000),
//          new Employee(3,"adam",7000)
//        );
//        List<Employee> newData = data.stream().filter(e -> e.getSal() > 4000).collect(Collectors.toList());
////        System.out.println(newData);
//
////        Now we are using for each loop
//        for (Employee emp:newData)
//        {
//            System.out.println(emp.getId());
//            System.out.println(emp.getName());
//            System.out.println(emp.getSal());
//
//        }





// 2) Give me those employees whose names starts with letter m


//        List<Employee> data = Arrays.asList(
//                new Employee(1, "mike", 5000),
//                new Employee(2, "stallin", 4000),
//                new Employee(3, "adam", 7000)
//        );
//        List<Employee> newData = data.stream().filter(e -> e.getName().startsWith("m")).collect(Collectors.toList());
//        for (Employee emp:newData)
//        {
//            System.out.println(emp.getId());
//            System.out.println(emp.getName());
//            System.out.println(emp.getSal());
//        }



// 3) Suppose I have 2 employees that happens to have 5000 I want to group this object based on its salary
// which means 5000 salary one group and 4000 is another group


//        List<Employee> data = Arrays.asList(
//                new Employee(1, "mike", 5000),
//                new Employee(2, "stallin", 4000),
//                new Employee(3, "adam", 5000)
//        );
//        Map<Integer, List<Employee>> newData = data.stream().collect(Collectors.groupingBy(e -> e.getSal()));
//        System.out.println(newData);


//4) Find the sum of these numbers 10,20,13,15 using Method Reference


//        List<Integer> data = Arrays.asList(10, 20, 13, 15);
//        int result = data.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(result);


//5)How to find a Max number in a list using stream API in java

//        List<Integer> numbers= Arrays.asList(3, 5, 7, 2, 8, 10);
//        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
//        System.out.println(max.get());

//6) How to find a Min number in a list using stream API in java

//        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 10);
//        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
//        System.out.println(min.get());



    }
}





