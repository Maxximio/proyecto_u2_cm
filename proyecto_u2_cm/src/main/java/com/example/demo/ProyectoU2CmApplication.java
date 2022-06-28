package com.example.demo;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Estudiante;
import com.example.demo.model.Persona;
import com.example.demo.service.IEstudianteJdbcService;
import com.example.demo.service.IPersonaJdbcService;

@SpringBootApplication
public class ProyectoU2CmApplication implements CommandLineRunner{

	private static final Logger log=LogManager.getLogger(ProyectoU2CmApplication.class);
	
//	@Autowired
//	private IPersonaJdbcService personaJdbcService;
	
	@Autowired
	private IEstudianteJdbcService estudianteJdbcService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2CmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Estudiante estu=new Estudiante();
		estu.setCedula(12454);
		estu.setNombre("Carlos");
		estu.setApellido("Montalvo");
		estu.setCarrera("Ing Civil");
		estu.setSemestre(3);
		
		this.estudianteJdbcService.insertarService(estu);//insertar
		
		log.info(this.estudianteJdbcService.buscarService(12454));//comprobar (buscar)
		
		estu.setSemestre(4);
		
		this.estudianteJdbcService.actualizarService(estu);//actualizar
		
		log.info(this.estudianteJdbcService.buscarService(12454));//comprobar (buscar)
		
		this.estudianteJdbcService.eliminarService(12454);//eliminar
		
		///////////taller 15
		
//		System.out.println("Hola Mundo");
//		log.info("Hola Mundo");
		
//		Persona p=new Persona();
//		p.setId(2);
//		p.setNombre("Mateo");
//		p.setApellido("Perez");
//		
//		//Insertar
//		this.personaJdbcService.insertarService(p);
//		
//		
//		Persona per1=new Persona();
//		per1.setId(4);
//		per1.setNombre("Snatiago");
//		per1.setApellido("Velez");
//		
//		//Actualizar
//		this.personaJdbcService.actualizarService(per1);
//		
//		//Eliminar
//		this.personaJdbcService.eliminarService(2);
//		
//		//Buscar
//		log.info(this.personaJdbcService.buscarPersonaIdService(4));
	}

}
