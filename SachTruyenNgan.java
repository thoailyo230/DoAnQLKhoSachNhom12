public class SachTruyenNgan extends Sach {
    private String loaiBia;
    private String kichThuoc;
    public SachTruyenNgan(){

    }
    public SachTruyenNgan(String maSach,String nhaxuatban, double donGia, int soLuong,String loaiBia,  String kichThuoc) {
        super(maSach,nhaxuatban,donGia,soLuong);
        this.loaiBia= loaiBia;
        this.kichThuoc = kichThuoc;


    }
@Override
    public void inThongTin() {
        super.inThongTin();
        System.out.print(" ,Loai Bia: "+ loaiBia +    " ,Kich Thuoc: " + kichThuoc + "\n");

    }

    public String getLoaiBia() {
        return loaiBia;
    }
    public void setLoaiBia(String loaiBia){
        this.loaiBia=loaiBia;
    }

    public String getKichThuoc(){
        return kichThuoc;
    }
    public void setKichThuoc(String kichThuoc){
        this.kichThuoc=kichThuoc;
    }



    // method name (parameter) -method signature
public void nhapSach(){
        super.nhapSach();
        System.out.println("Nhap Loai Bia: ");
    loaiBia = myScanner.nextLine();
    System.out.println(" Nhap Kich Thuoc: ");
    kichThuoc = myScanner.nextLine();


    }
    @Override
    public boolean suaThongTin(String loaiThongTinCanSua,String noiDungCanSua){
        super.suaThongTin(loaiThongTinCanSua,noiDungCanSua);
    switch (loaiThongTinCanSua){
        case "Loai Bia" :{
            setLoaiBia(noiDungCanSua);
            return true;
        }
        case "Kich Thuoc " : {
            setKichThuoc(noiDungCanSua);
            return true;
        }



        default:return false;
    }
    }

}
