package comp;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class ContactInfo {

	private Set<Long> phoneNumbers;
	private Set<Date> dates;
	
	
	public void setPhoneNumbers(Set<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
		System.out.println("ContactInfo implementation class is :: "+ phoneNumbers.getClass() );
	}

	public void setDates(Set<Date> dates) {
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "ContactInfo [phoneNumbers=" + phoneNumbers + ", dates=" + dates + "]";
	}

	
}
