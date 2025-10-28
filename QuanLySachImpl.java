package BaiTap_Tuan8;

import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {
    private List<Sach> danhSachSach = new ArrayList<>();

    @Override
    public void themSach(Sach s) {
        danhSachSach.add(s);
        System.out.println(" Da them sach: " + s.getTieuDe());
    }

    @Override
    public Sach timKiemSach(String tieuDe) {
        for (Sach s : danhSachSach) {
            if (s.getTieuDe().equalsIgnoreCase(tieuDe)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public boolean xoaSach(String tieuDe) {
        Sach sach = timKiemSach(tieuDe);
        if (sach != null) {
            danhSachSach.remove(sach);
            System.out.println(" Da xoa sach: " + tieuDe);
            return true;
        }
        System.out.println(" Khong tim thay sach can xoa!");
        return false;
    }

    @Override
    public void hienThiDanhSach() {
        System.out.println(" DANH SACH SACH:");
        for (Sach s : danhSachSach) {
            System.out.println(s);
        }
    }
}

