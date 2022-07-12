package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Persona;

@Repository
@Transactional
public class EstudianteJpaRepositoryImpl implements IEstudianteJpaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Estudiante estudiante) {
		this.entityManager.persist(estudiante);
	}

	@Override
	public Estudiante buscarEstudianteCedula(Integer cedula) {
		return this.entityManager.find(Estudiante.class, cedula);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.entityManager.merge(estudiante);
	}

	@Override
	public void eliminar(Integer cedula) {
		Estudiante estu=this.buscarEstudianteCedula(cedula);
		this.entityManager.remove(estu);
	}

	////////////////////////////////////////////////tarea 17
	@Override
	public List<Estudiante> buscarSemestreTyped(int semestre) {
		TypedQuery<Estudiante>miTypedQuery= this.entityManager
				.createQuery("select e from Estudiante e where e.semestre =:datoSemestre",Estudiante.class);
		miTypedQuery.setParameter("datoSemestre", semestre);
		return miTypedQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarCarreraTyped(String carrera) {
		TypedQuery<Estudiante>miTypedQuery= this.entityManager
				.createQuery("select e from Estudiante e where e.carrera =:datoCarrera",Estudiante.class);
		miTypedQuery.setParameter("datoCarrera", carrera);
		return miTypedQuery.getResultList();
	}

	@Override
	public Estudiante buscarNombreApellidoSemestreNamed(String nombre, String apellido, int semestre) {
		Query miQuery=this.entityManager.createNamedQuery("Estudiente.buscarPorNombreApellidoSemestre");
		miQuery.setParameter("datoNombre", nombre);
		miQuery.setParameter("datoApellido", apellido);
		miQuery.setParameter("datoSemestre", semestre);
		return (Estudiante) miQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarNombreCarreraNamed(String nombre, String carrera) {
		Query miQuery=this.entityManager.createNamedQuery("Estudiente.buscarNombreCarrera");
		miQuery.setParameter("datoNombre", nombre);
		miQuery.setParameter("datoCarrera", carrera);
		return miQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarApellidoCarreraNamedTyped(String apellido, String carrera) {
		TypedQuery<Estudiante>miTypedQuery=this.entityManager
				.createNamedQuery("Estudiente.buscarApellidoCarrera",Estudiante.class);
		miTypedQuery.setParameter("datoCarrera", carrera);
		miTypedQuery.setParameter("datoApellido", apellido);
		return miTypedQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarCarreraSemestreNamedTyped(String carrera, int semestre) {
		TypedQuery<Estudiante>miTypedQuery=this.entityManager
				.createNamedQuery("Estudiente.buscarCarreraSemestre",Estudiante.class);
		miTypedQuery.setParameter("datoCarrera", carrera);
		miTypedQuery.setParameter("datoSemestre", semestre);
		return miTypedQuery.getResultList();
	}

}
