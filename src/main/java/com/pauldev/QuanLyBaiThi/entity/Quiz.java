package com.pauldev.QuanLyBaiThi.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name ="quiz")
public class Quiz {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="image")
    private String image;
    @Column(name = "difficulty")
    private String difficulty;
    @Column(name ="create_at")
    private Timestamp create_at;
    @Column(name ="update_at")
    private Timestamp update_at;
    @Column(name="delete_at")
    private Timestamp delete_at;

    public Quiz() {
    }

    public Quiz(int id, String name, String description, String image, String difficulty, Timestamp create_at, Timestamp update_at, Timestamp delete_at) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.difficulty = difficulty;
        this.create_at = create_at;
        this.update_at = update_at;
        this.delete_at = delete_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public Timestamp getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Timestamp create_at) {
        this.create_at = create_at;
    }

    public Timestamp getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Timestamp update_at) {
        this.update_at = update_at;
    }

    public Timestamp getDelete_at() {
        return delete_at;
    }

    public void setDelete_at(Timestamp delete_at) {
        this.delete_at = delete_at;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", createdAt=" + create_at +
                ", updateAt=" + update_at +
                ", deleteAt=" + delete_at +
                '}';
    }
}
