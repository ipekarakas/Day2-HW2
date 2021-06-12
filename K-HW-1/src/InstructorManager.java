
public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.nickName +" oluþturuldu ! ");
	}
	public void giveHomework(Instructor instructor) {
		System.out.println(instructor.getId()+"numaralý eðitmen"+instructor.nickName+"yeni bir ödev ekledi!");
	}
	
}
