# Selection Sort

Selection sort algorithm implemented as different versions. Check the branches to see all the versions.
Versions 1-4 implement Selection Sort using the iterative method. All Code written in Java.

## Selection Sort Code

```
public static <T> void iterative(T[] items, Comparator<T> comparator) {
    for (int i = 0; i < items.length - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < items.length; j++) {
            if (comparator.compare(items[j],items[minIndex]) < 0) {
                minIndex = j;
            }
        }
        T temp = items[i];
        items[i] = items[minIndex];
        items[minIndex] = temp;
    }
}
```

## Version1-SortingIntegers

Here we just sort an array of ints.

## Version2-SortingGenericTypeNamedT

We now modify the SelectionSort.iterative() method to sort an array of generic type T, instead of just ints.

## Version3-SortingGenericTypeTWithACustomComparator

The SelectionSort.iterative() method now takes a Comparator as a parameter. This enables us to use the same sorting 
method to not only sort an array of a generic type, but also to sort it in different ways. Eg. We now can sort an array 
of Strings in alphabetical order or by its String length. 

## Version4-UsingLambdaFunctionsForComparators

This version is an extension of Version 3. However, here we use Lambda Functions to create our custom comparator in 
Comparators.java