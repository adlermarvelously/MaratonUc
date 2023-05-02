
package com.mervenuradler.repository.entity;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="YarismaKatilim")
public class YarismaKatilim {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private Date tarih;
    @ManyToOne
    @JoinColumn(name="yarisma_id")
    private Yarisma yarisma;
    @ManyToOne
    @JoinColumn(name="kullanici_id")
    private Kullanici kullanici;

    public YarismaKatilim() {
    }

    public YarismaKatilim(long id, Date ktarih, Yarisma yarisma, Kullanici kullanici) {
        this.id = id;
        this.tarih = tarih;
        this.yarisma = yarisma;
        this.kullanici = kullanici;
    }

    public YarismaKatilim(Date tarih, Yarisma yarisma, Kullanici kullanici) {
        this.tarih = tarih;
        this.yarisma = yarisma;
        this.kullanici = kullanici;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setKtarih(Date tarih) {
        this.tarih = tarih;
    }

    public Yarisma getYarisma() {
        return yarisma;
    }

    public void setYarisma(Yarisma yarisma) {
        this.yarisma = yarisma;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    @Override
    public String toString() {
        return "YarismaKatilim{" + "id=" + id + ", katilimtarih=" + tarih + ", yarisma=" + yarisma + ", kullanici=" + kullanici + '}';
    }
    
    
}