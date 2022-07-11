package com.example.demo;

import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;
import com.example.demo.service.IMatriculaGestorService;
import com.example.demo.service.IPropietarioService;
import com.example.demo.service.IVehiculoService;


@SpringBootApplication
public class ProyectoU2CmApplication implements CommandLineRunner{

	private static final Logger log=LogManager.getLogger(ProyectoU2CmApplication.class);
	
//	@Autowired
//	private IPersonaJpaService personaJpaService;
	
	@Autowired
	private IVehiculoService vehiculoService;
	
	@Autowired
	private IPropietarioService propietarioService;
	
	@Autowired
	private IMatriculaGestorService gestorService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2CmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	///////////tarea 16
		
	/////creando vehiculo
	System.out.println("###############################################################");
	Vehiculo vehiculo=new Vehiculo();
	vehiculo.setMarca("Chevrolet");
	vehiculo.setPlaca("1233521");
	vehiculo.setPrecio(new BigDecimal(20000));
	vehiculo.setTipo("P");

	this.vehiculoService.insertarService(vehiculo);
			
	//actualiza vehiculo
	System.out.println("###############################################################");
	vehiculo.setMarca("Mazda");
	vehiculo.setTipo("L");
			
	this.vehiculoService.actualizarService(vehiculo);
			
	//crea propietario
	System.out.println("###############################################################");
	Propietario pro=new Propietario();
	pro.setNombre("Carlos");
	pro.setApellido("Montalvo");
	pro.setCedula("456345345");
	pro.setFechaNacimiento(LocalDateTime.of(2000, 04, 01, 5, 30));
			
	this.propietarioService.insertarService(pro);
			
	//realiza matricula
	System.out.println("###############################################################");
	this.gestorService.generar("456345345", "1233521");
		
		///////////taller 19
		
//		Persona p1=new Persona();
//		p1.setApellido("Perez");
//		p1.setNombre("Ana");
//		p1.setCedula("3534");
//		p1.setGenero("Femenino");
//		
//		//this.personaJpaService.insertarService(p1);
//		
//		int resultado = this.personaJpaService.actualizarPorApellidoService("Aguilar", "Masculino");
//		
//		log.info("Cantidad Registros actualizados: "+resultado);
//		
//		int resulta2 =this.personaJpaService.eliminarPorGeneroService("Femenino");
//		
//		log.info("Cantidad Registros actualizados: "+resulta2);
		
		///////////tarea 15
		
//		List<Persona> listaPersonasNombre=this.personaJpaService.buscarPersonaNombreService("Mateo");
//		for(Persona p : listaPersonasNombre) {
//			log.info("lista1---"+p);
//		}
//		
//		log.info("segunda lista");
//		
//		List<Persona> listaPersonasGenero=this.personaJpaService.buscarPersonaGeneroService("Masculino");
//		for(Persona p : listaPersonasGenero) {
//			log.info("lista2---"+p);
//		}
		
		///////////taller 17
		
//		Persona persona1=new Persona();
//		persona1.setNombre("Juan");
//		persona1.setApellido("Montalvo");
//		persona1.setCedula("534");
//		persona1.setGenero("Masculino");
//		
//		//this.personaJpaService.insertarService(persona1);//create
//		
//		//log.info(this.personaJpaService.buscarPersonaCedulaService("123"));
//		
//		List<Persona> listaPersonas=this.personaJpaService.buscarPersonaApellido("Montalvo");
//		for(Persona p : listaPersonas) {
//			log.info("lista---"+p);
//		}
		
		///////////tarea 14
		
//		Estudiante estu=new Estudiante();
//		estu.setCedula(123546);
//		estu.setNombre("Carlos");
//		estu.setApellido("Montalvo");
//		estu.setCarrera("Arquitectura");
//		estu.setSemestre(2);
//		
//		this.estudianteJpaService.insertarService(estu);
//		
//		estu.setSemestre(3);
//		
//		this.estudianteJpaService.actualizarService(estu);
//		
//		log.info("El estudiante es: "+this.estudianteJpaService.buscarEstudianteCedulaService(123546));
//		
//		this.estudianteJpaService.eliminarService(123546);
		
		
		
		///////////taller 16
		
//		Persona persona1=new Persona();
//		persona1.setNombre("Mateo");
//		persona1.setApellido("Montalvo");
//		
//		this.personaJpaService.insertarService(persona1);//create
//		
//		persona1.setNombre("Ricardo");
//		
//		this.personaJpaService.actualizarService(persona1);//update
//		
//		log.info(this.personaJpaService.buscarPersonaIdService(5));//read
//		
//		this.personaJpaService.eliminarService(5);//delete
		
		//log.info("Lista de personas---> "+this.personaJdbcService.buscarTodosService());
		
		
		///////////taller 15
		
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
		
//		//Buscar
//		log.info(this.personaJdbcService.buscarPersonaIdService(4));
	}

}
