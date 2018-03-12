package com.colpatria.api.entidades;

import java.util.Date;

public class Cliente {
	
	private String nombres;
	private String apellidos;
	private String identificacion;
	private Date fechaNacimiento;
	private Genero genero;
	private NivelEducativo nivelEducativo;
	private String celular;
	private String correoElectronico;
	private Integer personasDependientes;
	private EstadoCivil estadoCivil;
	private Integer estrato;
	private TipoVivienda tipoVivienda;
	private TipoActividad tipoActividad;
	private Integer ingresoMensual;
	private Boolean trabajaDondeVive;
	private TipoContrato tipoContrato;
	private Date fechaIncio;
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public NivelEducativo getNivelEducativo() {
		return nivelEducativo;
	}
	public void setNivelEducativo(NivelEducativo nivelEducativo) {
		this.nivelEducativo = nivelEducativo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public Integer getPersonasDependientes() {
		return personasDependientes;
	}
	public void setPersonasDependientes(Integer personasDependientes) {
		this.personasDependientes = personasDependientes;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Integer getEstrato() {
		return estrato;
	}
	public void setEstrato(Integer estrato) {
		this.estrato = estrato;
	}
	public TipoVivienda getTipoVivienda() {
		return tipoVivienda;
	}
	public void setTipoVivienda(TipoVivienda tipoVivienda) {
		this.tipoVivienda = tipoVivienda;
	}
	public TipoActividad getTipoActividad() {
		return tipoActividad;
	}
	public void setTipoActividad(TipoActividad tipoActividad) {
		this.tipoActividad = tipoActividad;
	}
	public Integer getIngresoMensual() {
		return ingresoMensual;
	}
	public void setIngresoMensual(Integer ingresoMensual) {
		this.ingresoMensual = ingresoMensual;
	}
	public Boolean getTrabajaDondeVive() {
		return trabajaDondeVive;
	}
	public void setTrabajaDondeVive(Boolean trabajaDondeVive) {
		this.trabajaDondeVive = trabajaDondeVive;
	}
	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	public Date getFechaIncio() {
		return fechaIncio;
	}
	public void setFechaIncio(Date fechaIncio) {
		this.fechaIncio = fechaIncio;
	}
}