/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MonHoc {

    private int maMonHoc;
    private String tenMonHoc;
    private int tongSoTiet;
    private String[] lsloaiMonHoc = {"Dai Cuong", "Co so nganh", "Chuyen nganh bat buoc", " Chuyen nganh tu chon"};
    private String loaiMonHoc;

    public MonHoc() {
    }

    public MonHoc(int maMonHoc, String tenMonHoc, int tongSoTiet, String loaiMonHoc) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.tongSoTiet = tongSoTiet;
        this.loaiMonHoc = loaiMonHoc;
    }

    public int getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(int maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getTongSoTiet() {
        return tongSoTiet;
    }

    public void setTongSoTiet(int tongSoTiet) {
        this.tongSoTiet = tongSoTiet;
    }

    public String getLoaiMonHoc() {
        return loaiMonHoc;
    }

    public void setLoaiMonHoc(String loaiMonHoc) {
        this.loaiMonHoc = loaiMonHoc;
    }
    Scanner sc = new Scanner(System.in);

    public void NhapLoaiMonHoc() {
        System.out.println("Nhap ma Mon Hoc: ");
        maMonHoc = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten Mon Hoc: ");
        tenMonHoc = sc.nextLine();
        System.out.println("Tong so tiet: ");
        tongSoTiet = sc.nextInt();
        sc.nextLine();
        System.out.println("Loai mon hoc:\n"
                + "0: Dai Cuong \n"
                + "1: Co so nganh \n"
                + "2: Chuyen nganh bat buoc \n"
                + "3: Chuyen nganh tu chon \n");
        int cs = sc.nextInt();
        switch (cs) {
            case 0:
                loaiMonHoc = lsloaiMonHoc[0];
            case 1:
                loaiMonHoc = lsloaiMonHoc[1];
            case 2:
                loaiMonHoc = lsloaiMonHoc[2];
            case 3:
                loaiMonHoc = lsloaiMonHoc[3];

        }
    }
    
    @Override
    public String toString() {
        return "Mon Hoc: "+tenMonHoc +"Ma: "+String.format("%03d", maMonHoc)+" Tong so tiet:  "+tongSoTiet+" Loai mon hoc "+loaiMonHoc;
    }

}
