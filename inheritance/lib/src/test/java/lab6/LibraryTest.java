/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test void testRestaurant(){
        Restaurant testRes = new Restaurant("irbid","$$");

        assertEquals("irbid",testRes.getName());
        assertEquals("$$",testRes.getPriceCategory());


    }

    @Test void testReview(){
        Review fromCustmer= new Review("nice restaurant","abrar",4);



        assertEquals("nice restaurant",fromCustmer.getbody());
        assertEquals("abrar",fromCustmer.getauthor());
        assertEquals(4,fromCustmer.getstars());

    }

    @Test void testShop(){
        Shop shop= new Shop("markt","nice market",2);



        assertEquals("markt",shop.getName());
        assertEquals("nice market",shop.getDesc());
        assertEquals(2,shop.dollarSign());

    }

    @Test void testTheater(){
        Theater theater=new Theater("amman");
        assertEquals("amman",theater.getName());


    }



}
