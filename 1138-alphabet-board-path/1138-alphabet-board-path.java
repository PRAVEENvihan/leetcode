class Solution {
    class Pair{
        int x;
        int y;
        Pair(int x , int y){
            this.x=x;
            this.y=y;
        }
    }
    public String alphabetBoardPath(String target) {
        HashMap<Character , Pair> map= new HashMap<>();
        for(int i=0 ; i<26;i++){
            map.put((char)(i+'a'),new Pair(i%5,i/5));
        }
        int posX=0;
        int posY=0;
        StringBuilder res=new StringBuilder();
        int index=0;
        while(index<target.length()){
            Pair p=map.get(target.charAt(index));
            while(p.y<posY){
                posY--;
                res.append('U');
            }
             while(p.x<posX){
                posX--;
                res.append('L');
            }
             while(p.y>posY){
                posY++;
                res.append('D');
            }
              while(p.x>posX){
                posX++;
                res.append('R');
            }
            index++;
            res.append('!');
        }
        return res.toString();
    }
}