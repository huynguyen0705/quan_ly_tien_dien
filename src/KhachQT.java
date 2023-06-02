public class KhachQT extends KhachHang{
    private String QuocTich;

    public String getQuocTich() {
        return QuocTich;
    }

    public void setQuocTich(String quocTich) {
        QuocTich = quocTich;
    }
    public KhachQT(String maKH, String hoTen, String ngayRaHoaDon, int soLuong, double donGia, String quocTich){
        setMaKH(maKH);
        setHoTen(hoTen);
        setNgayRaHoaDon(ngayRaHoaDon);
        setSoLuong(soLuong);
        setDonGia(donGia);
        setQuocTich(quocTich);
    }
    public double ThanhTienKhachQT(){
        double thanhtien = 0;
        thanhtien = getSoLuong() * getDonGia();
        return thanhtien;
    }

    public String HienThiKhachQT(){
        System.out.println("Ma KH: " + getMaKH());
        System.out.println("Ho Ten: " + getHoTen());
        System.out.println("Ngay ra hoa don: " + getNgayRaHoaDon());
        System.out.println("So luong: " + getSoLuong());
        System.out.println("Don gia: " + getDonGia());
        System.out.println("Quoc tich: " + getQuocTich());
        return "-----------";
    }
}
