
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
		System.out.println(student.getId() +" numaralı öğrenci" + student.getFirstName() + student.getLastName() + "profilini düzenledi.");
	}
	public void manageSubscriptions(Student student) {
		System.out.println(student.getId()+"numaralı öğrenci" + student.firstName +"üyeliğini yönetti.");
	}
	public void joinCourse(Student student) {
		System.out.println(student.getId()+"kursa kaydoldu.");
	}
}