package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "TDSS_TB_EMPRESA")
@SequenceGenerator(name = "empresa", sequenceName = "SQ_TDSS_TAB_EMPRESA", allocationSize = 1)
public class Empresa {

	@Id
	@Column(name = "id_empresa")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empresa")
	private int id;

	@Column(name = "nm_empresa", nullable = false, length = 100)
	private String nome;

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_abertura")//QUando não for obrigatorio não colocar nada
	private Calendar abertura;

	@Column(name = "nr_cnpj", nullable = false, length = 14)
	private String cnpj;

	@Column(name = "st_ativo", nullable = false, length = 1)
	private Boolean ativo;

	@Lob
	@Column(name = "fl_foto")
	private byte[] logo;

	@Enumerated(EnumType.STRING)
	@Column(name = "ds_porte", nullable = false, length = 20)
	private Porte porte;
	
	@Transient
	private String token;

	@Column(name = "vl_faturamento", nullable = false, precision = 10, scale = 3)
	private Double faturamento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getAbertura() {
		return abertura;
	}

	public void setAbertura(Calendar abertura) {
		this.abertura = abertura;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}


	public Porte getPorte() {
		return porte;
	}

	public void setPorte(Porte porte) {
		this.porte = porte;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Double getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(Double faturamento) {
		this.faturamento = faturamento;
	}

}
