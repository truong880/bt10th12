import java.util.ArrayList;
import java.util.List;

public class ThuVien implements QuanLyThuVien {
    private String maThuVien;
    private String tenThuVien;
    private List<Sach> danhSachSach;

    public ThuVien(String maThuVien, String tenThuVien) {
        this.maThuVien = maThuVien;
        this.tenThuVien = tenThuVien;
        this.danhSachSach = new ArrayList<>();
    }

    @Override
    public void addBook(Sach book) {

        boolean exists = false;
        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).getMaSach().equals(book.getMaSach())) {
                exists = true;
                break;
            }
        }

        if (exists) {
            System.out.println("Sách đã tồn tại trong thư viện: " + book.getTenSach());
        } else {
            danhSachSach.add(book);
            System.out.println("Thêm thành công sách: " + book.getTenSach() + " (Mã: " + book.getMaSach() + ")");
        }
    }


    @Override
    public void removeBook(String bookId) {
        // Sử dụng vòng lặp for thông thường để tìm sách
        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).getMaSach().equals(bookId)) {
                System.out.println("Đã xóa sách: " + danhSachSach.get(i).getTenSach() + " (Mã: " + bookId + ")");
                danhSachSach.remove(i); // Xóa sách
                return;
            }
        }
        System.out.println("Không tìm thấy sách với mã: " + bookId);
    }

    @Override
    public Sach searchByTitle(String title) {
        // Sử dụng vòng lặp for để tìm kiếm
        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).getTenSach().equalsIgnoreCase(title)) {
                return danhSachSach.get(i);
            }
        }
        System.out.println("Không tìm thấy sách với tiêu đề: " + title);
        return null;
    }
    @Override
    public Sach searchByAuthor(String author) {
        // Sử dụng vòng lặp for để tìm kiếm
        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).getTacGia().equalsIgnoreCase(author)) {
                return danhSachSach.get(i);
            }
        }
        System.out.println("Không tìm thấy sách với tác giả: " + author);
        return null;
    }
    @Override
    public void displayAllBooks() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Thư viện không có sách nào.");
        } else {
            System.out.println("Danh sách sách trong thư viện:");
            for (int i = 0; i < danhSachSach.size(); i++) {
                System.out.println(danhSachSach.get(i));
            }
        }
    }
}
