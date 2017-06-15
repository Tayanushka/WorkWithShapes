package org.itstep;

public class WorkWithGroup {

	public static void main(String[] args) {

		GroupStudent group = new GroupStudent();
		group.setName("ST20");

		for (int i = 0; i < 15; i++) {
			Student student = new Student(("Baby" + (i + 1)), ("myPass" + (i + 1)), "Alex", "Kiev");
			if (i > 8) {
				student = new Student(("Baby" + (i + 1)), ("myPass" + (i + 1)), "Alex", "Ternopil");
			}
			group.addStudentToGroup(student);

		}
		System.out.println("My best group is " + group.getName());
		System.out.println("List of Students: ");

		if (!group.getStudents().isEmpty())

			for (Student student : group.getStudents()) {
				switch(student.getCity()){
				case "Kiev":
				System.out.println("Login: " + student.getLogin() + " Name: " + student.getName() + " .I'm from "
						+ student.getCity());
				break;
				default:
					System.out.println("I don't know where I from...");
					break;
					
				}
				
				
				
				
				if (!student.getCity().equals("Kiev")) {

					// System.out.println("Login: " + student.getLogin() + "
					// Name: " + student.getName()+ " .I'm from "
					// +student.getCity());
					// System.out.println(student.hashCode());
					// }
					// else{
					System.out.println("Login: " + student.getLogin() + " Name: " + student.getName() + " .I'm from "
							+ student.getCity());

				}
				if (!student.getCity().contains("Tern")) {
					System.out.println("Login: " + student.getLogin() + " Name: " + student.getName() + " .I'm from "
							+ student.getCity());
					
				} else {

				}
			}

	}
}
