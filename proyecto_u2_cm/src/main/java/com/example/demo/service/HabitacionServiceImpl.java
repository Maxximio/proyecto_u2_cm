package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.repository.IHabitacionRepository;
import com.example.demo.repository.modelo.oneToMany.Habitacion;

@Service
public class HabitacionServiceImpl implements IHabitacionServiceImpl{

	private IHabitacionRepository habitacionRepository;
	
	@Override
	public void insertarSetvice(Habitacion habitacion) {
		this.habitacionRepository.insertar(habitacion);
	}

}
