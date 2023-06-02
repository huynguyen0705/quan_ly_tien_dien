public class KhachVN extends KhachHang{
    private String DoiTuong;
    private int DinhMuc;

    public int getDinhMuc() {
        return DinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        DinhMuc = dinhMuc;
    }

    public String getDoiTuong() {
        return DoiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        DoiTuong = doiTuong;
    }
    public KhachVN(String maKH, String hoTen, String ngayRaHoaDon, int soLuong, double donGia, String doiTuong, int dinhMuc){
        setMaKH(maKH);
        setHoTen(hoTen);
        setNgayRaHoaDon(ngayRaHoaDon);
        setSoLuong(soLuong);
        setDonGia(donGia);
        setDoiTuong(doiTuong);
        setDinhMuc(dinhMuc);
    }

    public double ThanhTienKhachVN(){
        double thanhtien = 0;
        int getSoLuong = getSoLuong();
        int getDinhMuc = getDinhMuc();
        if (getSoLuong <= getDinhMuc){
            thanhtien = getSoLuong() * getDonGia();
        } else if (getSoLuong > getDinhMuc) {
            int vuotDinhMuc = getSoLuong - getDinhMuc;
            thanhtien = getSoLuong() * getDonGia() * getDinhMuc() + vuotDinhMuc * getDonGia() * 2.5;
        }
        return thanhtien;
    }

    public String HienThiKhachVN(){
        System.out.println("Ma KH: " + getMaKH());
        System.out.println("Ho Ten: " + getHoTen());
        System.out.println("Ngay ra hoa don: " + getNgayRaHoaDon());
        System.out.println("So luong: " + getSoLuong());
        System.out.println("Don gia: " + getDonGia());
        System.out.println("Doi tuong: " + getDoiTuong());
        System.out.println("Dinh muc: "+ getDinhMuc());
        return "-----------";
    }
}
