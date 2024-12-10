public class Main {
    public static void main(String[] args) {
        ThuVien thuVien = new ThuVien("TV001", "Thư viện Khoa Học");
        thuVien.addBook(new Sach("B001", "Lập Trình Java", "Nguyen Van A", "Lập trình", 2018, true));
        thuVien.addBook(new Sach("B002", "Hướng Dẫn Python", "Tran Thi B", "Lập trình", 2019, true));
        thuVien.addBook(new Sach("B003", "Học SQL Nâng Cao", "Le Van C", "Cơ sở dữ liệu", 2020, false));
        System.out.println("\n--- Hiển thị sách ---");
        thuVien.displayAllBooks();

        System.out.println("\n--- Tìm sách theo tiêu đề 'Lập Trình Java' ---");
        Sach timTheoTieuDe = thuVien.searchByTitle("Lập Trình Java");
        System.out.println(timTheoTieuDe != null ? timTheoTieuDe : "Không tìm thấy.");

        System.out.println("\n--- Xóa sách có mã 'B002' ---");
        thuVien.removeBook("B002");
        thuVien.displayAllBooks();
    }
}
