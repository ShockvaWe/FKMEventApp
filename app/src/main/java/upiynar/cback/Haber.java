package upiynar.cback;

import android.graphics.drawable.Drawable;
import android.media.Image;

/**
 * Created by shock on 10/24/2017.
 */

public class  Haber {
    private String baslik;
    private String kisaAciklama;
    private String tarih;
    private String resimURL;
    private String uzunAciklama;


    public Haber(String baslik, String kisaAciklama, String tarih,String resimURL,String uzunAciklama){
        super();
        this.baslik = baslik;
        this.kisaAciklama = kisaAciklama;
        this.tarih = tarih;
        this.resimURL = resimURL;
        this.uzunAciklama = uzunAciklama;
    }
    public String getBaslik(){
        return baslik;
    }
    public String getKisaAciklama(){
        return kisaAciklama;
    }
    public String getTarih(){
        return tarih;
    }
    public String getResimURL() {
        return resimURL;
    }
    public String getUzunAciklama(){
        return uzunAciklama;
    }
    public void setBaslik(String baslik){
        this.baslik = baslik;
    }
    public void setKisaAciklama(String kisaAciklama){
        this.kisaAciklama = kisaAciklama;
    }
    public void setTarih(String tarih){
        this.tarih = tarih;
    }
    public void setResimURL(String resimURL) {
        this.resimURL = resimURL;
    }
    public void setUzunAciklama(String uzunAciklama){
        this.uzunAciklama = uzunAciklama;
    }

}

