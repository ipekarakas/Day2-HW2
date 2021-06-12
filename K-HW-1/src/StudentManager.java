
public class StudentManager {
	public void add(Student student) {
		System.out.println(student.firstName +"kaydedildi!");
	}
	public void addMultiple(Student[] students) {
		for(Student student : students) {
			add(student);
		}
	}
	
	public void editProfile(Student student) {
		System.out.println(student.getId() +" numaral� ��renci" + student.getFirstName() + student.getLastName() + "profilini d�zenledi.");
	}
	public void manageSubscriptions(Student student) {
		System.out.println(student.getId()+"numaral� ��renci" + student.firstName +"�yeli�ini y�netti.");
	}
	public void joinCourse(Student student) {
		System.out.println(student.getId()+"kursa kaydoldu.");
	}
}