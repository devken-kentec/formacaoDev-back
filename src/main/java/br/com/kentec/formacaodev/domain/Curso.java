package br.com.kentec.formacaodev.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="curso")
@SuppressWarnings("serial")
public class Curso implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="nome", nullable = true, length = 100)
	private String nome;
	
	@Column(name="descricao", nullable = true, length = 400)
	private String descricao;
	
	@Column(name="duracao", nullable = true, length = 4)
	private Integer duracao;
	
	public Curso() {
		
	}

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", duracao=" + duracao + "]";
	}
	
}
