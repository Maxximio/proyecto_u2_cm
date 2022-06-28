package com.example.demo.repository;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.ProyectoU2CmApplication;
import com.example.demo.model.Estudiante;

@Repository
public class EstudianteJdbcRepositoryImpl implements IEstudianteJdbcRepository{

	private static final Logger log=LogManager.getLogger(ProyectoU2CmApplication.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertar(Estudiante estu) {
		this.jdbcTemplate.update("insert into estudiante"
				+ "(cedula,nombre,apellido,carrera,semestre)"
				+ "values(?,?,?,?,?)"
				,new Object[] {estu.getCedula(),estu.getNombre(),estu.getApellido(),estu.getCarrera(),estu.getSemestre()});	
		
		log.info("**************Se ha insertado el estudiante a DB**************");
	}

	@Override
	public Estudiante buscar(int cedula) {
		log.info("El resultado de la busqueda es:");
		
		return this.jdbcTemplate.queryForObject("select * from estudiante where cedula=?"
				,new Object[] {cedula}, new BeanPropertyRowMapper<Estudiante>(Estudiante.class));
	}

	@Override
	public void actualizar(Estudiante estu) {
		this.jdbcTemplate.update("update estudiante set nombre=?,apellido=?,carrera=?,semestre=? where cedula=?"
				,new Object[] {estu.getNombre(),estu.getApellido(),estu.getCarrera(),estu.getSemestre(),estu.getCedula()});
		
		log.info("**************Se ha actualizado el estudiante a DB**************");
	}

	@Override
	public void eliminar(int cedula) {
		this.jdbcTemplate.update("delete from estudiante where cedula=?"
				,new Object[] {cedula});
		log.info("**************Se ha eliminado el estudiante a DB**************");
	}

}
