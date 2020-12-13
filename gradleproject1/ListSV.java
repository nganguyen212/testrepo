/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class ListSV {
    
    ArrayList<SinhVien> lssv;
    public ListSV (){
        lssv = new ArrayList<SinhVien>();
    }
    
    public boolean addSV(SinhVien s){
       
        lssv.add(s);
        return  true;
    }
    public void xuatSV(){
        
        for(SinhVien sv: lssv){
            if(sv!=null ){
                System.out.println(sv);
            }
        }
    }
    public void sapXepSV(){
    
     Collections.sort(lssv,new Comparator<SinhVien>(){
         @Override
         public int compare(SinhVien sv1, SinhVien sv2) {
             
             String x = new String(sv1.getMaSV()+"");
             String y = new String(sv2.getMaSV()+"");
 
             return x.compareTo(y);
            
         }
         
     });    
       
    }   
}
