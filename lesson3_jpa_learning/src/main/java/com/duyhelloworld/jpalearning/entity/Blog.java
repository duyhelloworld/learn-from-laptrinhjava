package com.duyhelloworld.jpalearning.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // @id  = pk + not null

    @Column
    private String title;

    @Column
    private String content;
    
    @Column
    private String type;
    
    @Column
    private String tag;
    
    @Column(name = "short_description")
    private String shortDesc;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "edit_date")
    private Date editDate;

    @OneToMany(mappedBy = "blog")
    private List<Comment> comments = new ArrayList<Comment>();

    @ManyToOne
    @JoinColumn(name = "blog_id")
    private User user;

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getShortDesc() {
        return this.shortDesc;
    }

    public void setDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getEditDate() {
        return this.editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
