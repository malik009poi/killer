public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991", 3);
        Book book2 = new Book("Clean Code", "Robert C. Martin", "978-0132350884", 2);
        library.addBook(book1);
        library.addBook(book2);
        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");
        library.registerMember(member1);
        library.registerMember(member2);
        library.lendBook("978-0134685991", "M001");
        library.lendBook("978-0132350884", "M002");
        System.out.println(member1.name + " borrowed books: " + member1.getBorrowedBooks().size());
        System.out.println(member2.name + " borrowed books: " + member2.getBorrowedBooks().size());
    }
}
