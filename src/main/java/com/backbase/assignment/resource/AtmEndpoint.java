package com.backbase.assignment.resource;

import com.backbase.assignment.service.AtmService;
import com.backbase.assignment.service.AtmServiceImpl;
import com.backbase.assignment.model.ATM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AtmEndpoint {

    @Autowired private AtmService atmServ;
    @Autowired private AtmServiceImpl atmLocator;
    

    @RequestMapping(value = "/atms/{city}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public
    @ResponseBody
    List<ATM> getAtmListByCity(@PathVariable("city") String city) throws Exception {
        return atmServ.getAtmListByCity(city);
    }


}
