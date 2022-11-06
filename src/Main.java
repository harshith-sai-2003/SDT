public class Main {
    public static void main(String[] args) {
        TicTacToe tictactoe=new TicTacToe();
        Scoreboard sb=new Scoreboard(tictactoe.winner, tictactoe.Player1, tictactoe.Player2);
        sDisplay d=new sDisplay();
    }
}

