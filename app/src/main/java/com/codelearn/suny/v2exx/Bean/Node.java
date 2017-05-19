package com.codelearn.suny.v2exx.Bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by suny on 2017/5/19.
 */

public class Node {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("title_alternative")
    @Expose
    private String titleAlternative;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("topics")
    @Expose
    private Integer topics;
    @SerializedName("avatar_mini")
    @Expose
    private String avatarMini;
    @SerializedName("avatar_normal")
    @Expose
    private String avatarNormal;
    @SerializedName("avatar_large")
    @Expose
    private String avatarLarge;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleAlternative() {
        return titleAlternative;
    }

    public void setTitleAlternative(String titleAlternative) {
        this.titleAlternative = titleAlternative;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getTopics() {
        return topics;
    }

    public void setTopics(Integer topics) {
        this.topics = topics;
    }

    public String getAvatarMini() {
        return avatarMini;
    }

    public void setAvatarMini(String avatarMini) {
        this.avatarMini = avatarMini;
    }

    public String getAvatarNormal() {
        return avatarNormal;
    }

    public void setAvatarNormal(String avatarNormal) {
        this.avatarNormal = avatarNormal;
    }

    public String getAvatarLarge() {
        return avatarLarge;
    }

    public void setAvatarLarge(String avatarLarge) {
        this.avatarLarge = avatarLarge;
    }

}




