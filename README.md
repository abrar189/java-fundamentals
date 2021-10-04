# java-fundamentals

lab 1 :
Task1 : we Write a function called pluralize that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

Task2 : Write a function called flipNHeads that accepts an integer n and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on one line for each flip. Print It took FLIPS flips to flip N heads in a row. once n heads have been in a row.

Task3 : Write a method clock that uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second.

lab2 :
Task1 :Write a method called roll that accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.

Task2 : Write a method called containsDuplicates that returns true or false depending on whether the array contains duplicate values.

Task3 :Write a method that accepts an array of integers and calculates and returns the average of all the values in the array.

Task 4: Given an array of arrays calculate the average value for each array and return the array with the lowest average.

lab3:
Task1 : by using the October Seattle weather data write a method to Iterate through all of the data to find the min and max values. Use a HashSet of type Integer to keep track of all the unique temperatures seen

Task 2 : Write a function called tally that accepts a List of Strings representing votes and returns one string to show what got the most votes.

Task 3 : Write a method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.

lab 4:
1.  building a bitmap (.bmp) transformer CLI
2.  mirror-v: flips the bitmap vertically
3. mirror-h: flips the bitmap horizontally
4. purpulaiz: purpulaiz the bitmap


lab 6:
1. Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars betweeen 0 and 5, and a price category 
2. Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.
3. Review should be about a single Restaurant. Choose an implementation for this, and implement it
4. Add an instance method addReview to your Restaurant class. This method should take in a Review instance, and associate that review with this Restaurant

lab 7:
1.  Create a Shop class; a Shop should have a name, description, and number of dollar signs.
2.  Implement a reasonable toString method for Shops. Add tests for the basics of your Shop class.
3. Ensure that your Shop class has an instance method to add a review about that shop.
4. Create a Theater class; a Theater should have a name and all of the movies currently showing there.
5. Write addMovie and removeMovie methods that allow the theater to update which movies are being shown.
6. Implement a reasonable toString method for Theaters.
7. Ensure that your Theater is just as reviewable as your Restaurant and your Shop.
8. Some reviews should now have a String movie instance variable, to hold which movie that reviewer is referencing. Make sure that someone reviewing a Restaurant or a Shop doesn’t have to include which movie they saw.
