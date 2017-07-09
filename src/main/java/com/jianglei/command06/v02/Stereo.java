package com.jianglei.command06.v02;

/**
 * Created by jianglei on 2017/7/9.
 */
public class Stereo {
    private String cd;
    private String dvd;
    private String volumn;

    public void on() {
        System.out.println("stereo on");
    }

    public void off() {
        System.out.println("stereo off");
    }

    public void setCd(String cd) {
        this.cd  = cd;

    }

    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

    public void setVolume(String volume) {
        this.volumn = volume;
    }

    public void sing() {
        System.out.println("sing a song");
    }


}
