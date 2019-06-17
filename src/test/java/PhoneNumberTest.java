import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 94829 on 2018-05-20.
 */
public class PhoneNumberTest {
        String phoneNumber1 = "15229235980";
        //String phoneNumber2 = "15256555459801111";
        String phoneNumber2 = "13924627770";

        String phoneNumber3 = "83749658";



        @Test
        public void isPhoneLegal() throws Exception {
                assertTrue(PhoneNumberCheckUtils.isPhoneLegal(phoneNumber1));
        }

        @Test
        public void isChinaPhoneLegal() throws Exception {
                assertTrue(PhoneNumberCheckUtils.isChinaPhoneLegal(phoneNumber2));
        }

        @Test
        public void isHKPhoneLegal() throws Exception {
                assertTrue(PhoneNumberCheckUtils.isHKPhoneLegal(phoneNumber3));
        }
}
