import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLy quanLy = new QuanLy();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Chuong trinh quan ly hoa don tien dien");
            System.out.println("1. Nhap xuat danh sach cac hoa don");
            System.out.println("2. Tinh tong so luong cho tung loai");
            System.out.println("3. Tinh trung binh thanh tien cua khach QT");
            System.out.println("4. Xuat ra cac giao dich cua thang 9 nam 2013");
            System.out.println("5. Xuat hoa don");
            System.out.println("Vui long nhap lua chon: ");
            int input = scanner.nextInt();
            if (input < 1 || input > 5) {
                System.out.println("Nhap khong hop le");
            }
            switch (input) {
                case 1:
                    System.out.println("1. Nhap hoa don khach VN");
                    System.out.println("2. Nhap hoa don khach QT");
                    int input1 = scanner.nextInt();
                    if (input1 < 1 || input1 > 2) {
                        System.out.println("Chon khong hop le");
                    }
                    switch (input1) {
                        case 1:
                            System.out.println("Nhap ma khach hang: ");
                            Scanner scanner1 = new Scanner(System.in);
                            String maKH = scanner1.next();
                            System.out.println("Nhap ho ten: ");
                            Scanner scanner2 = new Scanner(System.in);
                            String hoTen = scanner2.next();
                            System.out.println("Nhap ngay ra hoa don: ");
                            Scanner scanner3 = new Scanner(System.in);
                            String ngayRaHoaDon = scanner3.next();
                            System.out.println("Nhap so luong: ");
                            Scanner scanner4 = new Scanner(System.in);
                            int soLuong = scanner4.nextInt();
                            System.out.println("Nhap don gia: ");
                            Scanner scanner5 = new Scanner(System.in);
                            double donGia = scanner5.nextDouble();
                            System.out.println("Nhap doi tuong: ");
                            Scanner scanner6 = new Scanner(System.in);
                            String doiTuong = scanner6.next();
                            System.out.println("Nhap dinh muc: ");
                            Scanner scanner7 = new Scanner(System.in);
                            int dinhMuc = scanner7.nextInt();
                            quanLy.ThemHoaDonKhachVN(maKH, hoTen, ngayRaHoaDon, soLuong, donGia, doiTuong, dinhMuc);
                            break;


                        case 2:
                            System.out.println("Nhap ma khach hang: ");
                            Scanner scanner8 = new Scanner(System.in);
                            String maKH1 = scanner8.next();
                            System.out.println("Nhap ho ten: ");
                            Scanner scanner9 = new Scanner(System.in);
                            String hoTen1 = scanner9.next();
                            System.out.println("Nhap ngay ra hoa don: ");
                            Scanner scanner10 = new Scanner(System.in);
                            String ngayRaHoaDon1 = scanner10.next();
                            System.out.println("Nhap so luong: ");
                            Scanner scanner11 = new Scanner(System.in);
                            int soLuong1 = scanner11.nextInt();
                            System.out.println("Nhap don gia: ");
                            Scanner scanner12 = new Scanner(System.in);
                            double donGia1 = scanner12.nextDouble();
                            System.out.println("Nhap quoc tich: ");
                            Scanner scanner13 = new Scanner(System.in);
                            String quocTich = scanner13.next();
                            quanLy.ThemHoaDonKhachQT(maKH1, hoTen1, ngayRaHoaDon1, soLuong1, donGia1, quocTich);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1. Tong so luong khach VN");
                    System.out.println("2. Tong so luong khach QT");
                    int input2 = scanner.nextInt();
                    if (input2 < 1 || input2 > 2) {
                        System.out.println("Chon khong hop le");
                    }
                    switch (input2){
                        case 1:
                            System.out.println("Tong so luong dien khach VN: "+quanLy.TongSoLuongKhachVN() );
                        case 2:
                            System.out.println("Tong so luong dien khach QT: "+quanLy.TongSoLuongKhachQT() );
                    }
                    break;
                case 3:
                    System.out.println("Trung binh thanh tien khach QT: " + quanLy.TrungBinhThanhTienKhachQT());
                    break;
                case 4:
                    quanLy.XuatHoaDonThang9Nam2013();
                    break;
                case 5:
                    System.out.println("Hoa don: ");
                    quanLy.XuatKhachVN();
                    break;
            }
        }
    }
}