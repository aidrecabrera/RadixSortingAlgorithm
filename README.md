<h1 align="center">Radix Radicals: Radix Sort Java Implementation</h1>



<div align="center">

  <a target="_blank" href="https://github.com/aidrecabrera/RadixSortingAlgorithm/blob/master/src/RadixSort.java">![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)</a>
  <a target="_blank" href="https://malayancollegesmindanaoo365-my.sharepoint.com/:v:/g/personal/pdvillorente_mcm_edu_ph/EegsrpD_U41DoKdZ190r4xQBQ6BXXk-BjPtVJ408ZRh7Pw?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJPbmVEcml2ZUZvckJ1c2luZXNzIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXciLCJyZWZlcnJhbFZpZXciOiJNeUZpbGVzTGlua0RpcmVjdCJ9fQ&e=GnDjny">![OneDrive](https://img.shields.io/badge/OneDrive-0078D4.svg?style=for-the-badge&logo=microsoftonedrive&logoColor=white)</a>
  <a target="_blank" href="https://www.youtube.com/watch?v=s1_yGrJVkhI&t=4s">![YouTube](https://img.shields.io/badge/YouTube-%23FF0000.svg?style=for-the-badge&logo=YouTube&logoColor=white)</a>


</div>

This repository contains a Java implementation of the Radix Sort algorithm for sorting integer arrays. Radix Sort is a non-comparative sorting algorithm that sorts numbers based on their digits. This is a supplementary material for the Radix Radicals Algorithm Simulation for DSA.

https://github.com/aidrecabrera/RadixSortingAlgorithm/assets/61798731/72cbacb2-8686-4350-b63e-7b9fb3638d0d

## Table of Contents

- [Introduction](#introduction)
- [Methods Documentation](#methods-documentation)
  - [countingSort](#countingsort)
  - [getMax](#getmax)
  - [radixSort](#radixsort)
- [Usage](#usage)

## Introduction

Radix Sort is an efficient sorting algorithm that works well for sorting integers. Unlike comparison-based sorting algorithms like quicksort or mergesort, Radix Sort sorts numbers by their individual digits. This makes it suitable for specific types of data and can be especially useful for large datasets with a fixed number of digits.

The Java code in this repository provides a straightforward implementation of Radix Sort, complete with detailed comments explaining each step of the algorithm.

## Methods Documentation

### `countingSort`

```java
/**
 * Sorts an array using the counting sort algorithm for a specific digit position.
 *
 * @param array The array to be sorted.
 * @param size  The size of the array.
 * @param place The current digit position for sorting.
 */
void countingSort(int[] array, int size, int place) {
    // ... Implementation ... 
}
```

The `countingSort` method is responsible for sorting the elements of an array at a specific digit position. It uses the counting sort algorithm to distribute elements into buckets based on their digit values. After sorting, it copies the sorted elements back to the original array.

### `getMax`

```java
/**
 * Find the maximum element in an array.
 *
 * @param array The array to find the maximum element from.
 * @param n     The size of the array.
 * @return The maximum element in the array.
 */
int getMax(int[] array, int n) {
    // ... Implementation ...
}
```

The `getMax` method is used to find the maximum element in an array. It iterates through the array and returns the largest element. This maximum element is essential for determining how many times the sorting process should be performed.

### `radixSort`

```java
/**
 * Sorts an integer array using the Radix Sort algorithm.
 *
 * @param array The array to be sorted.
 * @param size  The size of the array.
 */
void radixSort(int[] array, int size) {
    // ... Implementation ...
}
```

The `radixSort` method orchestrates the entire Radix Sort algorithm. It first finds the maximum element in the array using `getMax` and then iteratively performs counting sort for each digit position, starting from the least significant digit and moving to the most significant digit.

## Usage

To use the Radix Sort implementation in your Java project, follow these steps:

1. Clone this repository or download the `RadixSort.java` file.
2. Include the `RadixSort.java` file in your Java project.
3. Create an instance of the `RadixSort` class.
4. Call the `radixSort` method, passing in the array to be sorted and its size.

Example usage:

```java
public static void main(String[] args) {
    int[] array = { 274, 1024, 1377, 2698, 1936, 749, 1157, 2106, 2424, 1854 };
    int size = array.length;

    RadixSort sorter = new RadixSort();
    sorter.radixSort(array, size);

    // Print the sorted array
    System.out.println(Arrays.toString(array));
}
```

