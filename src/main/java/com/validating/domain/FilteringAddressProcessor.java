package com.validating.domain;



import org.apache.commons.lang3.StringUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class FilteringAddressProcessor implements ItemProcessor<Address, Address> {
	@Override
	 public Address process(Address p) throws Exception {
		

//		Address address = new Address();

		if (p.getAddressType() == "s") {
			if (p.getAddressLine1() == null) {
				p.setValid(false);
				String error = "Address Line is not mentioned";
				p.setError(error);
			}

			if (p.getCity() == null) {
				p.setValid(false);
				String error = "City is not mentioned";
				p.setError(error);
			}

			if (p.getStateCode() == null) {
				p.setValid(false);
				String error = "State Code is not mentioned";
				p.setError(error);
			}

			if (p.getZipcode() == null  )

			{
				p.setValid(false);
				String error = "Zip Code is not mentioned or not valid";
				p.setError(error);
			}

		}

		if (p.getAddressType2() == "s") {
			if (p.getAddressLine12() == null) {
				p.setValid(false);
				String error = "Address Line is not mentioned";
				p.setError(error);
			}

			if (p.getCity2() == null) {
				p.setValid(false);
				String error = "City is not mentioned";
				p.setError(error);
			}

			if (p.getStateCode2() == null) {
				p.setValid(false);
				String error = "State Code is not mentioned";
				p.setError(error);
			}

			if (p.getZipcode2() == null ) {
				p.setValid(false);
				String error = "Zip Code is not mentioned or not valid";
				p.setError(error);
			}

		}
		return p;

	}

}
