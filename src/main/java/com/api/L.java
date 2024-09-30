package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class L {
    public static void main(String[] args )
    {
        List<Integer>value= Arrays.asList(12,45,45,22,34,35);
        List<Integer>newvalue=value.stream().map(s->s*s).collect(Collectors.toList());
        System.out.println("the square of every value is:"+newvalue);

    }

}
