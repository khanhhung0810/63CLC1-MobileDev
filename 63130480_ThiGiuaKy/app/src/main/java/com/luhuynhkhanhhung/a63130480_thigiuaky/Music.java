package com.luhuynhkhanhhung.a63130480_thigiuaky;

public class Music {
    private String tenBaiHat;
    private String tenCaSi;
    private String hinhCaSi;
    private int soLuotNghe;

    public Music(String tenBaiHat, String tenCaSi, String hinhCaSi, int soLuotNghe) {
        this.tenBaiHat = tenBaiHat;
        this.tenCaSi = tenCaSi;
        this.hinhCaSi = hinhCaSi;
        this.soLuotNghe = soLuotNghe;
    }

    public Music() {
    }

    public String getTenBaiHat() {
        return tenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        this.tenBaiHat = tenBaiHat;
    }

    public String getTenCaSi() {
        return tenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    public String getHinhCaSi() {
        return hinhCaSi;
    }

    public void setHinhCaSi(String hinhCaSi) {
        this.hinhCaSi = hinhCaSi;
    }

    public int getSoLuotNghe() {
        return soLuotNghe;
    }

    public void setSoLuotNghe(int soLuotNghe) {
        this.soLuotNghe = soLuotNghe;
    }
}
