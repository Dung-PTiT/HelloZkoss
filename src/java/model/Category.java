package model;

import java.io.Serializable;
import java.util.Set;

public class Category implements Serializable{
    private Integer id;
    private String code;
    private String name;
    private Set<Post> posts;
    private Set<Tag> tags;

    public Category() {
    }

    public Category(Integer id, String code, String name, Set<Post> posts, Set<Tag> tags) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.posts = posts;
        this.tags = tags;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }
    
}
