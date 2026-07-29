# Day 12 - Heap Basics (Notes)

## What is a Heap?

Heap is a special type of Binary Tree.

Its main purpose is to quickly find the **largest** or **smallest** element.

Unlike a normal Binary Tree, Heap follows some special rules.

---

# Properties of Heap

## 1. Complete Binary Tree

A Heap is always a Complete Binary Tree.

This means:

- Every level is completely filled.
- Only the last level can be incomplete.
- Last level is always filled from **left to right**.

Example:

        90
      /    \
    70      80
   /  \    /
 40   50  60

✅ Complete Binary Tree

---

## 2. Heap Property

There are two types of Heap.

### Max Heap

Parent is always greater than or equal to its children.

Example:

        90
      /    \
    70      80
   /  \    /
 40   50  60

Largest element is always at the root.

---

### Min Heap

Parent is always smaller than or equal to its children.

Example:

        10
      /    \
    20      30
   /  \    /
 40   50  60

Smallest element is always at the root.

---

# Heap vs Binary Search Tree (BST)

Heap:

- Parent only compares with its children.
- Left child can be greater or smaller than right child.
- Root always contains Min or Max.

BST:

- Left subtree < Root
- Right subtree > Root
- Used for searching.

Heap is NOT a BST.

---

# Heap Representation using Array

We usually store Heap inside an array.

Example:

        90
      /    \
    70      80
   /  \    /
 40   50  60

Array:

[90, 70, 80, 40, 50, 60]

Index:

        0
      /   \
     1     2
    / \   /
   3  4  5

---

# Formulas

If current index = i

Left Child

2*i + 1

Right Child

2*i + 2

Parent

(i-1)/2

---

# Heap Insertion (Heapify Up)

Rule:

Always insert the new element at the last available position.

Reason:

To maintain Complete Binary Tree.

Example:

Insert 100

Before

        90
      /    \
    70      80
   /  \    /
 40   50  60

Insert at last

        90
      /    \
    70      80
   /  \    / \
 40   50  60 100

Now compare with parent.

100 > 80

Swap

        90
      /    \
    70      100
   /  \    / \
 40   50  60 80

Again compare.

100 > 90

Swap

        100
       /   \
     70     90
    / \    / \
 40  50  60 80

Done.

This process is called Heapify Up.

---

# Heap Deletion (Heapify Down)

Rule:

Delete only the Root.

Example

        90
      /    \
    80      70
   /  \    /
 40   50  10

Delete Root.

Move the last element to the root.

        10
      /    \
    80      70
   /  \
 40   50

Now compare with children.

Largest child = 80

Swap

        80
      /    \
    10      70
   /  \
 40   50

Again compare.

Largest child = 50

Swap

        80
      /    \
    50      70
   /  \
 40   10

Done.

This process is called Heapify Down.

---

# Why move the last element to the root?

Because we must maintain a Complete Binary Tree.

If we randomly move any other node,

the tree will no longer remain complete.

---

# Time Complexity

Insertion

Heapify Up

O(log n)

Deletion

Heapify Down

O(log n)

Access Root

O(1)

---

# Key Takeaways

- Heap is a Complete Binary Tree.
- Max Heap → Largest element at Root.
- Min Heap → Smallest element at Root.
- Heap is NOT a BST.
- Insert at the last position.
- Heapify Up after insertion.
- Delete only the Root.
- Move last element to the Root.
- Heapify Down after deletion.
- Height of Heap = log n.
- Therefore insertion and deletion both take O(log n).

---

# Next Topic

Java PriorityQueue

- add()
- offer()
- peek()
- poll()
- Min Heap
- Max Heap