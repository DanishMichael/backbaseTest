package com.backbase.assignment.repo;

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
public class AtmDaoImplTest {

	@Autowired AtmDaoImpl atmDao;
	
	@Test
	public void testGetATMList() throws Exception{
		
		List<ATM> atmList = atmDao.getATMList();
		assertEquals(atmList.size(), 1514);
	}

}
