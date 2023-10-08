package comp;

import java.util.Arrays;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UniversityInfo {

	private Map<Integer, String> facultyDatils;
	private Map<String, Date> dateInfo;
	private Properties iplInfo;

	public void setIplInfo(Properties iplInfo) {
		this.iplInfo = iplInfo;
	}

	public void setFacultyDatils(Map<Integer, String> facultyDatils) {
		this.facultyDatils = facultyDatils;
	}

	public void setDateInfo(Map<String, Date> dateInfo) {
		this.dateInfo = dateInfo;
	}

	@Override
	public String toString() {
		return "UniversityInfo [facultyDatils=" + facultyDatils + ", dateInfo=" + dateInfo + ", iplInfo=" + iplInfo
				+ "]";
	}

}
