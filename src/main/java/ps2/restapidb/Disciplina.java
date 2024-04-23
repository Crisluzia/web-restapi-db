package ps2.restapidb;

import javax.persistence.*;

@Entity
@Table(name="disciplinas")
public class Disciplina {
	@Id @GeneratedValue
	private long id;
	private String nome;
	private int carga;
    private String curso;
		
	public Disciplina() {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
    public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}


}