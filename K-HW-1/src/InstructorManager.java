
public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.nickName +" olu�turuldu ! ");
	}
	public void giveHomework(Instructor instructor) {
		System.out.println(instructor.getId()+"numaral� e�itmen"+instructor.nickName+"yeni bir �dev ekledi!");
	}
	
}
