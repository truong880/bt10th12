public interface QuanLyThuVien {
    void addBook(Sach book);
    void removeBook(String bookId);
    Sach searchByTitle(String title);
    Sach searchByAuthor(String author);
    void displayAllBooks();
}