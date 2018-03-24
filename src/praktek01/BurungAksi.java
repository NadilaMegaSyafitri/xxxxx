/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author mega
 */
public class BurungAksi {
    public static void main(String[] args) {
      Burung Merpati =  new Burung ();
      Burung Merak =  new Burung ();
      Burung Cendrawasih =  new Burung ();
                
        Merpati.paruh="Kecil Lancip";
        Merpati.warna_bulu="Putih";
        Merpati.habitat_asal="eropa atau afrika";
        Merpati.warna_mata="coklat";
        Merpati.panjang_cakar=1;
         
        Merak.paruh="runcing Lancip";
        Merak.warna_bulu="biru campur hijau";
        Merak.habitat_asal="India";
        Merak.warna_mata="Hitam kecoklatan";
        Merak.panjang_cakar=2;
        
        Cendrawasih.paruh="sedang Lancip";
        Cendrawasih.warna_bulu="kuning campur coklat";
        Cendrawasih.habitat_asal="Indonesia";
        Cendrawasih.warna_mata="coklat";
        Cendrawasih.panjang_cakar=2;
          
        Merpati.caramakan();
        Merak.caramakan();
        Cendrawasih.caramakan();
    }
}
