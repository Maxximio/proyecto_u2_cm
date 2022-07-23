package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IHabitacionRepository;
import com.example.demo.repository.IHotelRepository;
import com.example.demo.repository.modelo.oneToMany.Habitacion;
import com.example.demo.repository.modelo.oneToMany.Hotel;

@Service
public class HotelServiceImpl implements IHotelService{

	@Autowired
	private IHotelRepository hotelRepository;
	
	@Autowired
	private IHabitacionRepository habitacionRepository;

	@Override
	public void insertarService(Hotel hotel) {
//		
//		List<Habitacion> habitaciones=hotel.getHabitaciones();
//		hotel.setHabitaciones(null);
		this.hotelRepository.insertar(hotel);
//		
//		//Buscar el Hotel
//		String numero=hotel.getNombre();
//		Hotel hotelBuscado=null;
//		
//		for(Habitacion hibit: habitaciones) {
//			hibit.setHotel(hotelBuscado);
//			this.habitacionRepository.insertar(hibit);
//		}
	}
	
	
	
}
