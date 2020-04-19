package com.dong.zhi.builder;

/**
 * @author ：dongzhi
 * @date ：Created in 2020/4/19 8:16
 * @description：课程类
 * @modified By：
 * @version: 1.0$
 */
public class Course {

    public String getPpt() {
        return ppt;
    }

    public void setPpt(String ppt) {
        this.ppt = ppt;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getKejian() {
        return kejian;
    }

    public void setKejian(String kejian) {
        this.kejian = kejian;
    }

    private String ppt;

    private String video;

    private String kejian;


}
