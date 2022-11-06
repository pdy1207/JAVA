package day03;

public class MyInfo implements StudyImple{
	
	/*
	메소드 이름은 같은데 파라미터의 갯수, 데이터값 다르다 
	= 오버로딩 
	*/
	
	public void printName(String name) {
		//여기서 로직구현
		System.out.println(name + "입니다.");
		name = "박도영";
	}
	public void printAge(int age) {
		
		System.out.println("나이는"+age);
	}
	
	@Override//오버라이딩 : 메소드 제정의(재구현)
	//오버로딩 : 메소드이름은 같으나 파라미터 타입 혹은 갯수가 다름
	//@ : 어노테이션
	
	public void printName(int age, String name) {
		
		System.out.println("나이 "+age+" 이름 " + name +"입니다.");
	}
	@Override
	public void main() {
		
		
	}
	

	
	
}
