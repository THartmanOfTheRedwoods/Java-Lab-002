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

## Conclusion
Me and my partner played Stump the Chump and in the end the score was 8-9, he won, I was the chump.
We decided to make the game more interesting and open more opportunities for stumping by making a simple array and printing all of the values inside using a for loop.
The first round a kept it simple, I just replaced the L in println with an uppercase I (printIn) but since it makes the typo pop up in red it was pretty easy to catch.
The second round I made things a little more difficult by replacing public class with public main, and he ended up using the compiler to find the issue, so you could say he was a little bit of a chump here. If he made sure to keep closer attention to the syntax used he would've been able to catch the issue.
The third round I replaced the int in the for loop with "var" hoping he wouldn't catch it. It took him some time but he eventually found it.
The fourth round I replaced all of the Ws with double Vs, but it ended up being way more obvious than I thought.
The fifth round I just put a lot of typos in various places. It took him a little time, but he figured it out.