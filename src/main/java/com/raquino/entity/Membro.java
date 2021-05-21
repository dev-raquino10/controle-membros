package com.raquino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "membro")
public class Membro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "nome_completo")
	private String nomeCompleto;
	
	@Column(name = "cabeca")
	private String cabeca;
	
	@Column(name = "genero")
	private String genero;
	
	@Column(name = "data_nascimento")
	private String dataNascimento;
	
	@Column(name = "idade")
	private int idade;
	
	@Column(name = "data_batismo")
	private String dataBatismo;
	
	@Column(name = "tempo_batismo")
	private int tempoBatismo;
	
	@Column(name = "privilegio")
	private String privilegio;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "usuario_JW")
	private String usuarioJw;
	
	@Column(name = "endereco")
	private String endereco;

		
	/**
	 *Constructor 
	 */
	public Membro() {

	}

	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the nomeCompleto
	 */
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	/**
	 * @param nomeCompleto the nomeCompleto to set
	 */
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	/**
	 * @return the cabeca
	 */
	public String getCabeca() {
		return cabeca;
	}

	/**
	 * @param cabeca the cabeca to set
	 */
	public void setCabeca(String cabeca) {
		this.cabeca = cabeca;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the dataNascimento
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the dataBatismo
	 */
	public String getDataBatismo() {
		return dataBatismo;
	}

	/**
	 * @param dataBatismo the dataBatismo to set
	 */
	public void setDataBatismo(String dataBatismo) {
		this.dataBatismo = dataBatismo;
	}

	/**
	 * @return the tempoBatismo
	 */
	public int getTempoBatismo() {
		return tempoBatismo;
	}

	/**
	 * @param tempoBatismo the tempoBatismo to set
	 */
	public void setTempoBatismo(int tempoBatismo) {
		this.tempoBatismo = tempoBatismo;
	}

	/**
	 * @return the privilegio
	 */
	public String getPrivilegio() {
		return privilegio;
	}

	/**
	 * @param privilegio the privilegio to set
	 */
	public void setPrivilegio(String privilegio) {
		this.privilegio = privilegio;
	}

	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the usuarioJw
	 */
	public String getUsuarioJw() {
		return usuarioJw;
	}

	/**
	 * @param usuarioJw the usuarioJw to set
	 */
	public void setUsuarioJw(String usuarioJw) {
		this.usuarioJw = usuarioJw;
	}

	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	@Override
	public String toString() {
		return "Membro [id=" + id + ", nome=" + nome + ", nomeCompleto=" + nomeCompleto + ", cabeca=" + cabeca
				+ ", genero=" + genero + ", dataNascimento=" + dataNascimento + ", idade=" + idade + ", dataBatismo="
				+ dataBatismo + ", tempoBatismo=" + tempoBatismo + ", privilegio=" + privilegio + ", telefone="
				+ telefone + ", email=" + email + ", usuarioJw=" + usuarioJw + ", endereco=" + endereco + "]";
	}
	

}
