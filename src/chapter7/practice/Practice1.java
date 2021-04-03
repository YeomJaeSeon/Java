package chapter7.practice;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    SutdaDeck() {
        for(int i = 0; i < cards.length; i++){
            if(i + 1 == 1 || i + 1 == 3 || i + 1 == 8){
                cards[i] = new SutdaCard(i + 1, true);
            }
            else cards[i] = new SutdaCard(i + 1, false);
        }
    }
    void shuffle(){
        for(int i = 0; i < 100; i++){
            int changeIdx = (int)(Math.random() * CARD_NUM);
            SutdaCard tmpCard = null;

            tmpCard = cards[0];
            cards[0] = cards[changeIdx];
            cards[changeIdx] = tmpCard;
        }
    }
    SutdaCard pick(int index){
        // 유효성검사
        if(index < 0 || index >CARD_NUM) return null;
        return cards[index];
    }

    SutdaCard pick(){
        int popIdx = (int)(Math.random() * CARD_NUM);
        return cards[popIdx];
    }
}
class SutdaCard {
    int num;
    boolean isKwang;
    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}
public class Practice1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();
        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");
        System.out.println();
        System.out.println(deck.pick(0));
    }
}

//7- 3
/*
오버라이딩은 부모 클래스의 메서드를 자식클래스에서 자신에 맞게
변변경한 메서드이다.
필요한 이유는 부모클래스로부터 상속받은 메서드를 자식클래스에서
자신에 맞게 다르게 구현해야할때 필요하다.
 */

//7-4
/*
c : 접근제어자는 조상의 메서드보다 좁은 범위로 변경할수 없다.(같거나 넓어야함)
d : 조상의 메서드보다 많은 수의 예외를 선언할수없다.
 */

//7-5
/*
Tv(){
super(100);
}
자식 클래스의 생성자에서 부모 멤버를 먼저초기화해야하므로
부모 클래스의 생성자를 호출해야하는데
아무것도 호출하지않았따.
이건 컴파일러가 자동으로 super();
를 넣는데
부모클래스의 생성자는 매개변수있는 생성자이므로
매개변수있는 생성자를 명시해주며 부모클래스의
생성자를 호출해야한다.
 */
//7-6
/*
자식이 객체를 만들면 해당 객체는 부모 인스턴스와 자식 인스턴스를 같이가지고있다.
그래서 부모 멤버를 자식 객체가 사용하려면 초기화를 해야함르ㅗ
부모의 멤버는 부모의 생성자로 초기화하므로 자식 클래스 생성자에서
부모클래스 생성자를 호출해서 부모 멤버를 초기화한다.
참고로 부모 클래스 생성자를 가장먼저호출해서 부모멤버부터
초기화해야한다.
 */

//7-7
/*
Child() -> Child(int x) -> Parent() -> Parent(int x) -> Object()
메서드가 실행디ㅗ는 순서는 역순
결과
200
// getX는 부모클래스의 멤버이다. 그래서 부모클래스의 인스턴스 x를 가르킨다.
 */

//7-8
/*
public protected default private - 1
 */

//7-9
/*
c 메서드 - 오버라이딩을 할수없다.
 */

//7-10
