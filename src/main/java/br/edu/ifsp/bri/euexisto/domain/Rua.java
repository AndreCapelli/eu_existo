/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.bri.euexisto.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author gahsabio
 */
@Entity
@Table(name = "RUA")
public class Rua {
    
    private int    id;
    private String nome;

    public Rua() {
    }

    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "SEQ_RUA", sequenceName = "SEQ_RUA",allocationSize = 1 ) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_RUA")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "NOME", length = 100, nullable = false)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rua other = (Rua) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rua{" + "id=" + id + ", nome=" + nome + '}';
    }       
}// fim da classe Rua
