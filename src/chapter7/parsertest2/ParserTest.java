package chapter7.parsertest2;

import javax.swing.text.html.HTML;

interface Parseable{
    void parse(String filename);
}

class XMLParser implements Parseable{
    public void parse(String filename){
        System.out.println(filename + "XML로 파싱완료");
    }
}

class HTMLParser implements Parseable{
    public void parse(String filename){
        System.out.println(filename + "HTML로 파싱완료");
    }
}

class NewXMLParser implements Parseable{
    public void parse(String filename){
        System.out.println(filename + "NEW XML로 파싱");
    }
}

class ParseManager{
    //타입이 인터페이스 == 인터퍼에스 구현한 클래스의 객체를 반환할것
    static Parseable getParser(String type){
        if(type == "XML"){
            // 실제로 인터페이스 구현한 클래스의 객체를 반환
            return new NewXMLParser();
        }else{
            HTMLParser p = new HTMLParser();
            return p;
        }
    }
}

public class ParserTest {
    public static void main(String[] args) {
        Parseable parser = ParseManager.getParser("XML");
        // 타입이렇게 맞춰준다. 사실 Parseable parser = new XMLParser();이런식으로되는데/
        // 인터페이스도 일종의 조상.! 그래서다형성가능.
        parser.parse("document.xml");
        parser = ParseManager.getParser("HTML");
        parser.parse("document.html");
    }
}
