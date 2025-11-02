package BaiTap_Tuan8;
public class Test 
{
    public static void main(String[] args) 
    {
        IQuanLySach quanLySach = new QuanLySachImpl();

        SachGiaoTrinh sg = new SachGiaoTrinh("GT001", "Lap Trinh Java", "Nguyen Van A",
                2022, 10, 50000, "LLap trinh", "Dai hoc");

        SachTieuThuyet st = new SachTieuThuyet("TT001", "Harry Potter", "J.K. Rowling",
                2000, 5, 80000, "Fantasy", true);

        quanLySach.themSach(sg);
        quanLySach.themSach(st);

        quanLySach.hienThiDanhSach();

        System.out.println("Tim kiem sach GT001:");
        System.out.println(quanLySach.timKiemSach("GT001"));

        System.out.println("Xoa sach TT001:");
        quanLySach.xoaSach("TT001");

        System.out.println("Danh sach sau khi xoa:");
        quanLySach.hienThiDanhSach();
    }
}
