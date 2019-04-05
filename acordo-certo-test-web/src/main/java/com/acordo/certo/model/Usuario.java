package com.acordo.certo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="usuario_acordo_certo")
public class Usuario implements Serializable{

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	@Column(name="nome", nullable=false)
	private String nome;

	@Column(name="telefone", nullable=false)
	private Integer telefone;

	@Column(name="email", nullable=false)
	private String email;

	@Column(name="ind_ativo", nullable=false)
	private Boolean indAtivo;

	@Column(name="estado", nullable=false)
	private String estado;

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

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getIndAtivo() {
		return indAtivo;
	}

	public void setIndAtivo(Boolean indAtivo) {
		this.indAtivo = indAtivo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
