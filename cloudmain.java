public class cloudmain {
    public static void main(String[] args) {
        cloud acr = new cloud("雲雲cloud菁英魔法師");
        acr.HP = 2000;
        acr.MP = 1000;
        acr.Att = 5;

        acr.showww();
        acr.skill("攻擊");
        acr.skill("詠唱","咒語卡 捆捆繩");
        acr.wear("榆木魔仗"+" ");
        acr.wear("巫師長袍");///////CLOUD CODE
        System.out.println();
    }
}
