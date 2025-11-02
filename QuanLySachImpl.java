package BaiTap_Tuan8;
import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach 
{
    private List<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach s) 
    {
        danhSach.add(s);
    }

    @Override
    public Sach timKiemSach(String maSach) 
    {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public boolean xoaSach(String maSach) 
    {
        Sach s = timKiemSach(maSach);
        if (s != null) 
        {
            danhSach.remove(s);
            return true;
        }
        return false;
    }

    @Override
    public void hienThiDanhSach() 
    {
        if (danhSach.isEmpty())
            System.out.println("Danh sach trong.");
        else 
        {
            System.out.println("=== DANH SACH SACH ===");
            for (Sach s : danhSach) 
            {
                System.out.println(s);
                System.out.println("----------------------");
            }
        }
    }
}
