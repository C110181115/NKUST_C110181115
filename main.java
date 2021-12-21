public class main {
    public static void main(String[] args) {
        joba arc=new joba("弓箭手");
        arc.hp=15;
        arc.att=30;
        arc.mp=10;

        arc.show();
        arc.skill("攻擊");
        arc.skill("詠唱","二重擊");
        arc.wear("蒼芎");
        arc.wear("鐵裝");
        System.out.println();

        joba warrior=new joba("狂戰士");
        warrior.hp=20;
        warrior.att=15;
        warrior.mp=5;

        warrior.show();
        warrior.skill("攻擊");
        warrior.skill("蓄力","劈砍");
        warrior.wear("巨斧");
        System.out.println();

        joba magician= new joba("魔法師");
        magician.hp=10;
        magician.att=40;
        magician.mp=30;

        magician.show();
        magician.skill("攻擊");
        magician.skill("詠唱","治癒術");
        magician.wear("法業障");
        System.out.println();
    }
}
