/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1;

/**
 *
 * @author ADMIN
 */
public class CauThu {

    public int soao;
    public String hoten;
    public int namsinh;
    public double luongcung;
    public double tienthuong;
    public double tienphat;

    public CauThu(int soao, String hoten, int namsinh, double luongcung, double tienthuong, double tienphat) {
        this.soao = soao;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.luongcung = luongcung;
        this.tienthuong = tienthuong;
        this.tienphat = tienphat;
    }

    public CauThu(int soao) {
        this.soao = soao;
    }

    public CauThu(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public double getLuongcung() {
        return luongcung;
    }

    public void setTienphat(double tienphat) {
        this.tienphat = tienphat;
    }

    public void setTienthuong(double tienthuong) {
        this.tienthuong = tienthuong;
    }

    public double setTienphat() {
        return (luongcung + tienthuong - tienphat);
    }
    public void xuat(){
        System.out.println("");
    }

}
