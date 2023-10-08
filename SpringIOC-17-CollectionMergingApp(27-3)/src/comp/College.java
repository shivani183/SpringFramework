package comp;

import java.util.Set;

public class College {

	private Set<String> subjects;

	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "College [subjects=" + subjects + "]";
	}

}
