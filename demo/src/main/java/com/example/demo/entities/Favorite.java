package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.resource.beans.internal.FallbackBeanInstanceProducer;
import org.springframework.jdbc.core.SqlRowSetResultSetExtractor;

@Entity
@Table(name = "favorite")
public class Favorite{
    @Id
    private Integer id;
    private String likes;
    @Column(name = "user_id")
    public Integer userId;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * @return the likes
     */
    public String getLikes() {
        return likes;
    }
    /**
     * @param likes the likes to set
     */
    public void setLikes(String likes) {
        this.likes = likes;
    }
    /**
     * @return the userId
     */
    public Integer getUserId() {
        return userId;
    }
    /**
     * @param userId the userId to set
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}