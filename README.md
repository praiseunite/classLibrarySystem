# Simple Library System

## Overview
The **Simple Library System** is a Java console-based application that allows users to manage a collection of books. It provides functionalities to add, remove, search, and display books using an `ArrayList`. The system uses Java Streams for efficient searching and filtering of books based on title, author, or publication year.

## Features
1. **Add Book** - Users can add new books to the library by providing a title, author, publication year, and ISBN.
2. **Remove Book** - Users can remove books from the library using the ISBN.
3. **Search Books** - Users can search for books by title, author, or publication year.
4. **Display Books** - The system displays all available books in the library.
5. **Console-Based Interaction** - A simple menu-driven interface allows users to interact with the system.

## Design & Implementation
The system consists of three main classes:

### 1. **Book Class**
The `Book` class represents a book with the following attributes:
- `title`: The title of the book.
- `author`: The author's name.
- `year`: The year the book was published.
- `ISBN`: The unique identifier for the book.

### 2. **Library Class**
The `Library` class manages the collection of books using an `ArrayList<Book>`. It provides methods to:
- Add books (`addBook(Book book)`).
- Remove books by ISBN (`removeBook(String isbn)`).
- Search for books using Java Streams (`searchBooks(String keyword)`).
- Display all books (`displayBooks()`).

### 3. **Main Class**
This class contains the `main` method and provides an interactive console menu for users to:
- Enter book details.
- Choose options to add, remove, search, or display books.
- Exit the system when needed.

## Usage
### Running the Program
1. **Compile the Java files**:
   ```sh
   javac LibrarySystem.java
   ```
2. **Run the program**:
   ```sh
   java LibrarySystem
   ```
3. **Follow the interactive menu** to add, remove, search, or display books.

### Example Usage
```
Library System Menu:
1. Add Book
2. Remove Book
3. Search Books
4. Display Books
5. Exit
Choose an option: 1
Enter title: Java Programming
Enter author: John Doe
Enter publication year: 2022
Enter ISBN: 1234567890
Book added successfully!
```

## Technologies Used
- **Java 8+**
- **ArrayList for storage**
- **Java Streams for filtering**
- **Console-based user input handling**

## Future Improvements
- Implement file-based storage to persist book data.
- Enhance the search functionality with advanced filtering options.
- Introduce a graphical user interface (GUI).

## Author
**Maduka Johnpeter**

---
This documentation serves as a guide to understanding the structure and usage of the Simple Library System. 🚀
