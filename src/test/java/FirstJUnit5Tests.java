

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FirstJUnit5Tests {

    @Test
    void myFirstTest() {
        System.out.println("wenxiaoyu Test excute");
        assertEquals(2, 1 + 1);
    }

}
