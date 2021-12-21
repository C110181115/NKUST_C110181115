import java.util.*;
public class joba {
    int hp=0;//設初始為0
    int att=0;
    int mp=0;
    String Job_name;
    private List<String> weapons=new ArrayList<String>();

    joba(String name){
        Job_name=name;
    }
    public void wear(String wp_name){
        weapons.add(wp_name);
        System.out.println(get_val("name")+"=>新增裝備:"+wp_name);
        show();
    }
    public void skill(String type){
        if (type=="攻擊")
            System.out.printf("%s 使用攻擊\n",get_val("name"));
        else
            System.out.printf("技能錯誤\n");
    }
    public void skill(String type,String skillname){
        if (type=="詠唱"&& !(skillname.isEmpty()))
            System.out.printf("%s 使用%s!!!\n",get_val("name"),skillname);
        else
            System.out.printf("技能錯誤\n");
    }

    private String get_val(String call_value){
        switch (call_value){
            case "name":
                return this.Job_name;
            case "hp":
                return String.valueOf(this.hp);
            case "att":
                return String.valueOf(this.att);
            case "mp":
                return String.valueOf(this.mp);
            default:
                break;
        }
        return "ERR";
    }
    public void show(){
        System.out.printf("%s (HP:%s,Att:%s,MP:%s)",
                get_val("name"),get_val("hp"),get_val("att"),get_val("mp"));
        System.out.printf(" 目前裝備:");
        for (String x :weapons)
            System.out.printf(x+" ");
        System.out.println();
    }
}
