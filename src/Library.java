import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }
    public void removeBook(String isbn) {
        Optional<Book> bookToRemove = books.stream()
                .filter(book -> book.getIsbn().equals(isbn))
                .findFirst();
        
        if (bookToRemove.isPresent()) {
            books.remove(bookToRemove.get());
            System.out.println("Book removed: " + bookToRemove.get().getTitle());
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    public List<Book> searchBooks(String query) {
        return books.stream()
                .filter(book -> book.getTitle().contains(query) ||
                                book.getAuthor().contains(query) ||
                                String.valueOf(book.getPublicationYear()).contains(query))
                .collect(Collectors.toList());
    }

    // show all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}