# Insertion Sort

## What is Insertion Sort?

Insertion Sort is a simple sorting algorithm that builds the sorted array one element at a time.

It takes one element from the unsorted part and inserts it into the correct position in the sorted part.

It works similar to:

```text
sorting playing cards in hands
```

---

# How Insertion Sort Works

1. Assume first element is already sorted.
2. Pick next element.
3. Compare with left-side sorted elements.
4. Shift larger elements to the right.
5. Insert current element into correct position.
6. Repeat until array becomes sorted.

---

# Example Dry Run

Initial Array:

```text
5 4 3 2 1
```

---

# Pass 1

Current element:

```text
4
```

Compare with left side:

```text
5 > 4
```

Shift `5` to the right.

```text
5 5 3 2 1
```

Insert `4` at correct position.

```text
4 5 3 2 1
```

---

# Pass 2

Current element:

```text
3
```

Compare:

```text
5 > 3 -> shift
4 > 3 -> shift
```

Array during shifting:

```text
4 5 5 2 1
4 4 5 2 1
```

Insert `3`.

```text
3 4 5 2 1
```

---

# Pass 3

Current:

```text
2
```

Shift larger elements.

```text
2 3 4 5 1
```

---

# Pass 4

Current:

```text
1
```

Shift all larger elements.

```text
1 2 3 4 5
```

Sorted Successfully.

---

# Insertion Sort Code

```java
public class InsertionSort {

    public static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int current = arr[i];
            int j = i - 1;

            // shift larger elements to right
            while (j >= 0 && arr[j] > current) {

                arr[j + 1] = arr[j];
                j--;
            }

            // insert at correct position
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};

        insertionSort(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
```

---

# Understanding Every Condition

---

# Why `i = 1`?

```java
for(int i = 1; i < n; i++)
```

## Reason

First element is already considered sorted.

Example:

```text
5 | 4 3 2 1
```

The left side:

```text
5
```

is already sorted.

Now insert remaining elements one by one.

---

# Why `j = i - 1`?

```java
int j = i - 1;
```

## Reason

We compare current element with previous sorted elements.

Example:

```text
4 5 | 3 2 1
```

Current:

```text
3
```

Start checking from:

```text
5
```

which is:

```java
i - 1
```

---

# Why Use While Loop?

```java
while(j >= 0 && arr[j] > current)
```

---

## Condition 1

```java
j >= 0
```

### Reason

Prevents array index out of bounds.

Without this:

```java
arr[-1]
```

becomes invalid.

---

## Condition 2

```java
arr[j] > current
```

### Reason

If left element is bigger:

* shift it right.

This creates space for insertion.

---

# Why Do We Shift?

```java
arr[j + 1] = arr[j];
```

## Reason

Move larger elements one step right.

Example:

```text
5 4 3 2 1
```

Current:

```text
4
```

Shift:

```text
5 5 3 2 1
```

This creates empty space.

---

# Most Important Line

```java
arr[j + 1] = current;
```

## Why?

After shifting:

* `j` moves one step extra left.

Correct insertion position becomes:

```text
j + 1
```

---

# Example

Current array:

```text
2 4 5 3 1
```

Current element:

```text
3
```

---

# Shifting

```text
5 > 3 -> shift
2 4 5 5 1

4 > 3 -> shift
2 4 4 5 1
```

Now:

```text
2 < 3
```

Loop stops.

Current `j`:

```text
0
```

Correct position for `3` is:

```text
after index 0
```

which is:

```java
j + 1
```

So:

```java
arr[j + 1] = current;
```

Final:

```text
2 3 4 5 1
```

---

# Why Not `arr[j] = current`?

Because:

```java
j
```

already points to:

* smaller element
* or invalid index

Correct insertion place is AFTER it.

That is why:

```java
arr[j + 1]
```

---

# Time Complexity

## Worst Case

Reverse sorted array:

```text
O(n²)
```

because every element shifts completely.

---

## Average Case

```text
O(n²)
```

---

## Best Case

Already sorted array:

```text
O(n)
```

because no shifting happens.

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

Equal elements maintain their original order.

---

# Adaptive or Not?

```text
YES
```

Works very efficiently for nearly sorted arrays.

---

# When To Use Insertion Sort

## Use When:

### 1. Array is Nearly Sorted

Insertion Sort performs very fast.

---

### 2. Small Arrays

Efficient for tiny datasets.

---

### 3. Learning Sorting Logic

Helps understand:

* shifting
* insertion logic
* sorted partitions

---

### 4. Used Inside Advanced Algorithms

Many advanced sorting algorithms use insertion sort internally for small partitions.

---

# When NOT To Use

Avoid for:

* large random datasets
* huge arrays
* high-performance systems

because:

```text
O(n²)
```

becomes slow.

---

# Comparison With Bubble Sort

| Feature        | Bubble Sort | Insertion Sort       |
| -------------- | ----------- | -------------------- |
| Best Case      | O(n)        | O(n)                 |
| Worst Case     | O(n²)       | O(n²)                |
| Stable         | Yes         | Yes                  |
| Adaptive       | Yes         | Yes                  |
| Main Operation | Swapping    | Shifting             |
| Better For     | Basics      | Nearly sorted arrays |

---

# Comparison With Selection Sort

| Feature   | Selection Sort | Insertion Sort       |
| --------- | -------------- | -------------------- |
| Best Case | O(n²)          | O(n)                 |
| Stable    | No             | Yes                  |
| Adaptive  | No             | Yes                  |
| Swaps     | Less           | More shifting        |
| Best For  | Minimum swaps  | Nearly sorted arrays |

---

# Main Intuition

Insertion Sort:

1. Take one element
2. Compare with sorted left side
3. Shift larger elements
4. Insert into correct position
5. Repeat

---

# Important Interview Point

Insertion Sort is:

```text
simple, stable, adaptive,
and efficient for nearly sorted arrays.
```

Main purpose:

* learning
* small datasets
* nearly sorted data
* internal optimization in advanced sorts
