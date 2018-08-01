## Contribute

Please follow these guidelines if you want to contribute and get your code merged in the main repository.

* In case of typos, please just make the required changes and follow these [steps](#steps-to-merge).

* If you have made some changes in the current code, then please make another function and add to the existing code.

```java
public static void main(String[] args){
	String a = "abc";
	String b = "bca";
	System.out.println(checkPermutation1(a, b));
}

// Approach Description - Time Complexity
public static boolean checkPermutation1(String a, String b){
	// Existing code
}

// Iterative solution - O(n)
public static boolean checkPermutation2(String a, String b){
	// Your code
}
```

* If you want to add a solution to existing problem in another language like C++ or Python, then create a new file with the same name as existing one with your file extension like this:

``` 
- Fibonacci.java
- Fibonacci.cpp
- Fibonacci.py
```

* If you want to add solution to a new problem, then before adding it, please make sure that it is accepted by Hackerrank and getting the maximum score. After that, just add your file following the correct [naming conventions](#naming-conventions).


## Steps to Merge

Follow these steps to get your code merged:

* Fork this repository

* Make changes

* Create a commit

* Push your changes to your forked repository

* Create a pull request
 
 
## Naming Conventions
 
*  Use Pascal Casing while naming your files __i.e.__ in case of a problem with its name as **Problem Name** or **problem NAME**, your solution file should be named **ProblemName**.

* The file name should be succeeded by its correct extension.

* File name should start with an alphabet.

* It may contain numbers also.

	Eg. Solution of _Game of Stones_ in Java will be **GameOfStones.java**