package com.codelearn.suny.v2exx.Bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by suny on 2017/5/19.
 */

public class LastestBean {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("content_rendered")
    @Expose
    private String contentRendered;
    @SerializedName("replies")
    @Expose
    private Integer replies;
    @SerializedName("member")
    @Expose
    private Member member;
    @SerializedName("node")
    @Expose
    private Node node;
    @SerializedName("created")
    @Expose
    private Integer created;
    @SerializedName("last_modified")
    @Expose
    private Integer lastModified;
    @SerializedName("last_touched")
    @Expose
    private Integer lastTouched;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentRendered() {
        return contentRendered;
    }

    public void setContentRendered(String contentRendered) {
        this.contentRendered = contentRendered;
    }

    public Integer getReplies() {
        return replies;
    }

    public void setReplies(Integer replies) {
        this.replies = replies;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Integer getLastModified() {
        return lastModified;
    }

    public void setLastModified(Integer lastModified) {
        this.lastModified = lastModified;
    }

    public Integer getLastTouched() {
        return lastTouched;
    }

    public void setLastTouched(Integer lastTouched) {
        this.lastTouched = lastTouched;
    }
}

