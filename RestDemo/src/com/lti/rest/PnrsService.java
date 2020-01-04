package com.lti.rest;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;

//Assumption: we are working for IRCTC and developing
//a REST API for others

@Path("/pnr")
public class PnrsService {
	@GET
	@Produces("application/json")
	public PnrDetails check(@QueryParam("pnrNo") long pnrNo, @Context HttpServletResponse response){
		response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
		/*
		 * in a real application,we will access some Dao class
		 * which in turn will access the database and return the
		 * required information to us
		 */
		
		PnrDao dao=new PnrDao();
		PnrDetails pnrDetails=dao.fetchPnrDetails(pnrNo);
		return pnrDetails;
		
	}
}
