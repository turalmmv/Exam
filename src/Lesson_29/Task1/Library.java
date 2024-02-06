package Lesson_29.Task1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Library {
    Map<String, Book> library = new LinkedHashMap<>();


    public void addBook(Book book) {
        library.put(book.getIsbn(), book);
    }


    public void removeBook(String isbn) {

        for (Map.Entry<String, Book> bookEntry : library.entrySet()) {
            if (bookEntry.getKey().equals(isbn)) {
                library.remove(bookEntry.getKey());
            }
        }

    }

    public void getBook(String isbn) {
        for (Map.Entry<String, Book> bookEntry : library.entrySet()) {
            if (bookEntry.getKey().equals(isbn)){
                System.out.println(bookEntry.getKey() + " --> " + bookEntry.getValue());
            }
        }
    }


    public void printInventory() {
        for (Map.Entry<String, Book> bookEntry : library.entrySet()) {
            System.out.println(bookEntry.getKey() + " --> " + bookEntry.getValue());
        }
    }

}
