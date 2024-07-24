# Assignment Four: Stacks and Queues

## Overview

This project demonstrates the implementation and usage of stacks and queues in Java. It includes tasks ranging from using Java's built-in classes to implementing custom data structures, and finally applying these structures to solve real-world problems.

## Project Structure

The project is organized into several classes, each implementing specific functionalities related to stacks and queues. Below is a summary of each class:

### 1. `CharStack.java`

- **Description**: Implements a stack of characters using an `ArrayList`. Provides basic stack operations: `push`, `pop`, `top`, and `isEmpty`.
- **Usage**: Demonstrates basic stack operations and user interaction.

### 2. `CharStackUpdated.java`

- **Description**: Implements a stack of characters using a `LinkedList`. Provides similar operations to `CharStack`, but with a different underlying data structure.
- **Usage**: Demonstrates stack operations with a different data structure.

### 3. `IntQueue.java`

- **Description**: Implements a queue of integers using an array. Provides queue operations: `enqueue`, `dequeue`, `isEmpty`, and `isFull`.
- **Usage**: Demonstrates basic queue operations and capacity handling.

### 4. `IntLinkedList.java`

- **Description**: Contains a method to convert an integer to a `LinkedList` of its digits, starting with the least significant digit.
- **Usage**: Demonstrates conversion from an integer to a `LinkedList` format.

### 5. `QueueReverse.java`

- **Description**: Contains a method to reverse the order of elements in a queue using a stack.
- **Usage**: Demonstrates the use of a stack to reverse a queue's elements.

### 6. `TaskFive.java`

- **Description**: Contains a method to check if a given string is a palindrome using a `CharStack`.
- **Usage**: Demonstrates how to check for palindromes while ignoring non-alphabetic characters and case sensitivity.

### 7. `TaskOne.java`

- **Description**: Demonstrates stack and queue operations by reading numbers from the user, storing them in both a stack and a queue, and printing them in reverse and original order, respectively.
- **Usage**: Demonstrates basic input and output with stacks and queues.

### 8. `TestClass.java`

- **Description**: Provides a menu-driven interface to test the functionalities of all other classes.
- **Usage**: Allows users to select which functionality they want to test and interactively provides results based on the user's choice.

## How to Run

1. **Compile the Classes**: Ensure all Java files are in the same directory and compile them using:
   ```sh
   javac assignmentFour/*.java
   ```

2. **Run the Test Class**: Execute the `TestClass` to interactively test different functionalities:
   ```sh
   java assignmentFour.TestClass
   ```

3. **Follow On-Screen Prompts**: The `TestClass` will provide a menu to choose which functionality to test. Enter the corresponding number to execute a specific test.

## Example Usage

1. **Stack Operations**:
   - Push characters into the stack.
   - Pop characters and check the top element.

2. **Queue Operations**:
   - Enqueue and dequeue integers.
   - Check if the queue is full or empty.

3. **Palindrome Check**:
   - Input a string and check if it is a palindrome.

4. **Queue Reversal**:
   - Input a queue of integers and reverse its order.

5. **Integer to LinkedList Conversion**:
   - Convert an integer to a linked list of digits.

