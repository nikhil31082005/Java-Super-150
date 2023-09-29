package Lec6;

public class Array_demo {
    public static void main(String[] args) {
        int[] arr= new int[5];
        System.out.println(arr);
//        array is non-primitive data space allowed in heap memory
//        why 0 based indexing --> due to formula (base_address + index * data_type_size)
//        java is call by value
        System.out.println(arr.length);
        int[] other = arr;  // both arr and other pointing to same location
        System.out.println(other);
    }
}
