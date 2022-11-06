package day04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListAndMap {
	public static void main(String[] args) {
		멤버 m = new 멤버();
//		m.멤버이름 = "유재석";  오류! 이유 : 필드변수가 public 아닌 private!
//		문제1. 필드변수에 접근을 할 수 있게 로직을 수정하시오.
//		단, 접근지정자는 건들지 말것
		m.set이름("유재석");
		String 이름 = m.get이름();
		System.out.println("이름 => " + 이름);
		m.set나이(25);
		int 나이 = m.get나이();
		System.out.println("나이 => " + 나이);
		
		
		List<멤버> list = new ArrayList<멤버>();
		list.add(m);
		
		멤버 m2 = new 멤버();
		m2.set이름("정형동");
		m2.set나이(40);
		
		list.add(m2);
		
		for(멤버 x : list) {
			System.out.println(x.get이름()+" , "+x.get나이());
		}
//문제2. 일반 for문으로 list 안에 있는 원소들 출력하기
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).get이름()+" , "+list.get(i).get나이());
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("1", m); //유재석
		map.put("2", m2); //정형동
		
//		(멤버) : cast
		멤버 멤버1 = (멤버) map.get("1");
		System.out.println("이름 : " + 멤버1.get이름()); // 유재석 이름
		System.out.println("나이 : " + 멤버1.get나이()); // 유재석 나이 
	}
}
class 멤버{
	private String 멤버이름; //필드 변수
	public void set이름(String 멤버이름) {
		this.멤버이름 = 멤버이름;
	}
	public String get이름() {
		return this.멤버이름;
	}
	
	private int 멤버나이;
	
	public void set나이(int 나이) {
		this.멤버나이 = 나이;
	}
	public int get나이() {
		return this.멤버나이;
	}
}