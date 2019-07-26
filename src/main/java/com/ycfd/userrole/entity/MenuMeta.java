package com.ycfd.userrole.entity;

/**
 * Created by nxycdl on 2019/7/25 10:17.
 *
 * @author dl
 */
public class MenuMeta {
    private String title;
    private String icon;
    private String requireauth;
    private String keepalive;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getRequireauth() {
        return requireauth;
    }

    public void setRequireauth(String requireauth) {
        this.requireauth = requireauth;
    }

    public String getKeepalive() {
        return keepalive;
    }

    public void setKeepalive(String keepalive) {
        this.keepalive = keepalive;
    }
}
