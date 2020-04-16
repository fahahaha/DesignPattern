package Builder;

//指挥者，这里去指定制作流程，交给指挥者。
public class HouseDirector {

	HouseBuilder houseBuilder=null;
			
	//通过构造器传入housebuilder
	public HouseDirector(HouseBuilder houseBuilder) {
		super();
		this.houseBuilder = houseBuilder;
	}

	//通过setter 传入houseBilder
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	

	//如何建造房子的流程，交给指挥者
	public House constructHouse(){
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.buildRoofed();
		return houseBuilder.buildHouse();
	}
	
			
			
}
