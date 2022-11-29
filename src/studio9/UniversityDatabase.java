package studio9;

import assignment7.Student;

import java.util.HashMap;
import java.util.Map;

public class UniversityDatabase {
	private final Map<String, Student> dataset = new HashMap<String, Student>();

	public void addStudent(String accountName, Student student) {
		dataset.put(accountName, student);
	}

	public int getStudentCount() {
		return dataset.size();
	}

	public String lookupFullName(String accountName) {
		for (int i = 0; i < dataset.size(); i++) {
			
			if (dataset.containsKey(accountName) == true) {
				return Student.get(i).getFullName();
			}
		}
		return null;
	}

	public double getTotalBearBucks() {
		// TODO
		return 0.0;
	}
}
