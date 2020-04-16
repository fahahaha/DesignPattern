package composite;

public abstract class OrganizationComponent {

	private String name;//名字
	private String des;//描述
	public OrganizationComponent(String name, String des) {
		super();
		this.name = name;
		this.des = des;
	}
	protected void add(OrganizationComponent organizationComponent){
		//默认实现 因为有一些叶子节点是不需要实现的
	}
	protected void remove(OrganizationComponent organizationComponent){
		//默认实现 因为有一些叶子节点是不需要实现的
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	
	//打印 都有 抽象
	protected abstract void print();
}
