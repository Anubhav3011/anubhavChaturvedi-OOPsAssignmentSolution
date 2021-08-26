package departments;

/**
 * @author Anubhav Chaturvedi
 * @category OOPsAssignmentSolution
 * @date 2021-08-26
 */

public class AdminDepartment extends SuperDepartment {

	@Override
	public String departmentName() {
		return " Admin Department ";
	}

	@Override
	public String getTodaysWork() {
		return " Complete your documents submission ";
	}

	@Override
	public String getWorkDeadline() {
		return " Complete by EOD ";
	}
}
