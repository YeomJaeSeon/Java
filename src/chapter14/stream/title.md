# 스트림
- 데이터 소스를 다루는데 완전한 표준화를 이룸!
- 데이터 소스란 많은 데이터를 의미한다.
- 지금까지 데이터소스를 다루기 위해 사용한 방법으론 같은타입을 담는 배열, 그리고 컬렉션이다.(List, Set, Map 인터페이스 구현 컬렉션클래스들..)
- 그러나 이러한 녀서들은 다 데이터 요소를 다루는 방벙이 상이하다. 즉, 표준화가 되지않았다.
- 스트림은 데이터 소스의 요소들을 다루는데 `표준화`를 이루었따!!!
- 즉 데이터소스를 다루는데 공통의 방벙으로 다룰수있어 유지보수도, 재사용도 높아졌다.

# 스트림 사용
- 스트림의 사용은 세단계로이루어진다.
1. 스트림생성
2. 중간연산(n번)
3. 최종연산(1번) - 스트림 요소를 소모

- 일단 스트림을 생성한다음 스트림에 대한 중간연산을 n번할수있고 그리고 마지막 스트림 요소를 소모하는 최종연산을 한번할수있다.

# 스트림의 특징
1. 스트림은 원본 데이터소스를 변경하지않는다!
- 읽기 전용이다.
2. 스트림은 `Iterator`처럼 일회용이다
- 최종연산을 하면 스트림 요소를 소모하기에 스트림에대해 최종연산이 일어나면 다시 해당 스트림을 사용할수없고 `Iterator`처럼 다시 생성해서 사용해야한다.
3. 스트림은 작업을 내부 반복으로 처리한다.
- 무슨의미냐면 그냥 메서드 내부에서 반복문 처리를 한다는것이다
- 반복문을 그냥하면되는데 메서드라는 껍질내에서 한다는것이다.
- 왜? 사용하기에 간단하기떄문이다. 복잡한 반복문을 직접사용하는것보단 메소드내에 만들어진 반복문을 이용하면 사용하는 개발자 입장에선 메서드의 매개변수만 전달하면 반복문이 돌기때문이다.
- 성능에선 좋지않겠지만 **코드가 간결해진다.**
4. 지연된 연산
- 스트림에 대한 중간연산은 최종연산이 수행되기전에는 수행되지 않는다.
- 즉 중간연산은 지정만해놓는것이지 최종연산이 수행되어야 비로소 중간연산이 실행된다.
5. 병렬 스트림
- 병렬이란 멀티쓰레딩을 의미하고 수많은 데이터에 대해서 싱글 쓰레드보단 멀티쓰레드가 효율이 좋기 때문에 멀티쓰레드를 이용하는 스트림이 존재한다는 의미이다.
- `stream.parallel()`메서드를 통해서 스트림을 병렬스트림으로 변경한다.
6. 기본형 스트림
- 컬렉션의 데이터요소는 무조건 참조형으로 들어가야했다. 스트림도 동일하다.
- 결국 기본형에 대한 데이터는 요소로써 참조형으로 존재하고 다시 해당 데이터를 꺼내서 사용할땐 기본형으로 바꿔야 된다. (오토박싱과 언박싱이 컴파일러가 일어나게한다.)
- 그러나 이러한 과정의 비효율로 (데이터가 많아지면 오토박싱 언박싱 하는 비용자체가 부담일수있음) 요소로써 기본형을 가질수있는 `IntStream`, `LongStream`등의 기본형 스트림을 지원한다.