import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest {

    private static Player player1;
    private static Player player2;

    @BeforeClass
    public static void setUp() 
    {
        player1 = new Player("Steffi Graf");
        player2 = new Player("Arancha Sanchez");
    }

    @Test
    public void canCreateNewPlayers1() 
    {
        assertNotNull(player1);
        assertNotNull(player2);
       
        
    }
    @Test
    public void canGetPlayerName() 
    {
    	assertEquals("Steffi Graf", player1.getName());
}
}


