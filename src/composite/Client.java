package composite;

public class Client {

	//从大到小
	public static void main(String[] args) {
		//学校
		OrganizationComponent university=new University("清华大学", "中国顶级");
		
		//学院
		OrganizationComponent computerCollege=new College("计算机学院", "计算机学院");
		OrganizationComponent educationCollege=new College("教育学院", "教育学院");
		
		//专业 系
		computerCollege.add(new Department("软件工程", "写软件"));
		computerCollege.add(new Department("网络工程", "写网络"));
		computerCollege.add(new Department("计算机科学与技术", "计算机科学与技术 老牌"));
		
		
		educationCollege.add(new Department("特殊教育", "小孩"));
		educationCollege.add(new Department("汉语", "教汉语"));

		//将两个学院加入到学校中
		university.add(computerCollege);
		university.add(educationCollege);
		
		//打印大学所有院校和专业
		university.print();
		/*----------------清华大学-----------------------
		----------------计算机学院-----------------------
		软件工程
		网络工程
		计算机科学与技术
		----------------教育学院-----------------------
		特殊教育
		汉语*/
		
		//打印专业
		computerCollege.print();

	}
}
