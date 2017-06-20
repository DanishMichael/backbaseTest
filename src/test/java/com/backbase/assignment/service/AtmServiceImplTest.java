package com.backbase.assignment.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.backbase.assignment.model.ATM;

@RunWith(SpringRunner.class)
@WebMvcTest
public class AtmServiceImplTest {

	@Autowired AtmService atmServ;
	
	@Test
	public void testGetAtmListByCity() throws Exception{
		List<ATM> list = atmServ.getAtmListByCity("Leiden");
		assertEquals(list.size(), 13);
		list = atmServ.getAtmListByCity("Lahore");
		assertEquals(list.size(), 0);
	}

}
