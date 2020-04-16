package composite;

import java.util.ArrayList;
import java.util.List;

//学校 就是composite这个角色 ，可以管理college
public class University extends OrganizationComponent {

	List<OrganizationComponent> organizationComponents=new ArrayList<OrganizationComponent>();
	//构造器
	public University(String name, String des) {
		super(name, des);
		// TODO Auto-generated constructor stub
	}

	//重新add
	@Override
	protected void add(OrganizationComponent organizationComponent) {
		// TODO Auto-generated method stub
		organizationComponents.add(organizationComponent);
	}
	
	//重写remove
	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		// TODO Auto-generated method stub
		organizationComponents.remove(organizationComponent);
	}
	
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
	
	//输出学院
	@Override
	protected void print() {
		// TODO Auto-generated method stub
		System.out.println("----------------" +getName()+"-----------------------");
		//遍历organizationComponents
		for (OrganizationComponent organizationComponent : organizationComponents) {
			organizationComponent.print();
		}
	}

	
	
}
