## Exercise 1

Caesar's cipher is the cipher that Julius Caesar used to encrypt his letters to Cicero.

In the `en.coderslab.homeworks.arrays` package, place a method with the signature `public static String replaceChar(String str, char forReplace, char replacement)` in the file `Main02.java`.

1. Fill in the body of the method so that it returns the text encrypted with Caesar's code (in the `str` replace each `forReplace` character with a `replacement` character).


## Exercise 2

In the `pl.coderslab.homeworks.strings` package in the `Main02.java` file place a modified method from the homework 1 with the signature `public static String encode(String str, int shift)`.
 
1. `shift` - indicates a character shift
2. Add the decryption method `public static String decode(String str, int shift)`.


## Exercise 3

In the `pl.coderslab.homeworks.strings` package, place a method with the signature `public static String upperCase(String str, int index)`.

1. The method returns a `str` string, in which the characters in positions divisible by `index` have been converted to uppercase.


## Exercise 4

In the `pl.coderslab.homeworks.strings` package in the file `Main04.java`, place a method with the signature `public static int triple(String str)`
1. The method returns the number of triple occurrences of characters in the string.

Example: 
for qazbbbwsx -> 1, 
for aaawsxbbb -> 2


## Exercise 5

In the `pl.coderslab.homeworks.strings` package in the file `Main05.java`, place a method with the signature `public static String replaceChar(String str, char forReplace, char replacement)`.

1. Fill in the body of the method so that it returns strings created by the conversion in `str`
 of all `forReplace` characters by `replacement` characters.


## Exercise 6

In the `pl.coderslab.homeworks.strings` package in the file `Main06.java`, place a method with the signature `public static String encode(String str, int shift)`.

1. `shift` - means the shift of characters,
2. add a decrypting method `public static String decode(String str, int shift)`.


## Exercise 7

In the `pl.coderslab.homeworks.strings` package in the `Main07.java` file, place a method with the signature `public static String censor(String str, String[] words)`.

1. The method:

* will break the text string into an array of words,
* will check it for the forbidden words from the `words` array,
* if so -- it will turn them into four asterisks (****)
* will join the array back into a string and return the value.
