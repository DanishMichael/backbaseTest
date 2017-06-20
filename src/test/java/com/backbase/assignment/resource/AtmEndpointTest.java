package com.backbase.assignment.resource;

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
public class AtmEndpointTest {

	@Autowired AtmEndpoint atmEndpoint;
	
	
	
	@Test
	public void testGetAtmListByCity() throws Exception{
		List<ATM> list = atmEndpoint.getAtmListByCity("Leiden");
		assertEquals(list.size(), 13);
		list = atmEndpoint.getAtmListByCity("Lahore");
		assertEquals(list.size(), 0);

	}
	

}
