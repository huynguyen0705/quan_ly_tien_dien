import java.util.ArrayList;

public class QuanLy {
    ArrayList<KhachVN> dsKhachVN;
    ArrayList<KhachQT> dsKhachQT;

    public void QuanLy(){

    }
    public QuanLy(){
        dsKhachVN = new ArrayList<>();
        dsKhachQT = new ArrayList<>();
    }
    public void ThemHoaDonKhachVN(String maKH, String hoTen, String ngayRaHoaDon, int soLuong, double donGia, String doiTuong, int dinhMuc){
        KhachVN khachVN = new KhachVN(maKH, hoTen, ngayRaHoaDon, soLuong, donGia, doiTuong, dinhMuc);
        dsKhachVN.add(khachVN);

    }
    public void ThemHoaDonKhachQT(String maKH, String hoTen, String ngayRaHoaDon, int soLuong, double donGia, String quocTich){
        KhachQT khachQT = new KhachQT(maKH, hoTen, ngayRaHoaDon, soLuong, donGia, quocTich);
        for (int i = 0; i < dsKhachQT.size(); i++){
            dsKhachQT.set(i, khachQT);
            break;
        }
    }
    public void XuatKhachVN(){
        for (int i = 0; i < dsKhachVN.size(); i++){
            System.out.println(dsKhachVN.get(i).HienThiKhachVN());
        }
    }

    public void XuatKhachQT(){
        for (int i = 0; i < dsKhachQT.size(); i++){
            System.out.println(dsKhachQT.get(i).HienThiKhachQT());
        }
    }

    public int TongSoLuongKhachVN(){
        int tongkhachvn = 0;
        for (int i = 0; i < dsKhachVN.size(); i++){
            tongkhachvn = tongkhachvn + dsKhachVN.get(i).getSoLuong();
        }
        return tongkhachvn;
    }

    public int TongSoLuongKhachQT(){
        int tongkhachqt = 0;
        for (int i = 0; i < dsKhachQT.size(); i++){
            tongkhachqt = tongkhachqt + dsKhachQT.get(i).getSoLuong();
        }
        return tongkhachqt;
    }

    public double TrungBinhThanhTienKhachQT(){
        double tongtien = 0;
        int count = 0;
        for (int i = 0; i < dsKhachQT.size(); i++){
            tongtien = tongtien + dsKhachQT.get(i).ThanhTienKhachQT();
            count++;
        }
        return tongtien/count;
    }

    public void XuatHoaDonThang9Nam2013(){
        System.out.println("Hoa don khach hang thang 9 nam 2013:");
        for (int i = 0; i < dsKhachVN.size(); i++){
            String hoadonT9nam2013 = dsKhachVN.get(i).getNgayRaHoaDon();
            String[] path = hoadonT9nam2013.split("/");
            if (path[1].equals("09") && path[2].equals("2013")){
                System.out.println(hoadonT9nam2013);
            }
        }

        for (int i = 0; i < dsKhachQT.size(); i++){
            String hoadonT9nam2013 = dsKhachQT.get(i).getNgayRaHoaDon();
            String[] path = hoadonT9nam2013.split("/");
            if (path[1].equals("09") && path[2].equals("2013")){
                System.out.println(hoadonT9nam2013);
            }
        }
    }
}
