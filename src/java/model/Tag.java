package model;

import java.io.Serializable;
import java.util.Set;

public class Tag implements Serializable{
    private Integer id;
    private String code;
    private String name;
    private Category category;
    private Set<Post> posts;

    public Tag() {
    }

    public Tag(Integer id, String code, String name, Category category, Set<Post> posts) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.category = category;
        this.posts = posts;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }
    
    
}
