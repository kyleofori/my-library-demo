/**
 * Created by Erika on 9/21/14.
 */

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> libraryBooks = new ArrayList<Book>();
    private LibraryInterface myInterface = new LibraryInterface();

    public ArrayList<Book> getLibraryBooks() {
        return libraryBooks;
    }

    public void setLibraryBooks(ArrayList<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public void addBookToLibrary(Book book) {
        libraryBooks.add(book);
    }

    public void deleteBookFromLibrary(Book book) {
        libraryBooks.remove(book);
    }

    public Book searchForBookByTitle(String title) {

        for (Book searchItem : libraryBooks) {
            if (searchItem.getTitle().equals(title)) {
                myInterface.displayItemFound();
                    return searchItem;
            }
        }

        myInterface.displayItemNotFound();
        return null;
    }

    public void displayAllBooks() {
        for (Book currentBook : libraryBooks) {
            myInterface.displayInfoForBook(currentBook);
        }
    }
}