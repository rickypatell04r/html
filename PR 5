package com.example.guestbook;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String user;
    private String content;

    private Date date = new Date();

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }
}
