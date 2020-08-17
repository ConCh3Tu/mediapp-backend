package com.mitocode.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "signos")
public class Signo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdSigno;
	
	@ManyToOne // FK
	@JoinColumn(name = "id_paciente", nullable = false, foreignKey = @ForeignKey(name = "FK_consulta_signo"))
	private Paciente paciente;
	
	@Column(name = "temperatura", nullable = false, length = 20)
	private String temperatura;
	
	@Column(name = "pulso", nullable = false, length = 60)
	private String pulso;
	
	
	@Column(name = "ritmo_respiratorio", nullable = false, length = 70)
	private String ritmoRespiratorio;
	
	@Column(name = "fecha", nullable = false)
	private LocalDateTime fecha;

	public Signo() {
	}
	
	

	public Signo(Integer idSigno, Paciente paciente, String temperatura, String pulso, String ritmoRespiratorio,
			LocalDateTime fecha) {
		IdSigno = idSigno;
		this.paciente = paciente;
		this.temperatura = temperatura;
		this.pulso = pulso;
		this.ritmoRespiratorio = ritmoRespiratorio;
		this.fecha = fecha;
	}



	public Integer getIdSigno() {
		return IdSigno;
	}

	public void setIdSigno(Integer idSigno) {
		IdSigno = idSigno;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public String getPulso() {
		return pulso;
	}

	public void setPulso(String pulso) {
		this.pulso = pulso;
	}

	public String getRitmoRespiratorio() {
		return ritmoRespiratorio;
	}

	public void setRitmoRespiratorio(String ritmoRespiratorio) {
		this.ritmoRespiratorio = ritmoRespiratorio;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	
	
	

	
	
	
	
}
