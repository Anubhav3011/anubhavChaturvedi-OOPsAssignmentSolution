package departments;

/**
 * @author Anubhav Chaturvedi
 * @category OOPsAssignmentSolution
 * @date 2021-08-26
 */

public class HrDepartment extends SuperDepartment {

	@Override
	public String departmentName() {
		return " Hr Department ";
	}

	@Override
	public String getTodaysWork() {
		return " Fill today’s worksheet and mark your attendance ";
	}

	@Override
	public String getWorkDeadline() {
		return " Complete by EOD ";
	}

	public String doActivity() {
		return " team Lunch ";
	}
}
