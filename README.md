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

## <span style="color:purple">***Stump the Chump Results:***</span>
In an attempt to stump my partner, I first changed the line <span style="color:yellow">public static void main(String[ ] args) {</span> by deleting the word "void" and changing the [] to (). Then I deleted the ';' after the line <span style="color:yellow">System.out.println(y/x)</span> and changed println to print. I then threw in a little integer division with the line <span style="color:yellow">System.out.print(x / y)</span> [sic] and deleted one of the closing "}" from the end of the program.
My partner and I did not have a thorough discussion since this all happened over comments in Canvas, but they were able to find all errors prior to running the program.

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