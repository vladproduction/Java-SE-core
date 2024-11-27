package com.vladproduction.inner_as_service_for_outer;

public class Outer {
    private final int[] elements;
    public Outer(int[] elements) {
        this.elements = elements;
    }
    public  void analise(){
        InnerServiceClass innerService = new InnerServiceClass();
        System.out.println("Max: " + innerService.maxElement());
        System.out.println("Min: " + innerService.minElement());
        System.out.println("Avg: " + innerService.avgElement());
    }
     class InnerServiceClass{

        public int maxElement(){
            int max = Integer.MIN_VALUE;
            for (int element : elements) {
                if (element > max) {
                    max = element;
                }
            }
            return max;
        }
         public int minElement(){
             int min = Integer.MAX_VALUE;
             for (int element : elements) {
                 if (element < min) {
                     min = element;
                 }
             }
             return min;
         }
         public int avgElement(){
             int sum = 0;
             for (int element : elements) {
                 sum += element;
             }
             return sum / elements.length;
         }
    }
}

