package composite;

import java.util.ArrayList;
import java.util.List;
//学院
public class College  extends OrganizationComponent{
	//List中存放着department
	List<OrganizationComponent> organizationComponents=new ArrayList<OrganizationComponent>();
	//构造器
	public College(String name, String des) {
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
	
	//输出系
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
