import static org.junit.Assert.*;

import org.junit.Test;

public class SlotTest {
    String[] nullStringArray;
    String[] fourStringArray={"Bob","Rob","Roy","Sue"};
    String[] twoStringArray={"Bob","Rob"};
    SlotMachine bobbie=new SlotMachine();

    @Test
    public void testnullString() {
        String expected = null;
        assertEquals("Did not receive null", expected, bobbie.slotPanel.chooseImage(nullStringArray));
       
    }
    
    @Test
    public void testFourString() {
        String expected = "Sue";
        assertEquals("Did not receive null", expected, bobbie.slotPanel.chooseImage(fourStringArray));
        
    }
    
    @Test
    public void testTwoString() {
        String expected = "Bob";
        assertEquals("Did not receive null", expected, bobbie.slotPanel.chooseImage(twoStringArray));
        
    }

}
