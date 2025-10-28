package BaiTap_Tuan8;

public abstract class Sach implements IGiaBan, IKiemKe {
    private String tieuDe;
    private String tacGia;
    private double giaCoBan;
    private int soLuong;
    private String viTri;

    public Sach(String tieuDe, String tacGia, double giaCoBan, int soLuong, String viTri) {
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.giaCoBan = giaCoBan;
        this.soLuong = soLuong;
        this.viTri = viTri;
    }

    // Getters & Setters
    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public double getGiaCoBan() { return giaCoBan; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    public String getViTri() { return viTri; }
    public void setViTri(String viTri) { this.viTri = viTri; }

    // Hai phương thức abstract cần lớp con triển khai
    public abstract double tinhGiaBan();
    public abstract boolean kiemTraTonKho(int soLuongToiThieu);
    public abstract void capNhatViTri(String viTriMoi);

    @Override
    public String toString() {
        return "Tieu de: " + tieuDe +
               ", Tac gia: " + tacGia +
               ", Gia co ban: " + giaCoBan +
               ", So luong: " + soLuong +
               ", Vi tri: " + viTri;
    }
}
