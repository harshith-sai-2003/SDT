import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeTest {

    @Test
    public void actionPerformed() {
    }

    @Test
    public void firstTurn() {
        TicTacToe obj=new TicTacToe();
        assertEquals(true, obj.firstTurn());
    }

    @Test
    public void check() {
        TicTacToe obj=new TicTacToe();
        assertEquals(obj.winner,obj.check());
    }

    @Test
    public void xWins() {
        TicTacToe obj=new TicTacToe();
        assertEquals(obj.Player2,obj.xWins(0,3,6));
    }

    @Test
    public void oWins() {
        TicTacToe obj=new TicTacToe();
        assertEquals(obj.Player1,obj.oWins(0,1,2));
    }

    @Test
    public void checkDraw() {
        TicTacToe obj=new TicTacToe();
        assertEquals("Draw",obj.checkDraw());
    }
}