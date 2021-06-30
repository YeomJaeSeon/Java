package second.chapter12.enum1;

class Champion{
    enum Tier {Challenger, GrandMaster, Master, Diamond, Platinum, Gold, Silver, Bronze, Iron}

    private Tier tier;

    public Champion(Tier tier){
        this.tier = tier;
    }

    public Tier getTier() {
        return tier;
    }
}

public class Test {
    public static void main(String[] args) {
        Champion champion = new Champion(Champion.Tier.Gold);
        System.out.println(champion.getTier());

    }
}
