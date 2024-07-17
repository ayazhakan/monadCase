package com.monad._case.views.personel;

public class Personel {
    private String TC;
    private String ad;
    private String soyad;

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
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

    public Personel(String TC, String ad, String soyad) {
        this.TC = TC;
        this.ad = ad;
        this.soyad = soyad;
    }
}