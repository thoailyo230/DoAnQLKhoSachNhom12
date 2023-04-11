public class SachThamKhao extends Sach {
    private int lop;
    private double thue;
    public SachThamKhao(){

    }
    public SachThamKhao(String maSach,String nhaxuatban, double donGia, int soLuong,int lop, double thue) {
        super(maSach,nhaxuatban,donGia,soLuong);
        this.lop=lop;
        this.thue=thue;

    }
    public int getLop() {
        return lop;
    }
    public void setLop(int lop){
        this.lop=lop;
    }
    public double getThue() {
        return thue;
    }
    public void setThue(double thue){
        this.thue=thue;
    }

    @Override
    public void inThongTin(){
        super.inThongTin();
        System.out.print(", Lop: " + lop + ", Thue: " + thue +  "\n" );

    }
    public void nhapSachThamKhao(){
        super.nhapSach();
        System.out.println("Nhap Lop: ");
        lop = Integer.parseInt(myScanner.nextLine());
        System.out.println(" Nhap Thue: ");
        thue = Integer.parseInt(myScanner.nextLine());

    }
    public boolean suaThongTin(String loaiThongTinCanSua, String noiDungCanSua) {
        switch (loaiThongTinCanSua) {
            case "Lop": {
            lop=Integer.parseInt(myScanner.nextLine());
                return true;
            }
            case "Thue": {
                thue=Integer.parseInt(myScanner.nextLine());
                return true;
            }


            default:return false;
        }
    }


    }

