package model;

import java.io.Serializable;
import java.util.Date;

public class Post implements Serializable{
    private Integer id;
    private String title;
    private String content;
    private Boolean active;
    private String createdDate;
    private String lastModifiedDate;
    private String imagePostUrl;
    private User user;
    private Category category;
    private Tag tag;

    public Post() {
    }

    public Post(Integer id, String title, String content, Boolean active, String createdDate, String lastModifiedDate, String imagePostUrl, User user, Category category, Tag tag) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.active = active;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.imagePostUrl = imagePostUrl;
        this.user = user;
        this.category = category;
        this.tag = tag;
    }

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getImagePostUrl() {
        return imagePostUrl;
    }

    public void setImagePostUrl(String imagePostUrl) {
        this.imagePostUrl = imagePostUrl;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    
    
}
