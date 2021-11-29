class UnHash{

    public static void main (String[] args) {
        System.out.println(revHash(6933552791181934L));
        System.out.println(hash("justdoit")); //574318821802
    }

    public static String letters = "cdefghijlmnoqstuvxz";

    public static String revHash(long hash) {                            //數字轉換成英文
        String result="";
        String newResult="";                                             //空字串

        while(hash != 7){                                                //當條件hash不等於7 繼續跑迴圈
            result = result + letters.charAt((int) (hash % 23));         //"abcde" charAt(3)=d
            hash = hash/ 23;
        }

        for (int i = result.length(); i>=1; i--){                        //ilovecoding是倒著顯示
            newResult = newResult + result.charAt(i-1);
        }
        return newResult;
    }

    public static long hash(String s){
        long h = 7;
        for (int i = 0; i < s.length(); i++){
            h = h * 23 + letters.indexOf(s.charAt(i));                   //"abcde" indexOf("b")=1
        }
        return h;
    }
}