# Simple Library System

## Overview
The Simple Library System is a console-based application that allows users to manage a collection of books. Users can add new books, remove existing ones, and search for books by various attributes such as title, author, or publication year. The system utilizes an ArrayList to store book information and basic Stream operations for data processing.

## Features
- Add new books to the library
- Remove books by ISBN
- Search for books by title, author, or publication year
- Display all books in the library

## Setup Instructions
1. Ensure you have Java Development Kit (JDK) installed on your machine.
2. Clone the repository or download the source code.
3. Navigate to the project directory.
4. Compile the Java files using the command:
   ```
   javac src/*.java
   ```
5. Run the application using the command:
   ```
   java src/Main
   ```

## Usage Examples
- To add a book, follow the prompts to enter the title, author, publication year, and ISBN.
- To remove a book, enter the ISBN of the book you wish to remove.
- To search for books, you can enter a title, author, or publication year, and the system will display matching results.
- To view all books in the library, select the option to display all books.

## Documentation
For detailed design and implementation information, please refer to the documentation located in the `documentation` folder, specifically the `design-and-implementation.md` file.