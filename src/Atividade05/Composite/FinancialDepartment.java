package Atividade05.Composite;

public class FinancialDepartment implements Department {

    public FinancialDepartment(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	private Integer id;
    private String name;

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

}