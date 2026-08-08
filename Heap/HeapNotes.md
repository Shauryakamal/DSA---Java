# Day 12–18 - Heap (Complete Notes)

# What is a Heap?

A Heap is a special type of **Complete Binary Tree** that satisfies the Heap Property.

Its primary purpose is to efficiently retrieve the **minimum** or **maximum** element.

Unlike a Binary Search Tree, Heap does **not** maintain sorted order.

---

# Properties of Heap

## 1. Complete Binary Tree

A Heap is always a Complete Binary Tree.

This means:

- Every level is completely filled except possibly the last.
- The last level is filled from left to right.

Example:

```
        90
      /    \
    70      80
   /  \    /
 40   50  60
```

---

## 2. Heap Property

There are two types of Heap.

### Max Heap

Parent is always greater than or equal to its children.

```
        90
      /    \
    70      80
   /  \    /
 40   50  60
```

Largest element is always at the root.

---

### Min Heap

Parent is always smaller than or equal to its children.

```
        10
      /    \
    20      30
   /  \    /
 40   50  60
```

Smallest element is always at the root.

---

# Heap vs BST

Heap

- Parent only follows Heap Property.
- Left child may be greater than right child.
- Root contains Min or Max.

BST

- Left < Root < Right
- Efficient searching.

Heap is NOT a BST.

---

# Array Representation

Heap is generally stored in an array.

```
        90
      /    \
    70      80
   /  \    /
 40   50  60
```

Array

```
[90,70,80,40,50,60]
```

Index

```
        0
      /   \
     1     2
    / \   /
   3  4  5
```

---

# Formulas

If current index = i

Left Child

```
2*i + 1
```

Right Child

```
2*i + 2
```

Parent

```
(i-1)/2
```

---

# Heap Insertion (Heapify Up)

Steps

1. Insert at last position.
2. Compare with parent.
3. Swap if Heap Property breaks.
4. Repeat until root or property satisfied.

Time

```
O(log n)
```

---

# Heap Deletion (Heapify Down)

Steps

1. Delete root.
2. Move last element to root.
3. Compare with children.
4. Swap with correct child.
5. Repeat.

Time

```
O(log n)
```

---

# Java PriorityQueue

Default

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
```

Default PriorityQueue in Java is **Min Heap**.

---

## Basic Operations

Add

```java
pq.offer(x);
```

or

```java
pq.add(x);
```

Peek

```java
pq.peek();
```

Poll

```java
pq.poll();
```

Size

```java
pq.size();
```

Empty

```java
pq.isEmpty();
```

---

# Max Heap in Java

```java
PriorityQueue<Integer> maxHeap =
new PriorityQueue<>((a,b)->b-a);
```

or

```java
PriorityQueue<Integer> maxHeap =
new PriorityQueue<>(Collections.reverseOrder());
```

---

# Custom Comparator

Example

```java
PriorityQueue<Map.Entry<String,Integer>> pq =
new PriorityQueue<>((a,b)->{

    if(a.getValue()!=b.getValue()){
        return a.getValue()-b.getValue();
    }

    return b.getKey().compareTo(a.getKey());

});
```

Used in

- Top K Frequent Words
- Custom Objects
- Pair Problems

---

# Heap Patterns

## Pattern 1

Top K Largest

Use

```
Min Heap
```

Keep heap size = K.

If size > K

```
poll()
```

Answer

```
peek()
```

Questions

- 215
- 703

---

## Pattern 2

Top K Smallest

Use

```
Max Heap
```

Keep heap size = K.

---

## Pattern 3

Frequency Problems

```
HashMap
↓

Heap
```

Questions

- 347
- 692
- 451

---

## Pattern 4

Distance Problems

Store

```
Distance
↓

Heap
```

Question

- 973

---

## Pattern 5

Two Heaps

Used for

Running Median

Question

- 295

Structure

```
          Median

 Max Heap        Min Heap

 Smaller Half    Larger Half
```

Rules

- Left = Max Heap
- Right = Min Heap

Insertion

```
num <= maxHeap.peek()

↓

Max Heap

Else

↓

Min Heap
```

Balancing

If

```
maxHeap.size() > minHeap.size()+1
```

Move

```java
minHeap.offer(maxHeap.poll());
```

If

```
minHeap.size() > maxHeap.size()
```

Move

```java
maxHeap.offer(minHeap.poll());
```

Median

Odd

```java
maxHeap.peek()
```

Even

```java
(maxHeap.peek()+minHeap.peek())/2.0
```

---

# Time Complexities

Insert

```
O(log n)
```

Delete

```
O(log n)
```

Peek

```
O(1)
```

Heap Construction

```
O(n)
```

---

# Problems Completed

- ✅ PriorityQueue Basics
- ✅ 703. Kth Largest Element in a Stream
- ✅ 973. K Closest Points to Origin
- ✅ 347. Top K Frequent Elements
- ✅ 692. Top K Frequent Words
- ✅ 451. Sort Characters by Frequency
- ✅ 215. Kth Largest Element in an Array
- ✅ 295. Find Median from Data Stream

---

# Interview Patterns Covered

- Min Heap
- Max Heap
- Fixed Size Heap
- HashMap + Heap
- Custom Comparator
- Top K Problems
- Two Heap Pattern
- Running Median

---

# Key Takeaways

- Heap is a Complete Binary Tree.
- Java PriorityQueue is a Min Heap.
- Max Heap requires a custom comparator.
- Heap is ideal for Top K problems.
- Use HashMap + Heap for frequency questions.
- Fixed-size Heap reduces complexity to O(n log k).
- Two Heaps are used for streaming median problems.
- Always identify the pattern before coding.

---

# Heap Chapter Status

✅ Interview Ready