package com.lti.rest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.lti.rest.Passenger.Gender;
import com.lti.rest.Passenger.Status;

public class PnrDao {

	public PnrDetails fetchPnrDetails(long pnrNo) {
		//jdbc code is missing
		PnrDetails pnrDetails=new PnrDetails();
		pnrDetails.setPnrNo(pnrNo);
		pnrDetails.setTrainNo(12111);
		pnrDetails.setTravelDate(LocalDate.of(2020, 01, 15));
		
		List<Passenger> passengers=new ArrayList<Passenger>();
		Passenger passenger1=new Passenger();
		passenger1.setName("Sita");
		passenger1.setGender(Gender.FEMALE);
		passenger1.setStatus(Status.WAITING);
		
		Passenger passenger2=new Passenger();
		passenger2.setName("Gita");
		passenger2.setGender(Gender.FEMALE);
		passenger2.setStatus(Status.WAITING);
		
		passengers.add(passenger1);
		passengers.add(passenger2);
		pnrDetails.setPassengers(passengers);
		
		return pnrDetails;
	}
	
}
