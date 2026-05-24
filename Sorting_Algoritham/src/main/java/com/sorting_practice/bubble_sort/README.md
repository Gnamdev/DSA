# Bubble Sort

## What is Bubble Sort?

Bubble Sort is a simple sorting algorithm that repeatedly compares adjacent elements and swaps them if they are in the wrong order.

After every pass, the largest unsorted element moves to its correct position at the end of the array.

This movement of large elements toward the end is why it is called:

```text
Bubble Sort
```

because elements “bubble up” to the correct position.

---

# Example

Initial Array:

```text
4 5 2 3 1
```

## Pass 1

Compare adjacent elements:

```text
4 5 -> no swap
5 2 -> swap
4 2 5 3 1

5 3 -> swap
4 2 3 5 1

5 1 -> swap
4 2 3 1 5
```

Largest element `5` reaches correct position.

---

## Pass 2

```text
4 2 -> swap
2 4 3 1 5

4 3 -> swap
2 3 4 1 5

4 1 -> swap
2 3 1 4 5
```

Now `4` is fixed.

---

## Pass 3

```text
2 3 -> no swap
3 1 -> swap
2 1 3 4 5
```

---

## Pass 4

```text
2 1 -> swap
1 2 3 4 5
```

Sorted Successfully.

---

# Bubble Sort Code

```java
public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // swap if left element is greater
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 3, 1};

        bubbleSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

---

# Understanding the Conditions

---

# Why `i < n - 1`?

```java
for(int i = 0; i < n - 1; i++)
```

## Reason

After every pass:

* one largest element reaches correct position.

So after:

```text
1st pass -> 1 element fixed
2nd pass -> 2 elements fixed
3rd pass -> 3 elements fixed
```

For an array of size `n`, maximum required passes are:

```text
n - 1
```

because after fixing `n-1` elements,
last element is automatically sorted.

---

# Why `j < n - i - 1`?

```java
for(int j = 0; j < n - i - 1; j++)
```

This is the MOST IMPORTANT condition.

---

## Reason 1: Last Elements Become Sorted

After every pass:

* one element becomes fixed at the end.

So no need to compare already sorted elements.

---

## Example

### Pass 1

```text
4 5 2 3 1
```

After pass:

```text
4 2 3 1 | 5
```

`5` is fixed.

So next pass:

* ignore last element.

---

### Pass 2

```text
2 3 1 | 4 5
```

Now `4` and `5` fixed.

Again reduce comparisons.

---

# Why `-1`?

Because we compare:

```java
arr[j] and arr[j+1]
```

If `j` reaches last index,
then:

```java
arr[j+1]
```

becomes invalid.

---

## Example

Array size:

```text
n = 5
```

Indexes:

```text
0 1 2 3 4
```

Maximum valid comparison:

```text
arr[3] and arr[4]
```

But:

```text
arr[4] and arr[5]
```

invalid ❌

So we use:

```java
j < n - i - 1
```

---

# Optimized Bubble Sort

If array already sorted,
we can stop early.

```java
public static void bubbleSort(int[] arr) {

    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {

        boolean swapped = false;

        for (int j = 0; j < n - i - 1; j++) {

            if (arr[j] > arr[j + 1]) {

                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

                swapped = true;
            }
        }

        // already sorted
        if (!swapped) {
            break;
        }
    }
}
```

---

# Time Complexity

## Worst Case

Reverse sorted array:

```text
O(n²)
```

---

## Average Case

```text
O(n²)
```

---

## Best Case (Optimized)

Already sorted:

```text
O(n)
```

because no swaps happen.

---

# Space Complexity

```text
O(1)
```

## Reason

No extra array used.
Sorting happens inside same array.

This is called:

```text
In-place sorting
```

---

# Stable or Not?

```text
YES
```

Equal elements maintain original order.

---

# Adaptive or Not?

```text
YES
```

Optimized Bubble Sort performs well for already sorted arrays.

---

# When To Use Bubble Sort

## Use Bubble Sort When:

### 1. Learning Sorting Basics

Best algorithm for understanding:

* swapping
* loops
* sorting concepts

---

### 2. Small Arrays

Works okay for tiny datasets.

---

### 3. Nearly Sorted Arrays

Optimized Bubble Sort performs efficiently.

---

# When NOT To Use Bubble Sort

Avoid for:

* large datasets
* production applications
* competitive programming large constraints

because:

```text
O(n²) is slow
```

---

# Bubble Sort Properties Summary

| Property         | Value |
| ---------------- | ----- |
| Best Case        | O(n)  |
| Average Case     | O(n²) |
| Worst Case       | O(n²) |
| Space Complexity | O(1)  |
| Stable           | Yes   |
| Adaptive         | Yes   |
| In-place         | Yes   |

---

# Main Intuition

Bubble Sort repeatedly:

1. Compare adjacent elements
2. Swap if wrong order
3. Largest element moves to end
4. Repeat for remaining unsorted array

---

# Important Interview Point

Bubble Sort is:

```text
Easy to understand
but inefficient for large data.
```

Main purpose:

* learning
* fundamentals
* interview basics
