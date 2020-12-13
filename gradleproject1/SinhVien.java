/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class SinhVien{

    private int maSV;
    private String hoTen;
    private String diaChi;
    private long soDT;
    private MonHoc mh = new MonHoc();
    ArrayList<MonHoc> monhoc=new ArrayList<>();
    
    public SinhVien() {
    }

    public SinhVien(int maSV, String hoTen, String diaChi, long soDT) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDT = soDT;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public long getSoDT() {
        return soDT;
    }

    public void setSoDT(long soDT) {
        this.soDT = soDT;
    }

    public MonHoc getMh() {
        return mh;
    }

    public void setMh(MonHoc mh) {
        this.mh = mh;
    }

    Scanner sc = new Scanner(System.in);

    public void NhapSInhVien() {
        System.out.println("Ma Sinh Vien: ");
        maSV = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho ten SV: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap dia chi Sinh Vien: ");
        diaChi = sc.nextLine();
        System.out.println("Nhap SDT SInh Vien: ");
        soDT = sc.nextInt();

    }
    
    
    @Override
    public String toString() {
        return "MSV: " + String.format("%05d", maSV) + " Sinh vien: " + hoTen + " Dia chi: " + diaChi + " SDT: " +  soDT + " Thong tin mon hoc: " + monhoc;

    }

//    @Override
//    public String toString() {
//        return "SinhVien{" + "maSV=" + maSV + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", soDT=" + soDT + ", mh=" + mh + ", monhoc=" + monhoc + '}';
//    }

    

   
}
