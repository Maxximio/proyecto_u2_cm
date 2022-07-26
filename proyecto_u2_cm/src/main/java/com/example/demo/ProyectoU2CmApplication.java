package com.example.demo;

import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.IHabitacionRepository;
import com.example.demo.repository.IHotelRepository;
import com.example.demo.repository.modelo.Persona;
import com.example.demo.repository.modelo.PersonaContadorGenero;
import com.example.demo.repository.modelo.PersonaTo;
import com.example.demo.repository.modelo.ManyToMany.Autor;
import com.example.demo.repository.modelo.ManyToMany.Libro;
import com.example.demo.repository.modelo.oneToMany.Autor2;
import com.example.demo.repository.modelo.oneToMany.Autor2libro2;
import com.example.demo.repository.modelo.oneToMany.Habitacion;
import com.example.demo.repository.modelo.oneToMany.Hotel;
import com.example.demo.repository.modelo.oneToMany.Libro2;
import com.example.demo.repository.modelo.oneToOne.Ciudadano;
import com.example.demo.repository.modelo.oneToOne.Empleado;
import com.example.demo.repository.modelo.oneToOne.Pasaporte;
import com.example.demo.service.IAutor2Service;
import com.example.demo.service.IAutorLibroService;
import com.example.demo.service.ICiudadanoService;
import com.example.demo.service.IHotelService;
import com.example.demo.service.ILibro2Service;
import com.example.demo.service.ILibroService;
import com.example.demo.service.IPersonaJpaService;


@SpringBootApplication
public class ProyectoU2CmApplication implements CommandLineRunner{

	private static final Logger log=LogManager.getLogger(ProyectoU2CmApplication.class);
	
	@Autowired
	private IHotelService hotelService;
	
	@Autowired
	private IHabitacionRepository habitacionRepository;
	
	@Autowired
	private ILibro2Service libro2Service;
	
	@Autowired
	private IAutor2Service autor2Service;
	
	@Autowired
	private IAutorLibroService autorLibroService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2CmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		///////////tarea 24
		
		
		////PARTE 1
		Libro2 libro2=new Libro2();
		libro2.setTitulo("La Biblia");
		libro2.setCantidadPaginas(1200);
		
		Autor2 autor2=new Autor2();
		autor2.setNombre("Miguel Ramirez");
		
		Autor2 autor22=new Autor2();
		autor22.setNombre("Julian Vanegas");
		
		Autor2libro2 mid1=new Autor2libro2();
		mid1.setAutor2(autor22);
		mid1.setLibro2(libro2);
		
		this.autorLibroService.insertarService(mid1);
		
		Autor2libro2 mid2=new Autor2libro2();
		mid2.setAutor2(autor2);
		mid2.setLibro2(libro2);
		
		this.autorLibroService.insertarService(mid2);
		
		//List<Autor2libro2> uniones=new ArrayList<Autor2libro2>();
		//uniones.add(mid1);
		//uniones.add(mid2);
		//libro2.setAutor2libro2(uniones);
		
		this.libro2Service.insertarService(libro2);
		
		this.autor2Service.insertarService(autor2);
		this.autor2Service.insertarService(autor22);
		
		////PARTE 2	
		
		Autor2 autor23=new Autor2();
		autor23.setNombre("Marcelo Vanegas");
		
		Libro2 libro22=new Libro2();
		libro22.setTitulo("Programacion A");
		libro22.setCantidadPaginas(2200);
		
		Libro2 libro23=new Libro2();
		libro23.setTitulo("Programacion B");
		libro23.setCantidadPaginas(2200);
		
		Autor2libro2 mid3=new Autor2libro2();
		mid3.setAutor2(autor23);
		mid3.setLibro2(libro22);
		this.autorLibroService.insertarService(mid3);
		
		Autor2libro2 mid4=new Autor2libro2();
		mid4.setAutor2(autor23);
		mid4.setLibro2(libro23);
		this.autorLibroService.insertarService(mid4);
		
		this.libro2Service.insertarService(libro22);
		this.libro2Service.insertarService(libro23);
		
		this.autor2Service.insertarService(autor23);
		
		
		///////////taller 26
		
//		Libro lib=new Libro();
//		lib.setTitulo("La Biblia");
//		lib.setCantidadPaginas(1200);
//		
//		Autor aut1=new Autor();
//		aut1.setNombre("Jesus");
//		
//		Autor aut2=new Autor();
//		aut2.setNombre("Pedro");
//		
//		Set<Autor> autores=new HashSet<>();
//		autores.add(aut1);
//		autores.add(aut2);
//		
//		lib.setAutores(autores);
//		this.libroService.insertarService(lib);
		
		///////////tarea 23

//		Restaurante res=new Restaurante();
//		res.setNombre("Ratatoulle");
//		res.setDireccion("Venezuela y Amazonas");
//		
//		Mesero mes=new Mesero();
//		mes.setCedula("32465");
//		mes.setNombre("Carlos");
//		mes.setApellido("Montalvo");
//		mes.setRestaurante(res);
//		
//		this.restauranteService.insertar(res);
//		
//		res.setNombre("Ratatoullie");
//		this.restauranteService.actualizar(res);
//		this.restauranteService.buscar(1);
//		
//		this.restauranteService.eliminar(1);
		
		//res.setMesero(null);
		
		///////////taller 25
		
//		Hotel hot=new Hotel();
//		hot.setId(2);
//		
//		Habitacion habi=new Habitacion();
//		habi.setNumero("21");
//		habi.setPiso("2");
//		habi.setTipo("Familiar");
//		
//		habi.setHotel(hot);
//		
//		//this.hotelService.insertarService(hot);
//		
//		this.habitacionRepository.insertar(habi);
		
		
		///////////tarea 22
		
//		Ciudadano ciu=new Ciudadano();
//		ciu.setNombre("Mario");
//		ciu.setApellido("Agusto");
//		ciu.setCedula("32453453");
//		ciu.setFechaNacimiento(LocalDateTime.of(2000, 04, 01, 16, 38));
//		
//		Pasaporte pasa=new Pasaporte();
//		pasa.setNumero("34636457465");
//		pasa.setFechaEmision(LocalDateTime.of(2014, 03, 10, 13, 53));
//		pasa.setFechaCaducidad(LocalDateTime.of(2023, 03, 10, 13, 53));
//		pasa.setCiudadano(ciu);
//		
//		ciu.setPasaporte(pasa);
//		
//		this.ciudadanoService.insertarService(ciu);
//		
//		log.info("el resultado es: "+this.ciudadanoService.buscarService(3));
//		
//		ciu.setNombre("Pedro");
//		this.ciudadanoService.actualizarService(ciu);
//		
//		this.ciudadanoService.eliminarService(3);
		
		///////////taller 24
		
//		Ciudadano ciu=new Ciudadano();
//		ciu.setNombre("Mario");
//		ciu.setApellido("Sandobal");
//		
//		Empleado emple=new Empleado();
//		emple.setCodigoIess("casdhsfads");
//		emple.setSalario(new BigDecimal(550.60));
//		emple.setCiudadano(ciu);
//		
//		ciu.setEmpleado(emple);
//		
//		this.ciudadanoService.insertarService(ciu);
		
		///////////tarea 20		
		
//		List<EstudianteTo> listaSencilla=this.estudianteJpaService.busquedaEstudianteTOApellidoService("Valverde");
//		for(EstudianteTo e : listaSencilla) {
//			log.info("forma Sencilla---"+e);
//		}
//		
//		List<EstudianteContadorCarrera> listaCarrerasCount=this.estudianteJpaService.cantidadPorCarreraService();
//		for(EstudianteContadorCarrera e : listaCarrerasCount) {
//			log.info("Contador Carreras---"+e);
//		}
		
		///////////taller 23
		
//		List<PersonaTo> listaSencilla=this.personaJpaService.buscarPersonaSencillaApellidoService("Montalvo");
//		for(PersonaTo e : listaSencilla) {
//			log.info("forma Sencilla---"+e);
//		}
//		
//		List<PersonaContadorGenero> listaSencilla2=this.personaJpaService.CantidadPorGeneroService();
//		for(PersonaContadorGenero e : listaSencilla2) {
//			log.info("forma Sencilla2---"+e);
//		}
		
		///////////tarea 19
		
//		List<Estudiante> listaCriteria=this.estudianteJpaService.buscarNombreApellidoCriteriaService("Jesus", "Valverde");
//		for(Estudiante e : listaCriteria) {
//			log.info("forma Criteria---"+e);
//		}
//		
//		List<Estudiante> listaCriteriaD=this.estudianteJpaService.busquedaDinamicaCarreraNombreConSemestreService("Medcina", "Samanta",5);
//		for(Estudiante e : listaCriteriaD) {
//			log.info("forma Criteria Dinamica---"+e);
//		}
		
		///////////taller 22
		
//		log.info(this.personaJpaService.buscarPersonaCedulaCriteriaService("534")+" forma criteria");
//		
//		log.info(this.personaJpaService.buscarDinamicaService("Juan", "Montalvo", "Masculino")+" forma criteria dinamica");
//		
//		log.info(this.personaJpaService.buscarDinamicaService("Maria", "Gallardo", "Femenino")+" forma criteria dinamica");
		
		///////////tarea 18
		
//		log.info(this.estudianteJpaService.buscarCedulaNativeService(543252)+" forma Native Query");
//		
//		List<Estudiante> listaNative=this.estudianteJpaService.buscarCarreraSemestreNativeService("Arquitectura", 8);
//		for(Estudiante e : listaNative) {
//			log.info("forma Native Query---"+e);
//		}
//		
//		log.info(this.estudianteJpaService.buscarNombreApellidoNamedNativeService("Carlos", "Montalvo")+" forma Named Native Query");
//		
//		List<Estudiante> listaNamedNative=this.estudianteJpaService.buscarApellidoCarreraNativeService("Montalvo","Ing en Computacion");
//		for(Estudiante e : listaNamedNative) {
//			log.info("forma Named Native Query---"+e);
//		}
		
		///////////taller 21		
		
//		log.info(this.personaJpaService.buscarPersonaCedulaNativeService("534")+" forma Native Query");
//		
//		log.info(this.personaJpaService.buscarPersonaCedulaNamedNativeService("534")+" forma Named Native Query");
		
		///////////tarea 17
		
//		List<Estudiante> listaSemestre=this.estudianteJpaService.buscarSemestreTypedService(8);
//		for(Estudiante e : listaSemestre) {
//			log.info("busqueda 1---"+e);
//		}
//		log.info("------------------------------------------------------------------------------");
//		List<Estudiante> listaCarrera=this.estudianteJpaService.buscarCarreraTypedService("Medicina");
//		for(Estudiante e : listaCarrera) {
//			log.info("busqueda 2---"+e);
//		}
//		log.info("------------------------------------------------------------------------------");
//		log.info("busqueda 3---"+this.estudianteJpaService
//				.buscarNombreApellidoSemestreNamedService("Carlos", "Montalvo", 6));
//		log.info("------------------------------------------------------------------------------");
//		List<Estudiante> listaNombreCarrera=this.estudianteJpaService.buscarNombreCarreraNamedService("Miguel","Medicina");
//		for(Estudiante e : listaNombreCarrera) {
//			log.info("busqueda 4---"+e);
//		}
//		log.info("------------------------------------------------------------------------------");
//		List<Estudiante> listaApellidoCarrera=this.estudianteJpaService.buscarApellidoCarreraNamedTypedService("Montalvo","Ing en Computacion");
//		for(Estudiante e : listaApellidoCarrera) {
//			log.info("busqueda 5---"+e);
//		}
//		log.info("------------------------------------------------------------------------------");
//		List<Estudiante> listaCarreraSemestre=this.estudianteJpaService.buscarCarreraSemestreNamedTypedService("Arquitectura",8);
//		for(Estudiante e : listaCarreraSemestre) {
//			log.info("busqueda 6---"+e);
//		}
		
		///////////taller 20
		
//		log.info(this.personaJpaService.buscarPersonaCedulaService("534")+" forma Query");
//		
//		log.info(this.personaJpaService.buscarPersonaCedulaTypedService("534")+" forma Typed Query");
//		
//		log.info(this.personaJpaService.buscarPersonaCedulaNamedService("534")+" forma Named Query");
//		
//		log.info(this.personaJpaService.buscarPersonaCedulaNamedTypedService("534")+" forma Named Typed Query");
//		
//		List<Persona> listaPersonasNombreA=this.personaJpaService.buscarPersonaNombreApellidoService("Mateo","Montalvo");
//		for(Persona p : listaPersonasNombreA) {
//			log.info("listaNombreApellido---"+p);
//		}
		
		///////////tarea 16
		
//	/////creando vehiculo
//	System.out.println("###############################################################");
//	Vehiculo vehiculo=new Vehiculo();
//	vehiculo.setMarca("Chevrolet");
//	vehiculo.setPlaca("1233521");
//	vehiculo.setPrecio(new BigDecimal(20000));
//	vehiculo.setTipo("P");
//
//	this.vehiculoService.insertarService(vehiculo);
//			
//	//actualiza vehiculo
//	System.out.println("###############################################################");
//	vehiculo.setMarca("Mazda");
//	vehiculo.setTipo("L");
//			
//	this.vehiculoService.actualizarService(vehiculo);
//			
//	//crea propietario
//	System.out.println("###############################################################");
//	Propietario pro=new Propietario();
//	pro.setNombre("Carlos");
//	pro.setApellido("Montalvo");
//	pro.setCedula("456345345");
//	pro.setFechaNacimiento(LocalDateTime.of(2000, 04, 01, 5, 30));
//			
//	this.propietarioService.insertarService(pro);
//			
//	//realiza matricula
//	System.out.println("###############################################################");
//	this.gestorService.generar("456345345", "1233521");
		
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
