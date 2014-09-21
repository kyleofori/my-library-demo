/**
 * Created by Erika on 9/21/14.
 */
import java.util.Scanner;

public class LibraryInterface {

    public void displayOptionScreen() {
        System.out.println("What do you want to do?");
        System.out.println("1. Add a book to the library");
        System.out.println("2. Delete a book from the library");
        System.out.println("3. Search for a book by title");
        System.out.println("4. Display all the books in the library");
        System.out.println("5. Quit");
    }

    public Book constructNewBook() {
        Scanner bookScanner = new Scanner(System.in);
        System.out.println("What is the book's title?");
        String title = (bookScanner.nextLine());
        System.out.println("Who is the book's author?");
        String author = (bookScanner.nextLine());
        System.out.println("How many pages does the book have?");
        int numberOfPages = (bookScanner.nextInt());
        Book bookToAdd = new Book(author,title,numberOfPages);
        return bookToAdd;
    }

    public String acceptBookTitleFromUser() {
        Scanner bookScanner = new Scanner(System.in);
        System.out.println("Enter the title of the book:");
        String deleteTitle = bookScanner.nextLine();

        return deleteTitle;
    }

    public void promptForNextEntry() {
        System.out.println("Please enter a number between 1-5.");
    }

    public void displayInfoForBook(Book book) {
        System.out.println(book.getTitle() + " by " +
                book.getAuthor() + ", " +
                book.getNumberOfPages() + " pages.");
    }

    public void displayItemNotFound() {
        System.out.println("Book not found!");
    }

    public void displayItemFound() {
        System.out.println("Book found!");
    }
}
