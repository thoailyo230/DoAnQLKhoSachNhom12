public class SachGiaoKhoa extends Sach {
private String tinhTrang;
private String mon;
public SachGiaoKhoa(){

}
    public SachGiaoKhoa(String maSach,String nhaxuatban, double donGia, int soLuong,String tinhTrang,String mon) {
        super(maSach,nhaxuatban,donGia,soLuong);
    this.tinhTrang=tinhTrang;
    this.mon=mon;

    }
    public String getTinhTrang(){
        return tinhTrang;
    }
    public void setTinhTrang(String tinhTrang)
    {
        this.tinhTrang=tinhTrang;
    }
    public String getMon(){
    return mon;
    }
    public void setMon(String mon){
    this.mon=mon;
    }


    @Override
    public void inThongTin(){
        super.inThongTin();
        System.out.print(", Tinh Trang: " + tinhTrang + ", Mon: " + mon + "\n");
    }
    public void nhapSachGiaoKhoa(){
        super.nhapSach();
        System.out.println("Nhap Tinh Trang: ");
        tinhTrang = myScanner.nextLine();
        System.out.println("Nhap Mon:");
        mon= myScanner.next();

    }
    public boolean suaThongTin(String loaiThongTinCanSua, String noiDungCanSua) {
        switch (loaiThongTinCanSua) {

            case "Tinh Trang": {
                tinhTrang=myScanner.nextLine();
                return true;
            }
            case "Mon": {
                mon=myScanner.nextLine();
                return true;
            }
            default:return false;
        }
    }
}

