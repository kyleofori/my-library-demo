/**
 * Created by Erika on 9/21/14.
 */
import java.util.Scanner;

public class LibraryDemo {

    public static void main(String[] args) {

        Library myLibrary = new Library();
        LibraryInterface myInterface = new LibraryInterface();

        Scanner myScanner = new Scanner(System.in);
        String selection;

        do {
            myInterface.displayOptionScreen();

            selection = myScanner.nextLine();

            if(selection.equals("1")) {
                Book bookToAdd = myInterface.constructNewBook();
                myLibrary.addBookToLibrary(bookToAdd);
            } else if(selection.equals("2")) {
                String bookTitleToDelete = myInterface.acceptBookTitleFromUser();
                Book bookToDelete = myLibrary.searchForBookByTitle(bookTitleToDelete);
                myLibrary.deleteBookFromLibrary(bookToDelete);
            } else if(selection.equals("3")) {
                String searchTitle = myInterface.acceptBookTitleFromUser();
                myLibrary.searchForBookByTitle(searchTitle);
            } else if(selection.equals("4")) {
                myLibrary.displayAllBooks();
            } else if(selection.equals("5")) {
                break;
            } else {
                myInterface.promptForNextEntry();
            }

        } while (!selection.equals("5"));
    }
}
