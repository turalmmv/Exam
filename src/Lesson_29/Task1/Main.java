package Lesson_29.Task1;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("978-0132350884", "Clean Code", "Robert C. Martin", 5));
        library.addBook(new Book("978-0201616224", "Design Patterns", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", 3));


//        library.printInventory();
//
//        library.getBook("978-0132350884");
//
        library.removeBook("978-0201616224");
        library.printInventory();


    }
}
