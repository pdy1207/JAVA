package account;

import java.util.ArrayList;
import java.util.List;

public class Study0810 {
	public static void main(String[] args) {
		//제네릭과 컬렉션즈
		//List, Map 
		List<String> list = new ArrayList<String>(); 
		// List<String> String 만 넣을 수 있는 list
		//list는 배열임! 배열과 다른점은 배열길이를 자유롭게 추가 삭제할 수 있다.
		list.add("돈까스");
		list.add("김밥");
		list.add("콩국수");
		list.add("칼국수");
		//길이를 가져오는 방법 
		System.out.println("배열길이는 ? " + list.size());
		//원소를 가져오는 방법
		System.out.println(list.get(0));
//문제1. 콩국수 출력하시오!
		System.out.println(list.get(2));
		//방법 2
		System.out.println(list.get(list.size()-1));
		
		//배열(List)하고 for문 친구!
		//List 출력하기 ( 정말많이 사용)
		for(int i=0; i<list.size(); i++) { //일반 for문 
			String 음식 = list.get(i);
			System.out.println("메뉴이름 : " + 음식);
		}
		for(String 음식 : list) { //for-each (향상된 for문)
			System.out.println("메뉴이름 : " + 음식);
		}
//문제2. 원소 값이 칼국수면 오늘은 칼국수 입니다 출력하시오.
		for(String 음식 : list) { //for-each (향상된 for문)
			if(음식.equals("칼국수" )) // "칼국수".equals(음식)
			System.out.println("오늘은 칼국수입니다.");
		}
		
		
		List<String> 가수 = new ArrayList<String>();
		가수.add("성시경");
		가수.add("폴킴");
		가수.add("SG워너비");
		가수.add("VOS");
		가수.add("성시경");
		
//문제3. for문을 이용해서 이름이 중복되는 가수 
		int result=0;
		String 찾는이름 = "성시경";
		for(int i=0; i<가수.size(); i++) {
			String sing = 가수.get(i);
			if(sing.equals(찾는이름))
				++result;	
			//앞 ++ 바로 뒤 ++ 천천히 서서히 ?
		}
		System.out.println("중복되는 가수 수는 ? " + result);
		
		
		
	}
}
