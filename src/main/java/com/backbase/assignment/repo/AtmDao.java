package com.backbase.assignment.repo;

import java.util.List;

import com.backbase.assignment.model.ATM;

public interface AtmDao {

	public List<ATM> getATMList() throws Exception;
}
