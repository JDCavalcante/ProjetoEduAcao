package br.com.devtur.model;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class Funcionario extends Pessoa {

    @Column(name = "data_admissao", nullable = false)
    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate dataAdmissao;

    @Column(name = "data_demissao")
    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate dataDemissao;
    
    public String getNomeImagem() {
		return nomeImagem;
	}

	public void setNomeImagem(String nomeImagem) {
		this.nomeImagem = nomeImagem;
	}

	private String nomeImagem;
    

    @Column(nullable = false)
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public LocalDate getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(LocalDate dataDemissao) {
        this.dataDemissao = dataDemissao;
    }


    
}
