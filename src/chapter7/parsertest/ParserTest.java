package chapter7.parsertest;
// 인터페이스와 다형성
// 인터페이스는 추상메서드 집합
// 인터페이스 구현은 추상메서드 {} 추가. implement하는 클래스에서/

// 그래서 인터페이스도일종의 조상(부모)
// 닿여성가능
// Parseable p = new HTMLParser(); // 부모타이의 참조변수(ㅇ니터페이스)가 자신을 구현한 클래스 인스턴스 참조가능


interface Parseable{
    void parse(String filename);
}

class XMLParser implements Parseable{

    // public이어야함. 인터페이스 메서드는 public abstract가 생략되어있따.
    @Override
    public void parse(String filename) {
        System.out.println(filename + "XMl 파싱완료");
    }
}

class HTMLParser implements Parseable{

    @Override
    public void parse(String filename) {
        System.out.println(filename + "HTML 파싱완료");
    }
}

class ParseManager{
    // type이 인터페이스. == 해당 인터페이스가 구현한 클래스 객체를 반환할 예정이다.
    public static Parseable getParser(String type){
        if(type.equals("XML")){
            // 인터페이스 구현 ㄱ클래스 객체반환
            return new XMLParser();
        }else{
            Parseable p = new HTMLParser();
            // 인터페이스 구현 클래스의 인스턴스 반환
            return p;
        }
    }
}

public class ParserTest {
    public static void main(String[] args) {
        Parseable parser = ParseManager.getParser("XML");
        parser.parse("document.xml");

        parser = ParseManager.getParser("HTML");
        parser.parse("document.html");
    }
}
