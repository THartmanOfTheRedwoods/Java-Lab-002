# Java-Lab-002

## Variables, Types and Operators

Be able to explain what variables are. Understand variable types, allowed names, and valid values.
Know how to create and use string, integer, floating-point, and boolean variables.

### Part 1 - PricelessScript.java - [MasterCard YouTube Ad](https://www.youtube.com/watch?v=Q_6stXKGuHo)

The lab template contains a program that prints the following:
```
2 tickets: $28.00
2 hotdogs, 2 popcorn, 2 sodas: $18.00
1 autographed baseball $45.00
real conversation with 11 year old son: priceless
true
```

Ignore the code that you don't fully recognize and concentrate on changing the variables to alter the MasterCard *Priceless* script to say:
```
3 tickets: $42.00
3 hotdogs, 3 popcorn, 3 sodas: $27.00
2 autographed baseball $90.00
watching the Giants win: priceless
false
```

### Part 2 - Interpretation
Take note of the various variables and their data types. Write a brief summary in this section of the README.md file listing the:
* Variable name
* Its data type
* and example values you can assign them.

#### Interpretation Answers
The following are all data type String variables
```
String scriptTemplateLine1
String scriptTemplateLine2
String scriptTemplateLine3
String scriptTemplateLine4
String priceless
```
You can assign Strings of words and numbers as long as they are encased by " ". Such as "2 autographed baseballs", and "Hello world!". 
You cannot store integers such as 49 by themselves, however.

The following is data type int.
```
int people
```
You can assign whole numbers to an int, such as 48, 2003, etc...

The following is data type float
```
float ticketPrice
```
This is a 32 bit floating point variable and you can assign fractions and integers such as 12.5f, 14.0f etc.

The following is data type double
```
double itemPrice
```
This is a double precision floating point variable and you can store fractions as well as integers such as 9.0, 1.0, 6.9, etc.

The following is data type boolean
```
boolean trueOrFalse
```
You can only assign either true or false to a boolean. Nothing else will be accepted.

Next give TWO example variable names and TWO example variable assignments that are *WRONG* and explain why.
* Hint: your IDE can help you discover these!
#### Examples of things that are wrong Answers
```
string thisiswrong
Int thisisalsowrong
```
Both of these are wrong because data types are case sensitive and String must start with a capital "S" and int must start with a lowercase "i"
```
String thisiswrong = 123;
```
This is wrong because you cannot assign an integer to a String data type. 
```
Int thisisalsowrong = "big mistake"
```
This is wrong because you cannot assign a String to an integer data type.
### Part 3 - Bonus: Play around with Java String Format Specifiers.

Pick several of the Java format specifiers below and define variables of the correct type utilize *sout* and *String.format* to view the resulting formats.

![Format Specifiers](JavaStringFormatSpecifiers.png)

### Part 4 - Submission
* Just as you did last week (Reference the Lab video in your Week 1 module), create a Spring2023 feature branch of your code
* Commit your working code to your local copy
* Push it to your Remote/origin branch (i.e. GitHub: Spring2023 -> origin/Spring2023)
* Then issue a Pull request to my instructor branch
    * Make sure to save the Pull request URL and submit it for the lab.
