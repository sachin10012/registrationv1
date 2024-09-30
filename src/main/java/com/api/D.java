package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.Arrays.compare;

public class D {
    public static void main(String[] args)
    {
        List<Integer>data= Arrays.asList(12,45,34,56,45,45,5,7,89);
        List<String>note=Arrays.asList("bob","marcus","alexander","einstein","sachin","maclum");
        List<Integer>newdata=data.stream().filter(x->x%2==0).collect(Collectors.toList());
        List<Integer>value=data.stream().filter(x->x%2!=0).collect(Collectors.toList());
        List<Integer>newvalue=data.stream().distinct().collect(Collectors.toList());
        List<Integer>oracle=data.stream().sorted().collect(Collectors.toList());
        List<Integer>viper=data.stream().map(x->x*2).collect(Collectors.toList());
        List<Integer>drew=data.stream().filter(x->x>=20).collect(Collectors.toList());
        List<String>love=note.stream().filter(x->x.startsWith("a")).collect(Collectors.toList());
        List<String>love1=note.stream().filter(x->x.endsWith("n")).collect(Collectors.toList());

        List<String>love2=note.stream().filter(x->x.contains("b")).collect(Collectors.toList());

        System.out.println("the even number is:"+newdata);
        System.out.println("the odd number is:"+value);
        System.out.println("the distinct object from array is:"+newvalue);
        System.out.println("the sorted integer from array is:"+oracle);
        System.out.println("the last integer multiply by 2 is:"+viper);
        System.out.println("number of greater than 20 is:"+drew);
        System.out.println("name starts with a is:"+love);
        System.out.println("name ends with n is:"+love1);
        System.out.println("name contains latter b is:"+love2);

    }
}
