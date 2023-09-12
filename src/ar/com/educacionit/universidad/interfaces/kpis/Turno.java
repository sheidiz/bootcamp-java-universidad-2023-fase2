package ar.com.educacionit.universidad.interfaces.kpis;

import java.time.LocalDateTime;

public class Turno {

	private LocalDateTime horario;
	private String dni;
	private String tipoTramite;
	private int sucursal;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaAtencion;
	private LocalDateTime fechaFinAtencion;
	private LocalDateTime fechaAbandono;
	private String asesor;//quien atiende el turno

	public Turno(String dni, String tipoTramite, LocalDateTime fechaCreacion,
			int sucursal) {
		this.dni = dni;
		this.tipoTramite = tipoTramite;
		this.fechaCreacion = fechaCreacion;
		this.sucursal = sucursal;
	}

	public LocalDateTime getHorario() {
		return horario;
	}

	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}

	public LocalDateTime getFechaAtencion() {
		return fechaAtencion;
	}

	public void setFechaAtencion(LocalDateTime fechaAtencion) {
		this.fechaAtencion = fechaAtencion;
	}

	public LocalDateTime getFechaFinAtencion() {
		return fechaFinAtencion;
	}

	public void setFechaFinAtencion(LocalDateTime fechaFinAtencion) {
		this.fechaFinAtencion = fechaFinAtencion;
	}

	public LocalDateTime getFechaAbandono() {
		return fechaAbandono;
	}

	public void setFechaAbandono(LocalDateTime fechaAbandono) {
		this.fechaAbandono = fechaAbandono;
	}

	public String getDni() {
		return dni;
	}

	public String getTipoTramite() {
		return tipoTramite;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public int getSucursal() {
		return sucursal;
	}

	public String getAsesor() {
		return asesor;
	}

}