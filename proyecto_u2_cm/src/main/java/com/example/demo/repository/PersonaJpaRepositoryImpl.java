package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Persona;
import com.example.demo.repository.modelo.PersonaContadorGenero;
import com.example.demo.repository.modelo.PersonaTo;

@Repository
@Transactional
public class PersonaJpaRepositoryImpl implements IPersonaJpaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Persona persona) {		
		this.entityManager.persist(persona);	
	}

	@Override
	public Persona buscarPersonaId(Integer id) {
		
		return this.entityManager.find(Persona.class, id);
	}

	@Override
	public void actualizar(Persona persona) {
		this.entityManager.merge(persona);
	}

	@Override
	public void eliminar(Integer id) {
		Persona p=this.buscarPersonaId(id);
		this.entityManager.remove(p);
	}
	
	@Override
	public Persona buscarPersonaCedula(String cedula) {
		Query jpqlQuery=this.entityManager
				.createQuery("select p from Persona p Where p.cedula = :datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);
		
		return (Persona) jpqlQuery.getSingleResult();
	}

	@Override
	public List<Persona> buscarPersonaApellido(String apellido) {
		Query jpqlQuery=this.entityManager
				.createQuery("select p from Persona p Where p.apellido = :datoApellido");
		jpqlQuery.setParameter("datoApellido", apellido);
		
		return jpqlQuery.getResultList();
	}

	@Override
	public List<Persona> buscarPersonaNombre(String nombre) {
		Query jpqlQuery=this.entityManager
				.createQuery("select p from Persona p Where p.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);
		
		return jpqlQuery.getResultList();
	}

	@Override
	public List<Persona> buscarPersonaGenero(String genero) {
		Query jpqlQuery=this.entityManager
				.createQuery("select p from Persona p Where p.genero = :datoGenero");
		jpqlQuery.setParameter("datoGenero", genero);
		
		return jpqlQuery.getResultList();
	}

	@Override
	public int actualizarPorApellido(String apellido,String genero) {
		
		Query myQuery=this.entityManager.createQuery
		("UPDATE Persona p SET p.genero = :datoGenero WHERE p.apellido = :datoApellido");
		myQuery.setParameter("datoGenero", genero);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.executeUpdate();
	}

	@Override
	public int eliminarPorGenero(String genero) {
		Query myQuery=this.entityManager.createQuery
				("DELETE Persona p WHERE p.genero =:datoGenero");
		myQuery.setParameter("datoGenero", genero);
		return myQuery.executeUpdate();
	}

	@Override
	public Persona buscarPersonaCedulaTyped(String cedula) {
		TypedQuery<Persona>miTypedQuery= this.entityManager
				.createQuery("select p from Persona p where p.cedula =:datoCedula",Persona.class);
		miTypedQuery.setParameter("datoCedula", cedula);
		return miTypedQuery.getSingleResult();
	}

	@Override
	public Persona buscarPersonaCedulaNamed(String cedula) {
		Query miQuery=this.entityManager.createNamedQuery("Persona.buscarPorCedula");
		miQuery.setParameter("datoCedula", cedula);//namedQuery con Query
		return (Persona) miQuery.getSingleResult();
	}
	
	@Override
	public Persona buscarPersonaCedulaNamedTyped(String cedula) {
		TypedQuery<Persona>miTypedQuery=this.entityManager
				.createNamedQuery("Persona.buscarPorCedula",Persona.class);
		miTypedQuery.setParameter("datoCedula", cedula);//namedQuery con TypedQuery
		return miTypedQuery.getSingleResult();
	}

	@Override
	public List<Persona> buscarPersonaNombreApellido(String nombre, String apellido) {
		Query miQuery=this.entityManager.createNamedQuery("Persona.buscarNombreApellido");
		miQuery.setParameter("datoNombre", nombre);
		miQuery.setParameter("datoApellido", apellido);
		return miQuery.getResultList();
	}

	@Override
	public Persona buscarPersonaCedulaNative(String cedula) {
		Query miQuery=this.entityManager.createNativeQuery
				("select * from persona where pers_cedula =:datoCedula",Persona.class);
		miQuery.setParameter("datoCedula", cedula);
		return (Persona) miQuery.getSingleResult();
	}

	@Override
	public Persona buscarPersonaCedulaNamedNative(String cedula) {
		TypedQuery<Persona>miTypedQuery=this.entityManager
				.createNamedQuery("Persona.buscarPorCedulaNative",Persona.class);
		miTypedQuery.setParameter("datoCedula", cedula);
		return miTypedQuery.getSingleResult();
	}

	@Override
	public Persona buscarPersonaCedulaCriteria(String cedula) {
		CriteriaBuilder myBuilder=this.entityManager.getCriteriaBuilder();
		
		CriteriaQuery<Persona> myQuery=myBuilder.createQuery(Persona.class);
		
		Root<Persona> personaRoot=myQuery.from(Persona.class);
		
		Predicate p1=myBuilder.equal(personaRoot.get("cedula"), cedula);
		
		CriteriaQuery<Persona> myQueryCompleto=myQuery.select(personaRoot).where(p1);
		
		TypedQuery<Persona> myQueryFinal=this.entityManager.createQuery(myQueryCompleto);
		return myQueryFinal.getSingleResult();
	}

	@Override
	public Persona buscarDinamica(String nombre, String apellido, String genero) {
		
		CriteriaBuilder myCriteria=this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Persona> myQuery=myCriteria.createQuery(Persona.class);
		Root<Persona> MyTabla=myQuery.from(Persona.class);//construccion hasta la tabla
		
		Predicate p1=myCriteria.equal(MyTabla.get("nombre"), nombre);
		Predicate p2=myCriteria.equal(MyTabla.get("apellido"), apellido);//condiciones
		
		Predicate pFinal=null;//condicion dinamica
		
		if(genero.equals("Masculino")) {
			 pFinal=myCriteria.and(p1,p2);//and
		}else {
			pFinal=myCriteria.or(p1,p2);//or
		}
		
		CriteriaQuery<Persona> myQueryCompleto=myQuery.select(MyTabla).where(pFinal);
		TypedQuery<Persona> myQueryFinal=this.entityManager.createQuery(myQueryCompleto);
		
		return myQueryFinal.getSingleResult();
	}

	@Override
	public List<PersonaTo> buscarPersonaSencillaApellido(String apellido) {
		TypedQuery<PersonaTo>miTypedQuery= this.entityManager
				.createQuery("select NEW com.example.demo.repository.modelo"
						+ ".PersonaTo(p.nombre,p.apellido) from Persona p "
						+ "where p.apellido =:datoApellido",PersonaTo.class);
		miTypedQuery.setParameter("datoApellido", apellido);
		return miTypedQuery.getResultList();
	}

	@Override
	public List<PersonaContadorGenero> CantidadPorGenero() {
		TypedQuery<PersonaContadorGenero>miTypedQuery= this.entityManager
				.createQuery("select new com.example.demo.repository.modelo"
						+ ".PersonaContadorGenero (p.genero,count(p.genero)) "
						+ "from Persona p GROUP BY  p.genero",PersonaContadorGenero.class);
		return miTypedQuery.getResultList();
	}

}
