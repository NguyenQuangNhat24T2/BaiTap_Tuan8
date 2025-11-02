package BaiTap_Tuan8;
public class SachGiaoTrinh extends Sach 
{
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh() {}

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capDo) 
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() 
    {
        int soNam = 2025 - getNamXuatBan();
        return getGiaCoBan() + soNam * 5000;
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) 
    {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) 
    {
        System.out.println("Đã chuyển sách giáo trình \"" + getTieuDe() + "\" đến vị trí: " + viTriMoi);
    }

    @Override
    public String toString() 
    {
        return super.toString() +
               "\nMon hoc: " + monHoc +
               "\nCap do: " + capDo +
               "\nGia ban: " + tinhGiaBan() + " VND";
    }
}
