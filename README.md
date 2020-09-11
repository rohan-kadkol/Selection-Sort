# Selection Sort

Selection sort algorithm implemented as different versions. Check the branches to see all the versions.
Versions 1-4 implement Selection Sort using the iterative method. Versions 5-8 implement Selection Sort using the recursive method. All code is written in Java.

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

Sample Output:
```
Before sorting:
[7, 2, 13, 24, 3, 6, 10]
After sorting:
[2, 3, 6, 7, 10, 13, 24]
```

## Version2-SortingGenericTypeNamedT

We now modify the SelectionSort.iterative() method to sort an array of generic type T, instead of just ints.

Sample Output:
```
Before sorting:
[7, 2, 13, 24, 3, 6, 10]
After sorting:
[2, 3, 6, 7, 10, 13, 24]

Before sorting:
[7.3, 2.2, 13.5, 24.9, 3.1, 6.0, 10.2]
After sorting:
[2.2, 3.1, 6.0, 7.3, 10.2, 13.5, 24.9]

Before sorting:
[Albert, Steven, Bernard, Juliet, Samantha, Jessica, Darnell]
After sorting:
[Albert, Bernard, Darnell, Jessica, Juliet, Samantha, Steven]
```

## Version3-SortingGenericTypeTWithACustomComparator

The SelectionSort.iterative() method now takes a Comparator as a parameter. This enables us to use the same sorting 
method to not only sort an array of a generic type, but also to sort it in different ways. Eg. We now can sort an array 
of Strings in alphabetical order or by its String length. 

Sample Output:
```
Initial integers array:
[7, 2, 13, 24, 3, 6, 10]
Ascending integers:
[2, 3, 6, 7, 10, 13, 24]
Descending integers:
[24, 13, 10, 7, 6, 3, 2]

Initial doubles array:
[7.3, 2.2, 13.5, 24.9, 3.1, 6.0, 10.2]
Ascending doubles:
[2.2, 3.1, 6.0, 7.3, 10.2, 13.5, 24.9]
Descending doubles:
[24.9, 13.5, 10.2, 7.3, 6.0, 3.1, 2.2]

Initial strings array:
[Albert, Steven, Bernard, Juliet, Samantha, Jessica, Darnell, Mike, Bo]
Ascending alphabetical:
[Albert, Bernard, Bo, Darnell, Jessica, Juliet, Mike, Samantha, Steven]
Descending alphabetical:
[Steven, Samantha, Mike, Juliet, Jessica, Darnell, Bo, Bernard, Albert]
Ascending string lengths:
[Bo, Mike, Juliet, Steven, Albert, Darnell, Bernard, Jessica, Samantha]
Descending string lengths:
[Samantha, Darnell, Bernard, Jessica, Albert, Juliet, Steven, Mike, Bo]

Initial tigers array:
[Carol (89-122-9223), Michael (89-621-7280), Richard (89-443-8227), Singh (89-378-1992), Mikhail (89-310-0482), Makayla (89-745-2905), Tobias (89-122-1211)]
Ascending tiger card number:
[Tobias (89-122-1211), Carol (89-122-9223), Mikhail (89-310-0482), Singh (89-378-1992), Richard (89-443-8227), Michael (89-621-7280), Makayla (89-745-2905)]
Descending tiger card numbers:
[Makayla (89-745-2905), Michael (89-621-7280), Richard (89-443-8227), Singh (89-378-1992), Mikhail (89-310-0482), Carol (89-122-9223), Tobias (89-122-1211)]
Ascending names:
[Carol (89-122-9223), Makayla (89-745-2905), Michael (89-621-7280), Mikhail (89-310-0482), Richard (89-443-8227), Singh (89-378-1992), Tobias (89-122-1211)]
Descending names:
[Tobias (89-122-1211), Singh (89-378-1992), Richard (89-443-8227), Mikhail (89-310-0482), Michael (89-621-7280), Makayla (89-745-2905), Carol (89-122-9223)]
```

## Version4-UsingLambdaFunctionsForComparators

This version is an extension of Version 3. However, here we use Lambda Functions to create our custom comparator in 
Comparators.java

Sample output for version 4 is same as version 3.

## Version5-SortingIntegers-Recursive

Same as version 1 but uses the recursive selection sort methods.

## Version6-SortingGenericTypeNamedT-Recursive

Same as version 2 but uses the recursive selection sort methods.

## Version7-SortingGenericTypeNamedTWithCustomAComparator-Recursive

Same as version 3 but uses the recursive selection sort methods.

## Version8-UsingLambdaFunctionsForComparators-Recursive

Same as version 4 but uses the recursive selection sort methods.