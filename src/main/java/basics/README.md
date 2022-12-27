## Von Neumann Architecture


### What is meant by the term computer architecture?

Computer architecture is a description of the structure of a computer system made from component parts.

It represents the way in which the computer system is arranged.


### Von Neumann Architecture

Von Neumann's Architecture is based on the following



* The computer uses a single processor
* The computer uses one memory for both instructions and data.
* The computer executes programs following the fetch-decode-execute cycle


![](von_neumann_architecture.png)

Read: [link](https://www.javatpoint.com/von-neumann-model)

# Taking Input from the user


### What is meant by user input?

User input is the data which is given by the user.

It is the responsibility of the programmer to parse and process user input.


### Ways to take user input in Java

There are two ways to take user input in Java:


#### Using Scanner

Generic format to declare scanner:

```

// Before the class declaration

import java.util.Scanner;

public class Example{
	public static void main(String[] args){
	    // Declare scanner like this
		Scanner sc = new Scanner(System.in);
    }
}
```

<table>
  <tr>
   <td>Method
   </td>
   <td>Description
   </td>
  </tr>
  <tr>
   <td><code>nextInt()</code>
   </td>
   <td>reads an <code>int</code> value from the user
   </td>
  </tr>
  <tr>
   <td><code>nextFloat()</code>
   </td>
   <td>reads a <code>float</code> value form the user
   </td>
  </tr>
  <tr>
   <td><code>nextBoolean()</code>
   </td>
   <td>reads a <code>boolean</code> value from the user
   </td>
  </tr>
  <tr>
   <td><code>nextLine()</code>
   </td>
   <td>reads a line of text from the user
   </td>
  </tr>
  <tr>
   <td><code>next()</code>
   </td>
   <td>reads a word from the user
   </td>
  </tr>
  <tr>
   <td><code>nextByte()</code>
   </td>
   <td>reads a <code>byte</code> value from the user
   </td>
  </tr>
  <tr>
   <td><code>nextDouble()</code>
   </td>
   <td>reads a <code>doubl</code>e value from the user
   </td>
  </tr>
  <tr>
   <td><code>nextShort()</code>
   </td>
   <td>reads a <code>short</code> value from the user
   </td>
  </tr>
  <tr>
   <td><code>nextLong()</code>
   </td>
   <td>reads a <code>long</code> value from the user
   </td>
  </tr>
</table>

#### Using BufferedReader

Read: [link](https://www.geeksforgeeks.org/how-to-take-input-from-user-in-java/)

Watch: [link](https://www.youtube.com/watch?v=iVbgcByqFic)
