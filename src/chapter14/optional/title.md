# Optional 

- Interger, Double과같은 Wrapper클래스임

# 왜사용해?
- null을 간접적으로 다루기위해서.. - null직접적으로 다루면 NPE터져 위험하닌까!
- null처리하는 로직이 dirty하기때문에 깔끔하게 null처리하기위해서.. null처리하기 위해 if문으로 null처리하는데 이걸 안해도된다!

# Optional 사용

```java
import java.util.Optional;
import java.util.OptionalInt;

public class Test {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("123");
        // of메서드에 매개변수로 null이올수도있는 상황에선 ofNullable을 사용해서 optional객체 생성한다.
        Optional<String> optional1 = Optional.ofNullable(null);

        //참조변수 기본값으로 초기화, null로 초기화하기
        Optional<String> optional2 = null; //bad ... String s = null과같다.
        //바람직하게 기본값으로 초기화하려면
        Optional<String> optional3 = Optional.empty(); // good..!! String s= ""과같다.
        //이렇게 기본값으로 초기화해야 NPE를 막을수있따.
        //이렇게 참조변수는 null값을 저장할수있다. (당옇니. 기본값이 null)임.초기화안하면..
        //그런데 null을가르키는 참조변수를 사용하면!!! NPE가터짐
        // 이걸막으려고 초기화를 적절히 해주는것이다.

        //OPtional 사용하기
        String str = optional.get(); // 요소꺼냄. 그러나 value가 null가르키면 noSuchElementException터짐
        String str2 = optional2.orElse("EMPTY"); //optional 객체 멤버 value가 null이면 "EMPTY"를반환
        String str3 = optional3.orElseGet(() -> "EMPTY"); // 람다식을이용.. orElse와 같다.
//        String str4 = optional3.orElseThrow(); //예외던짐..

        boolean isPresent = optional.isPresent(); // 요소존재하는지 ..
        optional.ifPresent(System.out::println); //람다식을토앻 존재하면 람다식 실행

        //OptionalInt, OptionalLong. .. 내부적으로 참조변수를 갖는게아닌 primitive 변수를 가져서 성능향상
        //IntStream, 과같다..
        OptionalInt optInt = OptionalInt.of(100);
        int num = optInt.getAsInt();
        OptionalInt optInt2 = OptionalInt.empty();
        
        System.out.println(optInt.isPresent()); //true
        System.out.println(optInt2.isPresent()); //false
    }
}
```