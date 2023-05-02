
package com.mervenuradler.repository.entity;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Kullanici")
public class Kullanici {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String ad;
    private String soyad;
    private int yas;
    @OneToMany(mappedBy="kullanici")
    private List<YarismaKatilim> katildigiYarismalar;
    @ManyToOne
    private List<Yarisma> yarisma;
    
    
    public Kullanici() {
    }

    public Kullanici(long id, String ad, String soyad, int yas, List<YarismaKatilim> katildigiYarismalar, List<Yarisma> yarisma) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.katildigiYarismalar = katildigiYarismalar;
        this.yarisma = yarisma;
    }

    public Kullanici(String ad, String soyad, int yas, List<YarismaKatilim> katildigiYarismalar, List<Yarisma> yarisma) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.katildigiYarismalar = katildigiYarismalar;
        this.yarisma = yarisma;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public List<YarismaKatilim> getKatildigiYarismalar() {
        return katildigiYarismalar;
    }

    public void setKatildigiYarismalar(List<YarismaKatilim> katildigiYarismalar) {
        this.katildigiYarismalar = katildigiYarismalar;
    }

    public List<Yarisma> getOlusturduguYarismalar() {
        return yarisma;
    }

    public void setOlusturduguYarismalar(List<Yarisma> yarisma) {
        this.yarisma = yarisma;
    }

    @Override
    public String toString() {
        return "Kullanici{" + "id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", yas=" + yas + ", katildigiYarismalar=" + katildigiYarismalar + ", olusturduguYarismalar=" + yarisma + '}';
    }

    
}