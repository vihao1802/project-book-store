package BUS;

import java.util.ArrayList;

import DAO.quanlichitiethoadonbanhangDAO;
import DTO.chitiethoadon;

public class quanlichitiethoadonbanhang {
    private ArrayList<chitiethoadon> listcthdbh = new ArrayList<chitiethoadon>();

    public void themChiTietHoaDon(ArrayList<chitiethoadon> _listcthdbh) {
        if(!_listcthdbh.isEmpty()) {
            this.listcthdbh = _listcthdbh;
            quanlichitiethoadonbanhangDAO qlcthdbhdao = new quanlichitiethoadonbanhangDAO();
            for(chitiethoadon cthd : _listcthdbh) {
                qlcthdbhdao.themChiTietHoaDon(cthd);
            }
        }
    }
}