package nameclass;

public class staff {
    String ma,ten,gioitinh,diachi,email,sodienthoai;
    public staff(){
       
    }
    public staff(String ma,String ten,String gioitinh,String diachi,String email,String sodienthoai){
        this.ma=ma;
        this.ten=ten;
        this.gioitinh=gioitinh;
        this.diachi=diachi;
        this.email=email;
        this.sodienthoai=sodienthoai;

    }
    public String getDiachi() {
        return diachi;
    }

    public String getMa() {
        return ma;
    }
    public String getEmail() {
        return email;
    }
    public String getGioitinh() {
        return gioitinh;
    }
    public String getSodienthoai() {
        return sodienthoai;
    }
    public String getTen() {
        return ten;
    }
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    public void setMa(String ma) {
        this.ma = ma;
    }
    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
   
    @Override
    public String toString() {
        return super.toString();
    }
}
