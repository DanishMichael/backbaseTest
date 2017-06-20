package com.backbase.assignment.service;

import com.backbase.assignment.model.ATM;
import com.backbase.assignment.repo.AtmDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AtmServiceImpl implements AtmService{

    @Autowired
    private AtmDao atmDao;

    public List<ATM> getAtmList() throws Exception {

        return atmDao.getATMList();
    }

    public List<ATM> getAtmListByCity(String city) throws Exception {

        List<ATM> atmListByCity = new ArrayList<>();
        List<ATM> atmList = getAtmList();
        for (ATM atm : atmList) {
            if (city.equalsIgnoreCase(atm.getAddress().getCity())) {
                atmListByCity.add(atm);
            }
        }
        return atmListByCity;
    }

}
