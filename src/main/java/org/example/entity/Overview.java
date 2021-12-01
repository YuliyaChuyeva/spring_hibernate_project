package org.example.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "overviews")
public class Overview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="title")
    @Size(min=2, message = "title must be min 2 symbols")
    private String title;

    @Column(name="section")
    private String section;

    @Column(name="tags")
    private String tags;

    @Column(name="text")
    private String text;

    @Column(name="authorMark")
    private int authorMark;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "overview_user",
            joinColumns = @JoinColumn(name = "overview_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> userList;

    public void addUsertoOverview(User user){
        if(userList==null){
            userList = new ArrayList<>();
        }
        userList.add(user);
    }
    public Overview() {
    }

    public Overview(String title, String section, String tags, String text, int authorMark) {
        this.title = title;
        this.section = section;
        this.tags = tags;
        this.text = text;
        this.authorMark = authorMark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getAuthorMark() {
        return authorMark;
    }

    public void setAuthorMark(int authorMark) {
        this.authorMark = authorMark;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
