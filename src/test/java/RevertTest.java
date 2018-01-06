import org.junit.Test;
import task.Revert;

import static org.junit.Assert.assertEquals;

public class RevertTest {

    private Revert revert;

    @Test
    public void revert(){
        String text = "a,b,c,d";
        String res=revert.revert(text);
        assertEquals(res, "3c2b1a");
    }



}
