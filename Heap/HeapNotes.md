# Day 12 - Heap Basics (Notes)

## What is a Heap?

A Heap is a special type of **Complete Binary Tree**.

Its primary purpose is to efficiently retrieve the **smallest** or **largest** element.

Unlike a Binary Search Tree (BST), a Heap only maintains ordering between a parent and its children.

---

# Properties of Heap

## 1. Complete Binary Tree

A Heap is always a Complete Binary Tree.

This means:

- Every level is completely filled.
- Only the last level can be incomplete.
- The last level is filled from **left to right**.

Example:

```
        90
      /    \
    70      80
   /  \    /
 40   50  60
```

✅ Complete Binary Tree

---

## 2. Heap Property

There are two types of Heap.

### Max Heap

Parent is always **greater than or equal to** its children.

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

Parent is always **smaller than or equal to** its children.

```
        10
      /    \
    20      30
   /  \    /
 40   50  60
```

Smallest element is always at the root.

---

# Heap vs Binary Search Tree

## Heap

- Parent only compares with its children.
- Left child can be greater or smaller than right child.
- Root always stores Min or Max element.
- Best for Priority based problems.

---

## Binary Search Tree

- Left subtree < Root
- Right subtree > Root
- Best for Searching.

Heap is **NOT** a BST.

---

# Heap Representation using Array

Heap is generally stored inside an array.

Tree

```
        90
      /    \
    70      80
   /  \    /
 40   50  60
```

Array

```
[90, 70, 80, 40, 50, 60]
```

Indexes

```
        0
      /   \
     1     2
    / \   /
   3  4  5
```

---

# Index Formulas

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

Rule

Always insert at the **last available position**.

Reason

To maintain Complete Binary Tree.

Example

Before

```
        90
      /    \
    70      80
   /  \    /
 40   50  60
```

Insert 100

```
        90
      /    \
    70      80
   /  \    / \
 40   50  60 100
```

Compare with parent.

100 > 80

Swap

```
        90
      /    \
    70      100
   /  \    / \
 40   50  60 80
```

Compare again.

100 > 90

Swap

```
        100
       /   \
     70     90
    / \    / \
 40  50  60 80
```

Done.

This process is called **Heapify Up**.

---

# Heap Deletion (Heapify Down)

Rule

Delete only the Root.

Example

```
        90
      /    \
    80      70
   /  \    /
 40   50  10
```

Delete Root.

Move last element to root.

```
        10
      /    \
    80      70
   /  \
 40   50
```

Compare with larger child.

Swap.

```
        80
      /    \
    10      70
   /  \
 40   50
```

Compare again.

Swap.

```
        80
      /    \
    50      70
   /  \
 40   10
```

Done.

This process is called **Heapify Down**.

---

# Why move the last element to the Root?

Because Heap must remain a Complete Binary Tree.

Moving any random node breaks the structure.

---

# Time Complexity

| Operation | Complexity |
|-----------|------------|
| Insert | O(log n) |
| Delete Root | O(log n) |
| Peek Root | O(1) |
| Build Heap | O(n) |

---

# Java PriorityQueue

Java implements Heap using **PriorityQueue**.

## Min Heap (Default)

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
```

Root always contains the smallest element.

---

## Max Heap

```java
PriorityQueue<Integer> pq =
        new PriorityQueue<>((a,b) -> b-a);
```

Root always contains the largest element.

---

# Common PriorityQueue Methods

## offer()

Insert element.

```
pq.offer(10);
```

Time Complexity

```
O(log n)
```

---

## poll()

Remove root.

```
pq.poll();
```

Time Complexity

```
O(log n)
```

---

## peek()

Returns root.

```
pq.peek();
```

Time Complexity

```
O(1)
```

---

## size()

Returns heap size.

```
pq.size();
```

Time Complexity

```
O(1)
```

---

## isEmpty()

Checks if heap is empty.

```
pq.isEmpty();
```

---

# Comparator Tricks

Ascending

```java
(a,b) -> a-b
```

Descending

```java
(a,b) -> b-a
```

Frequency Ascending

```java
(a,b) -> a.getValue()-b.getValue()
```

Frequency Descending

```java
(a,b) -> b.getValue()-a.getValue()
```

Lexicographical

```java
a.compareTo(b)
```

Reverse Lexicographical

```java
b.compareTo(a)
```

Example

```
apple.compareTo(ball)

Negative

apple comes first.
```

---

# Heap Patterns Learned

## Pattern 1

### 215. Kth Largest Element in an Array

Idea

- Maintain Min Heap of size K.
- Remove smallest whenever size exceeds K.
- Root becomes Kth largest.

---

## Pattern 2

### 703. Kth Largest Element in a Stream

Idea

Same pattern as 215.

Difference

Elements arrive continuously.

Maintain fixed size Min Heap.

---

## Pattern 3

### 347. Top K Frequent Elements

Idea

- Count frequency using HashMap.
- Store entries inside Min Heap.
- Heap size remains K.

---

## Pattern 4

### 692. Top K Frequent Words

Idea

HashMap + Min Heap

Comparator

1. Smaller frequency first.
2. If equal frequency,
   lexicographically larger word comes first.

Reason

It should get removed first.

Finally reverse the answer.

---

## Pattern 5

### 451. Sort Characters by Frequency

Idea

HashMap + Max Heap.

Store every character.

Poll highest frequency character.

Append it frequency number of times.

---

# Heap Decision Tree

Need Largest?

↓

Max Heap

---

Need Smallest?

↓

Min Heap

---

Need Top K Largest?

↓

Min Heap of size K

---

Need Top K Smallest?

↓

Max Heap of size K

---

Need Highest Frequency?

↓

HashMap + Heap

---

Need Streaming Data?

↓

Fixed Size Heap

---

Need Running Median?

↓

Two Heaps

(Max Heap + Min Heap)

---

# Key Takeaways

- Heap is a Complete Binary Tree.
- Heap is NOT a BST.
- Root stores Min or Max.
- Insert at last.
- Heapify Up after insertion.
- Delete only Root.
- Move last element to Root.
- Heapify Down after deletion.
- PriorityQueue is Heap implementation in Java.
- Default PriorityQueue is Min Heap.
- Max Heap requires Comparator.
- Top K problems generally use Fixed Size Heap.
- Frequency problems use HashMap + Heap.
- Height of Heap is log n.
- Insert and Delete take O(log n).

---

# Heap Chapter Progress

## ✅ Completed

- Heap Basics
- Java PriorityQueue
- Min Heap
- Max Heap
- Custom Comparator
- Kth Largest Pattern
- Top K Pattern
- Frequency Pattern

---

## 🔜 Next Topic

### 295. Find Median from Data Stream

Topics Covered

- Two Heaps
- Running Median
- Heap Balancing
- Interview Level Heap Problem
