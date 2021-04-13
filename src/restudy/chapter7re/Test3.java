package restudy.chapter7re;

// 인터페이스 다형성 - 인터페이스 구현한 클래스의 객체만와라..
interface Parseable {
    void parse(String fileName);
}
class ParserManager{
    public static Parseable getParser(String type){
        if(type.equals("XML")){
            return new XMLParser();
        }else{
            Parseable p = new HTMLParser(); // 인터페이스 다형성. p의 리모컨엔 인터페이스의 멤버밖에없다. 이점주의
            return p;
        }
    }
}
class XMLParser implements Parseable{
    public void parse(String fileName){
        System.out.println(fileName + "-XML parsing completed");
    }
}
class HTMLParser implements Parseable{
    public void parse(String fileName){
        System.out.println(fileName + "-HTML parsing completed");
    }
}
public class Test3 {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        Parseable parser2 = ParserManager.getParser("HTML");
        parser2.parse("document.html");
    }
}
