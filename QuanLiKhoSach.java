import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuanLiKhoSach {
    private static List<Sach> khoSach = new ArrayList<>();

    private static void khoiTaoKhoSach()
    {

        SachTruyenNgan sachtruyenngan1 = new SachTruyenNgan("XN1","Nguyen Van A",20000,20,"Bia Cung","24x12");
        SachTruyenNgan sachtruyenngan2 = new SachTruyenNgan("XN2","Nguyen Van B",25000,30,"Bia Mem","24x14");
        SachTruyenNgan sachtruyenngan3 = new SachTruyenNgan("XN3","Nguyen Van C",30000,40,"Bia Cung","28x12");
        SachGiaoKhoa sachgiaokhoa1 = new SachGiaoKhoa("XN4","Nguyen Van D",20000,50,"cu","Toan");
        SachThamKhao sachthamkhao1 = new SachThamKhao("XN5","Nguyen Van E",28000,60,12,5);

//        sachcuatoi.inThongTinSach();
        khoSach.add(sachtruyenngan1);
        khoSach.add(sachtruyenngan2);
        khoSach.add(sachtruyenngan1);
        khoSach.add(sachgiaokhoa1);
        khoSach.add(sachthamkhao1);
    }
    public static void main(String[] args) {
       QuanLiKhoSach.khoiTaoKhoSach();
        int soChon;
        boolean thoat=false;
        // System.in - INPUT
        // System.out - OUTPUT
        Scanner myScanner = new Scanner(System.in);
        while (!thoat) {
            System.out.println("Xin chao den voi kho tai lieu. Vui long chon thao tac: ");
            System.out.println("1. Them Sach");
            System.out.println("2. In thong tin  ");
            System.out.println("3. Xoa Sach ");
            System.out.println("4. Cap Nhat Sach");
            System.out.println("5. Sap Xep Sach");
            System.out.println("6. Thoat");
            soChon = Integer.parseInt(myScanner.nextLine());
            if (soChon==5){
                System.out.println("Nhap tieu chi can sap xep:");
                System.out.println("Nha Xuat Ban");
                System.out.println("So Ban Phat Hanh");
                System.out.println("Ma Tai Lieu");
                String tieuChiSapXep = myScanner.nextLine();
                for(Sach taiLieu: khoSach) {
                    taiLieu.sapXepTheoTieuChi(tieuChiSapXep);
                }
                Collections.sort(khoSach);

            }
            if (soChon==4){
                System.out.println("Nhap ma sach can sua:");
                String maSachCapNhat = myScanner.nextLine();
                for(Sach taiLieu: khoSach){
                if (maSachCapNhat.equalsIgnoreCase(taiLieu.getMaSach())){
                    taiLieu.inThongTin();
                    System.out.println("Moi nhap loai thong tin can sua:");
                    String loaiThongTinCanSua = myScanner.nextLine();
                    System.out.println("Nhap noi dung can sua:");
                    String noiDungCanSua = myScanner.nextLine();
                    // goi methods - se tra ve loai thong tin tu methods
                    boolean suaThanhCong = taiLieu.suaThongTin(loaiThongTinCanSua,noiDungCanSua);
                    if (suaThanhCong){
                        System.out.println("Da cap nhat thanh cong");
                    }
                    else{
                        System.out.println("Cap nhat khong thanh cong");
                    }

                }
                }

            }

            if ( soChon==6) {
                return;

            }
            else if (soChon ==3){

                System.out.println("Nhap ten Sach can xoa ");
                String tenSachCanXoa = myScanner.nextLine();
                int index = 0;
                for(Sach sach: khoSach){
                    if (tenSachCanXoa.equals(sach.getMaSach())){

                    break;
                    }
                    index++;
                }
                khoSach.remove(index);
            }
            else if (soChon ==2) {
                for(Sach taiLieu: khoSach) {
                    taiLieu.inThongTin();
                }

            } else if ( soChon==1) {
                System.out.println("Nhap Loai Sach: ");
                System.out.println("1.1 Sach Tham Khao");
                System.out.println("1.2 Sach Giao Khoa");
                System.out.println("1.3 Sach Truyen Ngan");
                // 1.2
                // Scanner de lay thong tin user nhap
                // Scanner.nextLine tra ve String

                String loaiUserNhap = myScanner.nextLine();
                switch (loaiUserNhap) {
                    case "1.1" : {
                        SachTruyenNgan sachTruyenNganCanNhap = new SachTruyenNgan();
                        sachTruyenNganCanNhap.nhapSach();
                        // de add Sach lam nhu sau
                        khoSach.add(sachTruyenNganCanNhap);
                        break;

                    }
                    case "1.2" : {
                        SachGiaoKhoa sachGiaoKhoaCanNhap = new SachGiaoKhoa();
                        sachGiaoKhoaCanNhap.nhapSachGiaoKhoa();
                        khoSach.add(sachGiaoKhoaCanNhap);
                        break;
                    }
                    case "1.3" : {
                        SachThamKhao sachThamKhaoCanNhap = new SachThamKhao();
                        sachThamKhaoCanNhap.nhapSachThamKhao();
                        khoSach.add(sachThamKhaoCanNhap);
                    break;
                    }
                }
            }


        }
    }
}
