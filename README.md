Task 8

Description

Learning project in Java to explore the behavior of lambda expressions and the Streams API. The goal is to understand how these features enrich the code by providing concise, declarative, and functional-style constructs for data manipulation. They help enforce modern practices, improve readability, and reduce boilerplate compared to traditional loops.

📌 Exercise Statement

Exercise 1 — Filter with StreamsFrom a list of Strings, write a method that returns all strings containing the letter 'o'. Print the result.
Exercise 2 — Combined PredicateModify the previous method so that it returns only strings containing 'o' and with more than 5 characters. Print the result.
Exercise 3 — Lambda PrintingCreate a list with the names of the months of the year. Print all elements using a lambda expression.
Exercise 4 — Method ReferenceRepeat the previous exercise, but print the elements using a method reference (System.out::println).
Exercise 5 — Functional Interface (Supplier)Create a Functional Interface with a method getPiValue() that returns a double. From the main() method, instantiate the interface with a lambda returning 3.1415. Invoke the method and print the result.
Exercise 6 — Sorting Strings by LengthCreate a list containing both numbers and strings. Sort the strings from shortest to longest using Streams.
Exercise 7 — Reverse SortingUsing the same list, sort the strings from longest to shortest.
Exercise 8 — Functional Interface (Function)Create a Functional Interface with a method reverse() that receives and returns a String. In the main() method, inject a lambda that reverses the input string. Invoke the method with a sample string and print the result.

✨ Features

Demonstration of lambda expressions for concise behavior definition.
Use of Streams API for filtering, mapping, and sorting collections.
Application of Functional Interfaces (Predicate, Consumer, Supplier, Function) to encapsulate reusable behaviors.
Comparison between modern practices (functional programming style) and traditional imperative coding with loops.

🛠 Technologies

Java 8 or higher (Streams and Lambdas are available from Java 8 onwards).
IntelliJ IDEA or any compatible IDE.

🚀 Installation and Execution

Clone the repository.
Compile and run in IntelliJ IDEA or another IDE.
Execute the different main() methods for each exercise.
Observe how lambdas and streams simplify data manipulation compared to traditional loops.

🧩 Diagrams and justification of technical decisions

Streams pipeline: demonstrates how data flows through filter, map, and sorted.
Functional Interfaces: show how Predicate, Consumer, Supplier, and Function encapsulate behaviors.

Lambda vs Method Reference: illustrates two equivalent but stylistically different approaches.

Sorting examples: highlight how declarative code replaces manual comparator logic.
