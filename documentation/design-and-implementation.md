# Design and Implementation of Simple Library System

## Overview
The Simple Library System is a console-based application designed to manage a collection of books. It allows users to add, remove, and search for books using various attributes such as title, author, publication year, and ISBN. The system utilizes an `ArrayList` to store `Book` objects and employs basic Stream operations for data processing.

## Design Choices

### Class Structure
1. **Book Class**: 
   - Attributes: 
     - `title`: String representing the title of the book.
     - `author`: String representing the author of the book.
     - `publicationYear`: Integer representing the year the book was published.
     - `isbn`: String representing the ISBN of the book.
   - Methods: 
     - Getters and setters for each attribute to encapsulate the data.

2. **Library Class**: 
   - Manages a collection of `Book` objects stored in an `ArrayList`.
   - Methods:
     - `addBook(Book book)`: Adds a new book to the library.
     - `removeBookByISBN(String isbn)`: Removes a book from the library using its ISBN.
     - `searchBooks(String query)`: Searches for books by title, author, or publication year using Stream operations.
     - `displayBooks()`: Displays all books currently in the library.

3. **Main Class**: 
   - Contains the `main` method, which serves as the entry point for the application.
   - Handles user input and interacts with the `Library` class to perform various operations.

### Data Storage
- The application uses an `ArrayList<Book>` to store the collection of books. This allows for dynamic resizing and easy management of the book collection.

## Implementation Details

### Book Class
The `Book` class is implemented with private attributes and public getter and setter methods to ensure encapsulation. This design allows for controlled access to the book's data.

### Library Class
The `Library` class implements methods to manage the book collection. The `addBook` method appends a new book to the `ArrayList`, while the `removeBookByISBN` method searches for a book by its ISBN and removes it if found. The `searchBooks` method utilizes Java Streams to filter books based on user-defined criteria, providing a flexible search mechanism. The `displayBooks` method iterates through the `ArrayList` and prints the details of each book.

### Main Class
The `Main` class provides a user-friendly interface through the console. It prompts users for input, processes commands, and displays results. The interaction is designed to be intuitive, allowing users to easily navigate through the available functionalities.

## Usage
To run the Simple Library System:
1. Compile the Java files in the `src` directory.
2. Execute the `Main` class.
3. Follow the on-screen prompts to add, remove, search, or display books.

This design and implementation provide a robust foundation for managing a simple library system, ensuring ease of use and maintainability.