# Radix Sort Java Implementation

![GitHub](https://img.shields.io/github/license/aidrecabrera/radixsortingalgorithm)
![GitHub last commit](https://img.shields.io/github/last-commit/aidrecabrera/radixsortingalgorithm)

This repository contains a Java implementation of the Radix Sort algorithm for sorting integer arrays. Radix Sort is a non-comparative sorting algorithm that sorts numbers based on their digits.

## Table of Contents

- [Introduction](#introduction)
- [Usage](#usage)
- [License](#license)

## Introduction

Radix Sort is an efficient sorting algorithm that works well for sorting integers. Unlike comparison-based sorting algorithms like quicksort or mergesort, Radix Sort sorts numbers by their individual digits. This makes it suitable for specific types of data and can be especially useful for large datasets with a fixed number of digits.

The Java code in this repository provides a straightforward implementation of Radix Sort, complete with detailed comments explaining each step of the algorithm.

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
