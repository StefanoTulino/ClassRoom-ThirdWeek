//NOTA: Non è sempre possibile utilizzare le annotation @Data di Lombok
//2 file: 1) configurazione --> info sulle connessioni e le session factory
//        2) mapping --> come mappare le tabelle nel db

package com.corso.hibernate2;

import java.util.Date;


public class Event {
    private Long id;
    private Date date;
    private String title;
    private String description;

    public Event(){

    }

    public Event(String titolo, String descrizione, Date data) {
        this.title = titolo;
        this.description = descrizione;
        this.date = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
