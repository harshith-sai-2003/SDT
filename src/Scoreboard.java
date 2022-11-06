public class Scoreboard {
    String p1,p2;
    int s1=0,s2=0;
    Scoreboard(String winner,String pl1,String pl2){
        p1=pl1;
        p2=pl2;
        if(winner.equals("Draw")){
            s1++;
            s2++;
        }
        else if(winner.equals(p1))
            s1+=2;
        else
            s2+=2;
    }
}
