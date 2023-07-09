package br.com.kentec.formacaodev.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="video")
@SuppressWarnings("serial")
public class Video implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="descricao", nullable = true, length = 500)
	private String descricao;
	
	@Column(name="url", nullable = true, length = 50)
	private String url;
	
	@Column(name="posicao", nullable = true, length = 400)
	private Integer posicao;
	
	@Column(name="tempo", nullable = true, length = 400)
	private String tempo;
	
	@ManyToOne
	@JoinColumn(name = "id_curso", nullable = false)
	private Curso curso = new Curso();
	
	public Video() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Video [id=" + id + ", descricao=" + descricao + ", url=" + url + ", posicao=" + posicao + ", tempo="
				+ tempo + ", curso=" + curso + "]";
	}
	
}
