# Word-Composition-Problem
This Java program, # Word-composition-problem is designed to find the longest and second longest compounded words in a list of words from an input file. Below is a brief overview of the program and instructions on how to execute it.

# Overview
The program follows a straightforward approach to accomplish its task:

It reads a list of words from an input file specified by the inputFileName variable.

The program sorts the words based on their length in ascending order, which helps optimize the search for compounded words.

A set called compoundWords is used to keep track of words that can be compounded.

It iterates through the sorted list of words and checks if each word can be compounded using the isCompoundWord method.

The isCompoundWord method recursively checks if a word can be constructed by combining shorter words found in the compoundWords set. It does this by splitting the word into a prefix and a suffix and checking if both are present in the set. If so, the word is considered a compound word.

If a word is identified as a compound word, it is added to the compoundWords set. The program keeps track of the longest and second longest compound words.

After processing all the words, the program calculates the total time taken for execution and prints the results to the console.

# Steps to Execute
Ensure you have Java installed on your system.

Create input text files named Input_01.txt and Input_02.txt. You can change the inputFileName variable in the code to choose the input file.

Compile and run the program.

The program will process the input file and display the results in the console, including the longest and second longest compound words and the time taken for processing in milliseconds.

That's it! This program is a simple yet effective way to find the longest and second longest compounded words in a list of words from an input file.