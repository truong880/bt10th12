public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private String theLoai;
    private int namXB;
    private boolean tinhTrang;

    // Constructor
    public Sach(String maSach, String tenSach, String tacGia, String theLoai, int namXB, boolean tinhTrang) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.namXB = namXB;
        this.tinhTrang = tinhTrang;
    }

    // Getter và Setter
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    // toString để hiển thị thông tin sách
    @Override
    public String toString() {
        return "Sách [" +
                "Mã='" + maSach + '\'' +
                ", Tên='" + tenSach + '\'' +
                ", Tác giả='" + tacGia + '\'' +
                ", Thể loại='" + theLoai + '\'' +
                ", Năm XB=" + namXB +
                ", Tình trạng=" + (tinhTrang ? "Sẵn sàng" : "Đang mượn") +
                ']';
    }
}