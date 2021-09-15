package Tests;

import com.company.Args;
import org.junit.Assert;

import java.text.ParseException;

class ArgsTest {

    @org.junit.jupiter.api.BeforeEach
    void ConfiguraTeste() {

    }

    @org.junit.jupiter.api.Test
    void cardinalityTest() {
        String[] args = new String[]{"-l"};
        Args arg = null;
        try {
            arg = new Args("l,p#,d*",args);
            Assert.assertEquals(1,arg.cardinality());
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @org.junit.jupiter.api.Test
    void usage() {
        String[] args = new String[]{"-l"};
        try{
            Args arg = new Args("l,p#,d*", args);
            Assert.assertTrue(arg.has('l'));
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @org.junit.jupiter.api.Test
    void errorMenssage() {
        String[] args = new String[]{"-l"};
        try{
            Args arg = new Args("l,p#,d*", args);
            final boolean equals = arg.errorMenssage().equals("");
            Assert.assertFalse(equals);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @org.junit.jupiter.api.Test
    void getStringHasL() {
        String[] args = new String[]{"-l"};
        try{
            Args arg = new Args("l,p#,d*", args);
            Assert.assertEquals("",arg.getString('l') );
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @org.junit.jupiter.api.Test
    void getInt() {
    }

    @org.junit.jupiter.api.Test
    void has() {
    }

    @org.junit.jupiter.api.Test
    void isValid() {
    }
}