## Exercise 1

In the `pl.coderslab.homeworks.datainput` package, in `Main01.java` file, write a program which:

1. will download the data from the console in the form:
```
Lastname Firstname BirthYear Sex:
```
2. The data will be downloaded until you enter **quit** on the console. Save the data to an array of the **String** type.

3. After entering **quit**, use the above data to create a second array containing only those people who can retire.
It will be 60 years of age for women, 65 for men.
Save the data as `first name + last name`.

3. The code should be included in the method with the signature
 `public static String[] retirement()`.

Sample lines with data input:

```
Johnson Mark 1955 M
McAlister Marianne 1966 K
Roger Stetson 2020 M
```


## Exercise 2

In the `pl.coderslab.homeworks.datainput`package, in the `Main02.java` file create a method with the signature `public static int[] sortedArray()`.

1. Fill the body of the method so that it reads from the console how many numbers should be drawn.
2. The method should create an array and place random values from `[0,100]` in it.
3. It should then sort the array elements and return them.


## Exercise 3

In the `pl.coderslab.homeworks.datainput` package in the `Main03.java` file, create a method with the signature `public static void printTriangle()`.

1. Fill the body of the method so that it reads the value of the int type from the console.
2. The method will write on the console a triangle made up of `x` characters, in which both cathetuses (legs) of the triangle will be equal in length to the value read.

Example for a read value of 5.

````
x
x x
x x x
x x x x 
x x x x x
````


## Exercise 1

In the `pl.coderslab.homeworks.files`package in the `Main01.java` file create a method with the signature `public static int count(String fileName)`.

1. Fill in the body of the method so that it counts and returns the number of characters in a file.


## Exercise 2

In the `pl.coderslab.homeworks.files` package in the `Main02.java` file create a method with the signature `public static int count(String fileName)`.

1. Fill in the body of the method so that it counts and returns the number of words in the file.


## Exercise 3

In the `pl.coderslab.homeworks.files` package in the `Main03.java` file create a method with the signature `public static boolean checkFileExist()`.

1. Fill in the body of the method so that it reads the file name from the console.
2. The method should check if the file exists and then print out `true` or `false`.


## Exercise 4

In the `pl.coderslab.homeworks.files` package in the `Main04.java` file create a method with the signature `public static boolean rewrite()`.
1. Fill in the body of the method so that it reads the file name from the console.
2. Check if the file exists and if it does, create a second file with the suffix "_2", into which the contents of the original file will be saved twice.

Example: 
the loaded file name `text1.txt`, with abc content, will create a file named `text1_2.txt` with content:
````
abc
abc
````
