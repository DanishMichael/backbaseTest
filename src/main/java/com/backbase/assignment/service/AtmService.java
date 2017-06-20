package com.backbase.assignment.service;

import java.util.List;

import com.backbase.assignment.model.ATM;

public interface AtmService {

	public List<ATM> getAtmListByCity(String city) throws Exception;
}
