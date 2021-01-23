package com.whnm.service;

import java.util.List;

import com.whnm.model.Persona;

public class PersonaServiceImpl implements IPersonaService {

	@Override
	public void crear() {
		System.out.println("Persona creada");
	}

	@Override
	public List<Persona> listar() {
		return null;
	}

}
