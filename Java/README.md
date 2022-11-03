### 코딩을 하기전 먼저 문제를 보고 이해를 해보고 keypoint를 찾자

1. 객체지향 프로그래밍에서 자주 사용하는 개념

        객체지향 프로그래밍 : JavaScript, Java, C++, Python, Ruby...

2. 오버라이딩(Overriding)과 오버로딩(Overloading)이 무엇인지 간략 설명

        오버로딩 : 메소드 이름은 동일하나 파라미터 개수, 타입은 달라야 성립
        오버라이딩 : 인터페이스 혹은 부모 클래스를 상속 받아서 메소드를 재정의 하는 
        개념
        @Override
        @ : 어노테이션 (Spring 에서 많이 사용함!)

3. 추상클래스와 Interface(인터페이스)에 차이점 간략 설명

        인터페이스
        인터페이스에 작성하는 메소드는 무조건 public 
        인터페이스에서는 로직을 구현할 수 없다. 정의만!
        인터페이스를 사용하는 클래스는 무조건 
        인터페이스에서 정의한 메소드를 무조건 모두 사용해야한다.
        자바에서는 다중상속이 불가능해서 
        인터페이스로 다중상속을 구현하기도 한다.
        class A implements B

        자바에서는 하나 이상의 추상 메소드를 포함하는 클래스를 가리켜 추상 클래스(abstract class)라고 합니다.


4. 제네릭 컬렉션즈
        <> : 제네릭
        (*List, *Map), Set, Vertor, LinkedList.... : 컬렉션즈

        List<String> list = new ArrayList<String>();
        List<Intger> list = new ArrayList<Intger>();
        제네릭 안에는 클래스 타입만 올 수 있다.

5.자주사용하는 list 문법(메소드)

        list.add(); // 데이터 추가
        list.get(); // 데이터를 가져오다
        list.remove(); //데이터 삭제
        list.size(); //배열길이 가져오기
        
        =========================================map
        
        Map<String, String> map = new HashMap<String, String>();
        왼쪽: key
        오른쪽 : value

        즉, map은 key와 value로 구성된 컬렉션(자료구조)
        key는 중복될 수 없다.
        value는 중복 허용.

 
