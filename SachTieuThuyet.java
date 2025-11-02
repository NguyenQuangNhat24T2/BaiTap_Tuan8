package BaiTap_Tuan8;
public class SachTieuThuyet extends Sach 
{
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet() {}

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) 
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() 
    {
        return getGiaCoBan() + (laSachSeries ? 15000 : 0);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) 
    {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) 
    {
        System.out.println("Da chuyen sach tieu thuyet \"" + getTieuDe() + "\" den: " + viTriMoi);
    }

    @Override
    public String toString() 
    {
        return super.toString() +
               "\nThe loai: " + theLoai +
               "\nLa sach series: " + (laSachSeries ? "Co" : "Khong") +
               "\nGia ban: " + tinhGiaBan() + " VND";
    }
}
