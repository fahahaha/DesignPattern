package composite;

public class Department extends OrganizationComponent{

	public Department(String name, String des) {
		super(name, des);
		// TODO Auto-generated constructor stub
	}
	//add,remove不需要，因为它是叶子节点

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	
	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		return super.getDes();
	}
	
	@Override
protected void print() {
	// TODO Auto-generated method stub
	System.out.println(getName());
}
}
