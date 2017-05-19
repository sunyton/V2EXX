package com.codelearn.suny.v2exx.Bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by suny on 2017/5/19.
 */

public class TPComment {

    /**
     * id : 4339202
     * thanks : 0
     * content : 好不开心，就这么封杀了 TI6 让我们为之自豪的 5 个人，承载多少西恩人的梦想。。。
     * content_rendered : 好不开心，就这么封杀了 TI6 让我们为之自豪的 5 个人，承载多少西恩人的梦想。。。
     * created : 1495176087
     * last_modified : 1495176087
     */

    private int id;
    private int thanks;
    private String content;
    private String content_rendered;
    private int created;
    private int last_modified;
    @SerializedName("member")
    @Expose
    private Member member;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getThanks() {
        return thanks;
    }

    public void setThanks(int thanks) {
        this.thanks = thanks;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent_rendered() {
        return content_rendered;
    }

    public void setContent_rendered(String content_rendered) {
        this.content_rendered = content_rendered;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(int last_modified) {
        this.last_modified = last_modified;
    }
}
