
public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		
		Student student1=new Student();
		
		student1.setId(1);
		student1.setFirstName("ipek");
		student1.setEmail("karakasipek@gml.com");
		student1.setLastName("karakas");
		student1.setPassword("12345");
		student1.setUserName("ipk12");
		
		
		Instructor instructor1=new Instructor();	
		instructor1.setEmail("aydnbulut@gml.com");
		instructor1.setId(2);
		instructor1.setNickName("egitmen1");
		instructor1.setPassword("5487");
		instructor1.setUserName("egitici");
		
		InstructorManager instructorM= new InstructorManager();
		instructorM.add(instructor1);
		instructorM.giveHomework(instructor1);
		
		
		
		StudentManager studentManager = new StudentManager();
		
		
		UserManager userManager =new UserManager();	
		
	}

}
