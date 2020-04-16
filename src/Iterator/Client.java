package Iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<College> colleges=new ArrayList<College>();
		
		ComputerCollege computerCollege =new ComputerCollege();
		InfoCollege infoCollege=new InfoCollege();
		
		colleges.add(computerCollege);
		colleges.add(infoCollege);
		
		
		OutPutImp outPutImp=new OutPutImp(colleges);
		outPutImp.printCollege();
		/*===计算机学院====
				java
				php
				data
				python
				===信息工程学院====
				信息安全
				网络安全
				服务器安全*/

	}
}
