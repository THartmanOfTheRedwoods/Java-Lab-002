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
# H1 STUMP THE CHUMP RESULTS
My partner did not use the compiler in any round and successfully fixed the code each time, i had to use the compiler in both round 3 and 5. In the first round I noticed the "t" placed unusaully, so I removed and ran code. In round 2 I noticed the code was missing a } at the end, since there needs to be two instead of one. In round 3 I noticed it said "StumpTeChump", so i had to change it to match the java file name. The reason I used the compiler in round 3 was because I could not realize that I needed the "void" after public. In round 4 I noticed my partner removed the // in "Initially working program". And in round 5 I noticed that a lot of the }'s were replaced with paranthesis. As far as the other errors I could not understand so I had to use the compiler. The final score was partner- 10, me - 8.

---
1. rd. 1
Partner's:

   public class StumpTheChump {
   // Initially working program.    
   public static void main(String[] args) {
   t
   System.out.println("Hi Chump, can you be stumped?");
   }
   }

tanner's:

public class StumpTheChump {
// Initially working program.
public static void main(String[] args) {System.out.println("Hi Chump, can you be stumped?")
}
}
---
2. rd.2
Partner's: 

   public class StumpTheChump {
   // Initially working program.
   public static void main(String[] args) {
   System.out.println("Hi Chump, can you be stumped?");
   }

tanner's:

public class StumpTheChump {
// Initially working program.
public static void main(String args){System.out.println("Hi Chump, can you be stumped?");
}
}



---
3. rd.3
Partner's: 

public class StumpTeChump {
   // Initially working program.
   public static main(String[]args){System.out.println("Hi Chump, can you be stumped?");
   }
   }

**used compiler**

tanner's:

public class StumpTheChump {
// Initially working program.
public static void main(String[] args){System.out.printIn(("Hi Chump, can you be stumped?")):
}
}
---

4. rd. 4
Partner's:   
public class StumpTheChump {
   Initially working program.
   public static void main(int[] args){System.println("Hi Chump, can you be stumped?);
   }
   }



tanner's:

public class StumpTheChump {
//Initially working program.
public static void main(String[] args)[System.out.println('Hi Chump, can you be stumped?");
}
}
---

5. rd. 5 partner's:

public StumpTheChump (
//Initially working program.
public static void main(String[] args)(System.out.println{"Hi Chump, can you be stumped?"};
)
)
used compiler


tanner's:

public class StumpTheChump {
//Initially working program.
public class void main(String() args).{System.out.println("Hi Chump, can you be stumped?");
}
]
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