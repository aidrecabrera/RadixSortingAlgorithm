# Radix Sort Java Implementation

![GitHub](https://img.shields.io/github/license/aidrecabrera/radixsortingalgorithm)
![GitHub last commit](https://img.shields.io/github/last-commit/aidrecabrera/radixsortingalgorithm)

This repository contains a Java implementation of the Radix Sort algorithm for sorting integer arrays. Radix Sort is a non-comparative sorting algorithm that sorts numbers based on their digits.

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
    int[] array = {170, 45, 75, 90, 802, 24, 2, 66};
    int size = array.length;

    RadixSort sorter = new RadixSort();
    sorter.radixSort(array, size);

    // Print the sorted array
    System.out.println(Arrays.toString(array));
}
```
