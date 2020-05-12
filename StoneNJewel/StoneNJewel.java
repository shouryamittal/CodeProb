//You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
//The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

class StoneNJewel {
    public int numJewelsInStones(String J, String S) {
        int jewels = 0;
        for(int i = 0; i < S.length(); i++) {
            for(int j = 0; j < J.length(); j++) {
                if(S.charAt(i) == J.charAt(j)) {
                    jewels++;
                }
            }
        }
        
        return jewels;
    }

    public static void main(String ...s) {
        StoneNJewel s = new StoneNJewel();
        int res = s.numJewelsInStones("aA", "aAAbbbb");
        System.out.println(res);
    }
}