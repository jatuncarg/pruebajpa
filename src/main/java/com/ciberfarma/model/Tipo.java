package com.ciberfarma.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_tipos")
public class Tipo {
	@Id
	private int idtipo;
	private String descripcion;
	
	@OneToMany
	@JoinColumn(name = "idtipo", 
		insertable = false, updatable = false)
	private List<Usuario> lstUsuarios;
}








