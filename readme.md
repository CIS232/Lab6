# Lab 6: Chapter 15
**Due:** May 9th by 6:30 PM

## Question 1: _maxElement_ Method

Write a static method named *maxElement* in edu.carrollcc.cis232.Question1 class that takes only an *int[]* as an argument and returns the largest value. The method should use recursion to find the largest element.  If the int[] argument has no elements or is null, throw an IllegalArgumentException.  Demonstrate the method in the Question1 main method.
	
**Points breakdown**

- Technical: 25 points
- Style: 10 points
- Total: 35 points

## Question 2: Palindrome Detector

A palindrome is any word, phrase, or sentence that reads the same forward and backwards. Here are some well-known palindromes:

	Able was I, ere I saw Elba
	A man, a plan, a canal, Panama
	Desserts, I stressed
	Kayak

Write a static boolean method named *isPalindrome* that uses recursion to determine whether a *String* argument is a palindrome. The method should return true if the argument reads the same forward and backwards. Demonstrate the method in the Question2 main method.

	
**Points breakdown**

- Technical: 25 points
- Style: 10 points
- Total: 35 points

----
### How to submit the lab
This section outlines how to get the lab on to your computer and how to submit it.

1. Fork the Chapter 16 lab repository
2. Import the project into Eclipse
    1. Click File->Import...
    2. Choose Git->Projects from Git
    3. Choose "Clone URI", press Next
    4. Copy the clone URI on **your forked** github repository (if it has CIS232-SP2016 in the url, it is the wrong url)
    5. Paste the URI into the Eclipse window
    6. Set your GitHub user name and password, leave everything else as it is.
    7. Press Next
    8. Choose Master on the "Branch Selection" screen and press Next
    9. Choose a local destination directory and press Next
    10. Select "Import existing Eclipse project" (should be default choice), press Next.
    11. Press Finish and your project is imported!
    12. Right click the project in the package explorer, click Maven->Update Project... (Or press Alt+F5)
3. Do the actual lab work
    1. Read/implement the Question sections above
    2. Keep all existing and new classes in the edu.carroll.cis232 package.
    3. Do not rename any existing files.
4. Test your work.
    1. Run the application by pressing the Play button to test your program manually.
5. Submit your work
    1. Right click the project
    2. Choose Team->Commit...
    3. Enter a comment such as "My solution for the chapter 16 lab"
    4. Enter your name/email for the author/committer fields if it is not set
    5. Press "Commit and Push". (Committing saves the changes locally, Pushing saves the changes on your GitHub fork)
    6. Your work is now on your GitHub fork.  Open up the browser to your GitHub fork of the example lab.
    7. Press the green pull request button at the top to the left of the "Branch: master" dropdown.
    8. To finally submit your lab, Click the green "Create new pull request" button, enter a title and message, and press "Create pull request".
    9. Your lab is now submitted!

