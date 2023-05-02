
package com.mervenuradler.repository.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Yarisma")
public class Yarisma {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String yAdi;
    private Date batarih;
    private Date bitarih;
    private String odul;
    private long katilimSayisi;
    @ManyToOne
    private List<YarismaKatilim> yarismaKatilim;
    @ManyToOne
    private Kullanici kullanici;

    public Yarisma() {
    }

    public Yarisma(long id, String yAdi, Date batarih, Date bitarih, String odul, long katilimSayisi, List<YarismaKatilim> yarismaKatilim, Kullanici kullanici) {
        this.id = id;
        this.yAdi = yAdi;
        this.batarih = batarih;
        this.bitarih = bitarih;
        this.odul = odul;
        this.katilimSayisi = katilimSayisi;
        this.yarismaKatilim = yarismaKatilim;
        this.kullanici = kullanici;
    }

    public Yarisma(String yAdi, Date batarih, Date bitarih, String odul, long katilimSayisi, List<YarismaKatilim> yarismaKatilim, Kullanici kullanici) {
        this.yAdi = yAdi;
        this.batarih = batarih;
        this.bitarih = bitarih;
        this.odul = odul;
        this.katilimSayisi = katilimSayisi;
        this.yarismaKatilim = yarismaKatilim;
        this.kullanici = kullanici;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getyAdi() {
        return yAdi;
    }

    public void setyAdi(String yAdi) {
        this.yAdi = yAdi;
    }

    public Date getBatarih() {
        return batarih;
    }

    public void setBatarih(Date batarih) {
        this.batarih = batarih;
    }

    public Date getBitarih() {
        return bitarih;
    }

    public void setBitarih(Date bitarih) {
        this.bitarih = bitarih;
    }

    public String getOdul() {
        return odul;
    }

    public void setOdul(String odul) {
        this.odul = odul;
    }

    public long getKatilimSayisi() {
        return katilimSayisi;
    }

    public void setKatilimSayisi(long katilimSayisi) {
        this.katilimSayisi = katilimSayisi;
    }

    public List<YarismaKatilim> getYarismaKatilim() {
        return yarismaKatilim;
    }

    public void setYarismaKatilim(List<YarismaKatilim> yarismaKatilim) {
        this.yarismaKatilim = yarismaKatilim;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    @Override
    public String toString() {
        return "Yarisma{" + "id=" + id + ", yAdi=" + yAdi + ", batarih=" + batarih + ", bitarih=" + bitarih + ", odul=" + odul + ", katilimSayisi=" + katilimSayisi + ", yarismaKatilim=" + yarismaKatilim + ", kullanici=" + kullanici + '}';
    }

    
    
}