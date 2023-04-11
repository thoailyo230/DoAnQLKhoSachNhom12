import java.util.Scanner;

// generic
public class Sach implements Comparable<Sach> {

    private String maSach;
    private String nhaxuatban;
    private double donGia;
    private int soLuong;
    private String sapXepTheoTieuChi;
    protected Scanner myScanner = new Scanner(System.in);

    public Sach() {

    }


    public Sach(String maSach,String nhaxuatban, double donGia, int soLuong) {
        this.maSach = maSach;
        this.nhaxuatban = nhaxuatban;
        this.donGia = donGia;
        this.soLuong=soLuong;
    }

    public void inThongTin() {
        System.out.print(" Ma Sach: " + maSach + " Nha Xuat Ban: " + nhaxuatban +  " Don gia: " + donGia + " So Luong" + soLuong + "\n");


    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {

        this.donGia = donGia;
    }
    public int getSoLuong(){
        return soLuong;
    }
    public void setSoLuong(int soLuong){
        this.soLuong=soLuong;
    }

    public void nhapSach() {
        System.out.println(" Nhap Ma Sach: ");
        maSach = myScanner.nextLine();
        System.out.println("Nhap Ten Nha Xuat Ban: ");
        nhaxuatban = myScanner.nextLine();
        System.out.println("Nhap Ma Don Gia: ");
        donGia = Integer.parseInt(myScanner.nextLine());
        System.out.println(" Nhap So Luong: ");
        soLuong= Integer.parseInt(myScanner.nextLine());

    }

    public boolean suaThongTin(String loaiThongTinCanSua, String noiDungCanSua) {
        switch (loaiThongTinCanSua) {
            case "Ma Sach": {
                setMaSach(noiDungCanSua);
                return true;
            }
            case "Nha Xuat Ban": {
                setNhaxuatban(noiDungCanSua);
                return true;
            }
            case "Don Gia": {
                setDonGia(Integer.parseInt(noiDungCanSua));
                return true;
            }
            case "So Luong": {
                setSoLuong(Integer.parseInt(myScanner.nextLine()));
                return true;
            }
            default:return false;
        }
    }

    public void sapXepTheoTieuChi(String tieuChiSapXep){
        this.sapXepTheoTieuChi=tieuChiSapXep;

}

    @Override
    public int compareTo(Sach o) {
        switch (sapXepTheoTieuChi){
            case "Ma Sach": {
                return this.maSach.compareTo(o.maSach);


            }
            case "Nha Xuat Ban":{
                return  this.nhaxuatban.compareTo(o.nhaxuatban);
            }
            case "Don Gia":{
                return (int) donGia-(int) o.donGia;

            }
            case "So Luong":{
                return soLuong-o.soLuong;
            }
            default:return maSach.compareTo(o.maSach);
    }

    }


}
