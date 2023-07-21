package com.example.rubrica.db.entity;

import java.util.Date;

public class UpdateRubricaRequest {

    private Long id;
    private String nome;
    private String cognome;
    private String sesso;
    private Date data_di_nascita;
    private String numero_di_telefono;
    private String email;
    private String citta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public Date getdata_di_nascita() {
        return data_di_nascita;
    }

    public void setdata_di_nascita(Date dataDiNascita) {
        this.data_di_nascita = dataDiNascita;
    }

    public String getnumero_di_telefono() {
        return numero_di_telefono;
    }

    public void setnumero_di_telefono(String numeroDiTelefono) {
        this.numero_di_telefono = numeroDiTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }
}

