package comp;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class CollegeInfo {

	private List<String> stdNames;
	private List<Date> dateList;

	public void setStdNames(List<String> stdNames) {
		this.stdNames = stdNames;
		System.out.println("CollegeInfo implementation class is being used there :: "+stdNames.getClass());
	}

	public void setDateList(List<Date> dateList) {
		this.dateList = dateList;
	}

	@Override
	public String toString() {
		return "CollegeInfo [stdNames=" + stdNames + ", dateList=" + dateList + "]";
	}

}
