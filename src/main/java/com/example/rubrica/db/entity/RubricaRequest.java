package com.example.rubrica.db.entity;

import java.util.Date;

public class RubricaRequest {

    private String nome;
    private String cognome;
    private String sesso;
    private Date data_di_nascita;
    private String numero_di_telefono;
    private String email;
    private String citta;

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getSesso() {
        return sesso;
    }

    public Date getdata_di_nascita() {
        return data_di_nascita;
    }

    public String getnumero_di_telefono() {
        return numero_di_telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getCitta() {
        return citta;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public void setdata_di_nascita(Date dataDiNascita) {
        this.data_di_nascita = dataDiNascita;
    }

    public void setnumero_di_telefono(String numeroDiTelefono) {
        this.numero_di_telefono = numeroDiTelefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }
}
