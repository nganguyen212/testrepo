/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TestBangDangKy {
    
   
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> listSV = new ArrayList();
        ArrayList<MonHoc> listMH = new ArrayList();
        
        ListSV ls = new ListSV();
        
        SinhVien sv1 = new SinhVien(11896, "Nga Nguyen", "Binh DInh", 9174);
        SinhVien sv2 = new SinhVien(11893, "Ngan Nguyen 2", "Binh DInh", 91745);
        SinhVien sv3 = new SinhVien(11891, "DNga Nguyen 3", "Binh DInh", 91746);
        SinhVien sv4 = new SinhVien(11899, "ANga Nguyen 4", "Binh DInh", 91747);
        
     
        
        MonHoc mh1=new MonHoc(123, "Java", 60, "Chuyen nganh bat buoc");
        MonHoc mh2=new MonHoc(124, "Javax", 60, "Chuyen nganh tu chon");
        MonHoc mh3=new MonHoc(125, "Javas", 60, "Co so nganh");
        MonHoc mh4=new MonHoc(126, "Javafs", 60, "dai cuong");
        MonHoc mh5=new MonHoc(12, "Javapt", 60, "Chuyen nganh bat buoc");
        listMH.add(mh1);
        listMH.add(mh2);
        listMH.add(mh3);
        listMH.add(mh4);
        listMH.add(mh5);
        
        boolean flag = true;
        while (flag) {
            System.out.println("Ban muon: \n"
                    + "1. Nhap Sinh Vien.\n"
                    + "2. Nhap them mon hoc.\n"
                    + "3. Xuat sinh vien. \n"
                    + "4. Xuat mon hoc.\n"
                    + "5. Lap bang dang ki mon hoc cua Sinh Vien.\n"
                    + "6. Sap xep danh sach bang dang ky mon hoc theo ten.\n"
                    + "7. Danh sach lop hoc.\n"
                    + "8. THOAT CHUONG TRINH..... \n");
            int n;
            n = sc.nextInt();
            switch (n) {
                case 1:
                    
//                       listSV.add(sv1);
//                      listSV.add(sv2);
//                     listSV.add(sv3);
//                        listSV.add(sv4);
                    SinhVien sv = new SinhVien();
                    sv.NhapSInhVien();
                    listSV.add(sv);
                    break;
                case 2:
                    MonHoc mh = new MonHoc();
                    mh.NhapLoaiMonHoc();
                    listMH.add(mh);
                    break;
                case 3:
                    for (SinhVien sinhvien : listSV) {
                        System.out.println(sinhvien);
                    } 
                    break;
                case 4:
                    for (MonHoc monhoc : listMH) {
                        System.out.println(monhoc);
                    }
                    break;
                    
//                    for(int i=0; i < listSV.size(); i++){
//                        System.out.println(listSV.get(i));
//                    }
                case 5:
                    System.out.println("Chon SV muon dang ki: ");
                    int chon;
                    chon=sc.nextInt();
                    System.out.println("Chon MonHoc muon dang ki: ");
                    int chonmh=sc.nextInt();
                    listSV.get(chon).monhoc.add(listMH.get(chonmh));
                    break;
                case 6:
                   
                  
//                  for (SinhVien sinhvien : listSV) {
//                         ls.sapXepSV();
//                        System.out.println(sinhvien);
//                    } 
                    break;
                case 7:
                   
//                    System.out.println("aaaaaa");
//                    ls.xuatSV();
                    
                    break;
                case 8:
                   flag = false;

                    break;
                    

            }
        }
    }
}
