# Selection Sort

## How Selection Sort Works

Selection Sort repeatedly:

1. Finds the minimum element
2. Places it at the correct position
3. Shrinks the unsorted part

Example:

```text
5 4 3 2 1

Pass 1 -> find min = 1 -> swap with 5
1 4 3 2 5

Pass 2 -> find min = 2
1 2 3 4 5
```

---

# Code

```java id="h41wyu"
public class SelectionSortAlgo {

    public static void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int miniIndex = i;

            // find minimum element
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[miniIndex]) {
                    miniIndex = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[miniIndex];
            arr[miniIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};

        selectionSort(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
```

---

# Time Complexity

## Best Case

```text id="gupux6"
O(n²)
```

## Average Case

```text id="5wr3hb"
O(n²)
```

## Worst Case

```text id="k5b7xa"
O(n²)
```

Because every time:

* we search the whole remaining array
* nested loops run

Total comparisons:

```text id="qdghjk"
n(n-1)/2
```

---

# Space Complexity

```text id="ep4b4r"
O(1)
```

Why?

* No extra array used
* Sorting done inside same array

This is called:

```text id="zq8zho"
In-place sorting
```

---

# Stable or Not?

```text id="1rkrjlwm"
NOT Stable
```

Equal elements may change order after swapping.

---

# Adaptive?

```text id="2gx0dx"
NO
```

Even if array is already sorted,
it still checks all elements.

So best case is also:

```text id="3fms7s"
O(n²)
```

---

# When To Use Selection Sort

## Use When

### 1. Array size is very small

Good for:

* learning
* interviews
* tiny datasets

---

### 2. Swaps are costly

Selection sort performs:

```text id="pwotm9"
minimum swaps
```

At most:

```text id="90v75q"
n-1 swaps
```

This is its biggest advantage.

---

# When NOT To Use

Do NOT use for:

* large arrays
* production systems
* competitive programming big constraints

Because:

```text id="a71jmr"
O(n²) is slow
```

---

# Comparison With Bubble Sort

| Feature   | Selection Sort | Bubble Sort    |
| --------- | -------------- | -------------- |
| Best Case | O(n²)          | O(n) optimized |
| Swaps     | Less           | More           |
| Stable    | No             | Yes            |
| Adaptive  | No             | Yes            |
| Easy      | Easy           | Easy           |

---

# Comparison With Insertion Sort

| Feature                | Selection | Insertion     |
| ---------------------- | --------- | ------------- |
| Best Case              | O(n²)     | O(n)          |
| Adaptive               | No        | Yes           |
| Good for Nearly Sorted | No        | Yes           |
| Swaps                  | Less      | More shifting |

---

# Main Point To Remember

Selection Sort:

* Finds minimum
* Places it correctly
* Uses minimum swaps
* But always takes O(n²) time
