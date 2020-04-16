package Builder;

//抽象建造者
public abstract class HouseBuilder {
	protected House house=new House();

	//将建造流程写好
	public abstract void buildBasic();
	public abstract void buildWalls();
	public abstract void buildRoofed();
	
	//建造房子好后，将产品（房子）返回
	public House buildHouse(){
		return house;
		
	}
}

//普通房子
class CommonHouse extends  HouseBuilder{

	@Override
	public void buildBasic() {
		// TODO Auto-generated method stub
		System.out.println("普通房子打地基5米");
	}

	@Override
	public void buildWalls() {
		// TODO Auto-generated method stub
		System.out.println("普通房子砌墙10cm");
		
	}

	@Override
	public void buildRoofed() {
		// TODO Auto-generated method stub
		System.out.println("普通房子屋顶");
	}
	
}

//高楼
class HighBuilding extends  HouseBuilder{

	@Override
	public void buildBasic() {
		// TODO Auto-generated method stub
		System.out.println("高楼打地基100米");
	}

	@Override
	public void buildWalls() {
		// TODO Auto-generated method stub
		System.out.println("高楼砌墙20cm");
		
	}

	@Override
	public void buildRoofed() {
		// TODO Auto-generated method stub
		System.out.println("高楼透明屋顶");
	}
	
}