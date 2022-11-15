package br.com.devtur.model;

import java.math.BigDecimal;
import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat.Style;


@Entity
public class Viagem extends Entidade {

	 @Column(nullable = false)
	    private String nome;
	 
	 @Column(nullable = false, columnDefinition = "TEXT")
	    private String acompanhantes;

	    @Column(nullable = false, columnDefinition = "TEXT")
	    private String descricao;

	    @Column(name = "data_inicio", nullable = false)
	    @DateTimeFormat(iso = ISO.DATE)
	    private LocalDate dataInicio;

	    @Column(name = "data_fim")
	    @DateTimeFormat(iso = ISO.DATE)
	    private LocalDate dataFim;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "cliente_id_fk", nullable = false)
	    private Cliente cliente;

	    @Column(nullable = false)
	    @NumberFormat(style = Style.CURRENCY, pattern = "#,##0.00")
	    private BigDecimal orcamento;

	    @Column(nullable = false)
	    @NumberFormat(style = Style.CURRENCY, pattern = "#,##0.00")
	    private BigDecimal gastos;


	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	    
	    public String getAcompanhantes() {
	        return acompanhantes;
	    }

	    public void setAcompanhantes(String acompanhantes) {
	        this.acompanhantes = acompanhantes;
	    }

	    public String getDescricao() {
	        return descricao;
	    }

	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }

	    public LocalDate getDataInicio() {
	        return dataInicio;
	    }

	    public void setDataInicio(LocalDate dataInicio) {
	        this.dataInicio = dataInicio;
	    }

	    public LocalDate getDataFim() {
	        return dataFim;
	    }

	    public void setDataFim(LocalDate dataFim) {
	        this.dataFim = dataFim;
	    }

	    public Cliente getCliente() {
	        return cliente;
	    }

	    public void setCliente(Cliente cliente) {
	        this.cliente = cliente;
	    }

	    public BigDecimal getOrcamento() {
	        return orcamento;
	    }

	    public void setOrcamento(BigDecimal orcamento) {
	        this.orcamento = orcamento;
	    }

	    public BigDecimal getGastos() {
	        return gastos;
	    }

	    public void setGastos(BigDecimal gastos) {
	        this.gastos = gastos;
	    }
	    
	}
