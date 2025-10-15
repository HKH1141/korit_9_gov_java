package com.korit.study.ch16.entity;

import java.time.LocalDateTime;

public class Todo {
    private int id;
    private String contents;
    private User user;
    private LocalDateTime createdAt;

    public Todo(int id, String contents, User user, LocalDateTime createdAt) {
        this.id = id;
        this.contents = contents;
        this.user = user;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public String getContents() {
        return contents;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public User getUser() {
        return user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", contents='" + contents + '\'' +
                ", user=" + user +
                ", createdAt=" + createdAt +
                '}';
    }
}
