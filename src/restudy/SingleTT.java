package restudy;

import chapter8.RE;

final class Repository{
    private static Repository repository = new Repository();

    private Repository(){


    }

    public static Repository getInstance(){
        return repository;
    }
}

public class SingleTT {
    public static void main(String[] args) {
        Repository instance = Repository.getInstance();
        // singleton
    }
}
