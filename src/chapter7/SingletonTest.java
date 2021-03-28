package chapter7;

final class SingletonTest {
    private static SingletonTest instance = new SingletonTest();

    private SingletonTest(){

    }
    public static SingletonTest getInstance(){
        if(instance == null)
            instance = new SingletonTest();
        return instance;
    }
}

class SingleTonTest{
    public static void main(String[] args) {
        SingletonTest s = SingletonTest.getInstance();
    }
}