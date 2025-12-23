package com.substring;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        1. Filter evens
//        Input: List<Integer> nums = [1,2,3,4,5,6]
//        Output: [2,4,6]
//        List<Integer> nums= Arrays.asList(1,2,3);
//        List<Integer> ans=nums.stream().filter(e->e%2==0).collect(Collectors.toList());
//        System.out.println(ans);

//        2.Square each number (map)
//        Input: [1,2,3,4]
//        Output: [1,4,9,16]
//        List<Integer> nums=new ArrayList<>(Arrays.asList(1,4,9,16));
//        List<Integer> ans=nums.stream().map(e->e*e).collect(Collectors.toList());
//        System.out.println(ans);
//        3. Sum of list (reduce)
//        Input: [1,2,3,4]
//        Output: 10

//        List<Integer> nums=new ArrayList<>(Arrays.asList(111,8,90));
//        int ans=nums.stream().reduce(0,Integer::max);
//        System.out.println(ans);

//        4. Product of list (reduce)
//        Input: [2,3,4]
//        Output: 24
//        List<Integer> nums=new ArrayList<>(Arrays.asList(2,3,4));
//        int ans=nums.stream().reduce(1,(acc,curr)->acc*curr);
//        System.out.println(ans);

//        5. Count elements > 10
//        Input: [5,12,18,3,20]
//        Output: 3
//        List<Integer> nums=new ArrayList<>(Arrays.asList(5,12,18,3,20));
//        long ans=nums.stream().map((e)->e>10?1:0).reduce(0,(acc,curr)->acc+curr);
//
//        System.out.println(ans);

//        6. Find max value (using streams)
//        Input: [3,9,2,15,7]
//        Output: 15

//        List<Integer> nums=new ArrayList<>(Arrays.asList(3,9,2,15,7));
//        int ans=nums.stream().reduce(0,Integer::max);
//        System.out.println(ans);
//        7. Find min value (using streams)
//        Input: [3,9,2,15,7]
//        Java 8 Stream api practice questions 1
//        Output: 2
//        List<Integer> nums=new ArrayList<>(Arrays.asList(3,9,2,15,7));
//        int ans=nums.stream().min(Integer::compareTo).get();
//        8. Collect distinct values
//        Input: [1,2,2,3,3,3]
//        Output: [1,2,3] (order not guaranteed unless sorted)
//        List<Integer> nums=new ArrayList<>(Arrays.asList(1,2,2,3,3,3));
//        List<Integer> ans=nums.stream().distinct().collect(Collectors.toList());
//        System.out.println(ans);
//        9. Sort list ascending
//        Input: [5,3,8,1]
//        Output: [1,3,5,8]
//        List<Integer> nums=new ArrayList<>(Arrays.asList(5,3,8,1));
//        List<Integer>ans=nums.stream().sorted().collect(Collectors.toList());
//        System.out.println(ans);
//        10. Sort list descending
//        Input: [5,3,8,1]
//        Output: [8,5,3,1]
        List<Integer> nums=new ArrayList<>(Arrays.asList(5,3,8,1));




    }
}
