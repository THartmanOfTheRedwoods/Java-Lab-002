# Java Lab 002: Stump the Chump and Date Display

## Part 1: Stump the Chump

**Objective:**
Engage in a programming challenge with a partner to identify and fix errors in a Java program. Gain points based on the ability to find errors without compiling or with compiler assistance.

HINT: CR Computer Science Discord groups are a great way to play this game remotely!

**Instructions:**
1. Fork this repository to your GitHub account.
2. Clone the forked repository locally to your machine.
3. Create a new branch named Feature01.

**Stump the Chump:**
- Play with a partner.
- Start with a correctly compiling and running program.
- One player looks away while the other adds an error.
- The first player attempts to find and fix the error.
- Points System:
    - 2 points: Finding the error without compiling.
    - 1 point: Finding the error using the compiler.
    - Opponent gets a point if the error isn't found.

**After 5 rounds, modify this README.md with a paragraph describing your attempt to stump your partner and the steps your partner took to identify and correct the error or the steps you think they should have used if they didn't solve the problem.**

**Reflection:**
* I attempted to stump my partner by including a few simple bugs. Most of the bugs were taking advantage of the case-sensitive nature of declaration and assignment statements. I also purposefully included some incorrect punctuation.I made sure the punctuation was similar to the correct style so as not to stand out too much. I also left out the last closing curly bracket to see if that would be noticed. Unfortunately, at the time of this submission my partner has not yet attempted to identify my bugs. I would recommend that they go line by line to look for punctuation and capitalization errors as well as paying attention to the type of variables that are declared and the format of the values assigned.
* The errors I found in my partner's code are as follows:
  1. Static should not be capitalized.
  2. The "minute" variable assignment should end with " ; ".
  3. System should be capitalized.
  4. There should be a space at the end of the string "the current time is".
  5. The statement printing "hour" is printing a string containing the characters "hour". To return the value of the hour variable no quotations should be used.


---

## Part 2: Date Display Program

**Objective:**
Develop a Java program to display dates in different formats using string concatenation. Practice gradual program development by adding statements step by step.

**Steps:**
1. Create a new Java file in the **src** directory named `Date.java` with a Hello World program as a base.
2. Define variables `day`, `date`, `month`, and `year`.
3. Assign values to represent today's date.
4. Display each variable's value on separate lines for initial verification.
5. Compile and run the program before proceeding.
6. Modify the program to display the date in standard American format (e.g., Thursday, July 18, 2019).
7. Further modify the program to display the date in European format.

**Additional Guidance:**
For formatting, consider using [Java Format Specifiers](FormatSpecifiers.md) for formatting your date text.

## Submission
Just as you did in the first lab (Reference the Lab video in your Week 1 module):
1. create a Feature01 branch of your code if you haven't already.
2. Commit your working code and changes to your local copy/Feature01 branch
3. Push it to your Remote/origin branch (i.e. GitHub: Feature01 -> origin/Feature01)
4. Then issue a Pull request to my instructor repo
5. **Make sure to COPY the Pull request URL and submit it for the lab/assignment in Canvas.**

Enjoy the learning process!