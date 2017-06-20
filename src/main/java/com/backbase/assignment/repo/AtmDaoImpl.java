package com.backbase.assignment.repo;

import com.backbase.assignment.model.ATM;
import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.springframework.stereotype.Repository;


import java.util.Arrays;
import java.util.List;

@Repository
public class AtmDaoImpl implements AtmDao{
	
	private static final OkHttpClient restClient = new OkHttpClient();
	
    public List<ATM> getATMList() throws Exception {

		Request req = new Request.Builder().url("https://www.ing.nl/api/locator/atms/").build();
		String response = restClient.newCall(req).execute().body().string();
		response = response.substring(6, response.length());
		Gson gson = new Gson();
		
        ATM[] ingAtmLocations = gson.fromJson(response, ATM[].class);
        return Arrays.asList(ingAtmLocations);
    }

}
