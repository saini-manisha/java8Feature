package com.substring;

//import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
//        List<Integer> nums=new ArrayList<>(Arrays.asList(5,3,8,1));
//        List<Integer> ans=nums.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//        System.out.println(ans);

//        11. First N elements (limit)
//        Input: [10,20,30,40,50] , N=3
//        Output: [10,20,30]
//        List<Integer> nums=new ArrayList<>(Arrays.asList(10,20,30,40,50));
//        List<Integer> ans=nums.stream().limit(3).collect(Collectors.toList());
//        System.out.println(ans);

//        12. Skip first N elements
//        Input: [10,20,30,40] , skip=2
//        Output: [30,40]
//        List<Integer> nums=new ArrayList<>(Arrays.asList(10,20,30,40));
//        List<Integer> ans=nums.stream().skip(2).collect(Collectors.toList());
//        System.out.println(ans);
//
////        13. Convert list of strings to uppercase (map)
////            Input: ["a","bcd","e"]
////        Output: ["A","BCD","E"]
//        List<String> input=new ArrayList<>(Arrays.asList("a","bcd","e"));
//        List<String> ans=input.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
//        System.out.println(ans);
//        14. Join strings with delimiter
//        Input: ["a","b","c"] , delimiter=","
//        Output: "a,b,c"
//        List<String> input= new ArrayList<>(Arrays.asList("a","b","c"));
//        String ans=input.stream().reduce((a,b)->a+","+b).orElse("");
//        System.out.println(ans);
//        15. Count frequency of a specific element
//        Input: ["a","b","a","c","a"] , element="a"
//        Output: 3
//        List<String> input=new ArrayList<>(Arrays.asList("a","b","a","c","a"));
//        long count=input.stream().filter(e->Objects.equals("a",e)).count();
//        System.out.println(count);
//        16. Find any element matching predicate
//        Input: [1,2,3,4] , predicate: >3
//        Output: Optional[4] (or 4)
//        List<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4));
//        Optional<Integer> ans=nums.stream().filter(e->e>3).findAny();
//        System.out.println(ans);
//        17. Check if all match predicate
//        Input: [2,4,6] , predicate: even
//        Output: true
//        List<Integer> nums=new ArrayList<>(Arrays.asList(2,4,6));
//        boolean ans= nums.stream().allMatch((e)->e%2==0);
//        System.out.println(ans);
//        18. Check if any match predicate
//        Input: [1,3,4] , predicate: even
//        Output: true
//        List<Integer> nums=new ArrayList<>(Arrays.asList(1,3,2,4));
//        Optional<Integer> ans= nums.stream().filter(e->e%2==0).findAny();
//        System.out.println(ans.get());
//        19. Check if none match predicate
//        Input: [1,3,5] , predicate: even
//        Output: true
//        List<Integer> nums=new ArrayList<>(Arrays.asList(1,3,5));
//        boolean ans=nums.stream().noneMatch(e->e%2==0);
//        System.out.println(ans);
//        20. Map strings to their lengths
//        Input: ["apple","pie","a"]
//        Output: [5,3,1]
//        List<String>input=new ArrayList<>(Arrays.asList("apple","pie","a"));
//        List<Integer> ans=input.stream().map(String::length).collect(Collectors.toList());
//        System.out.println(ans);
//        21. Flatten list of lists (flatMap)
//            Input: [[1,2],[3,4],[5]]
//        Output: [1,2,3,4,5]
//        List<List<Integer>> input=new ArrayList<>();
//        input.add(new ArrayList<>(Arrays.asList(1,2)));
//        input.add(new ArrayList<>(Arrays.asList(3,4)));
//        input.add(new ArrayList<>(Arrays.asList(5)));
//        List<Integer> ans=input.stream().flatMap(List::stream).collect(Collectors.toList());
//        System.out.println(ans);
//        22. Filter nulls from list
//        Input: [1,null,2,null,3]
//        Output: [1,2,3]
//          List<Integer> num=new ArrayList<>(Arrays.asList(1,null,2,null,3));
//          List<Integer> ans=num.stream().filter(e->Objects.nonNull(e)).collect(Collectors.toList());
//          System.out.println(ans);
//        23. Peek to debug (show elements while streaming)
//        Input: [1,2,3]
//        Output: (no transformation) [1,2,3] (but peek prints 1,2,3)
//        List<Integer> num=new ArrayList<>(Arrays.asList(1,2,3));
//        num.stream().peek(e-> System.out.print(e)).collect(Collectors.toList());
//        24. Convert array to list using streams
//        Input: int[] arr = {1,2,3}
//        Output: List<Integer> [1,2,3]
//        int[] arr={1,2,3};
//        List<Integer> ans=Arrays.stream(arr).boxed().collect(Collectors.toList());
//        25. Create list of range using IntStream
//        Input: range 1..5
//        Output: [1,2,3,4,5]
//         List<Integer> ans= IntStream.rangeClosed(1,5).boxed().collect(Collectors.toList());
//         System.out.println(ans);
//        26. Find average of numbers
//        Input: [2,4,6,8]
//        Output: 5.0
//        List<Integer> num=new ArrayList<>(Arrays.asList(2,4,6,8));
//        double ans=num.stream().mapToInt(Integer::intValue).average().orElse(0.0);
//        System.out.println(ans);
//        27. Concatenate two lists
//        Input: [1,2] and [3,4]
//        Output: [1,2,3,4]
//        List<Integer> list1 = Arrays.asList(1, 2);
//        List<Integer> list2 = Arrays.asList(3, 4);
//
//        List<Integer> ans = Stream.concat(list1.stream(), list2.stream())
//                .collect(Collectors.toList());
//
//        System.out.println(ans); // [1, 2, 3, 4]

//        28. Collect to Set (unique)
//        Input: [1,2,2,3]
//        Output: Set {1,2,3}
//        List<Integer> nums = Arrays.asList(1, 2, 2, 3);
//
//        Set<Integer> ans = nums.stream()
//                .collect(Collectors.toSet());
//
//        System.out.println(ans); // [1, 2, 3]

//        29. Map of element -> element*2 using toMap
//        Input: [1,2,3]
//        Output: {1=2,2=4,3=6}

















    }
}
