package org.toy.til.tdd.asert;

// https://jojoldu.tistory.com/231

import org.junit.Test;

import static org.toy.til.tdd.asert.Assert.assertThat;
import static org.toy.til.tdd.asert.Assert.assertTrue;

public class TestCase {

    @Test
    public void primitiveTest() {
        assertThat(10 + 10, 20);
        assertThat(Double.valueOf("10") + Double.valueOf("20"), Double.valueOf("30"));
        assertThat(1L + 2L, 3L);
        assertTrue(true);
    }


    @Test(expected = Assert.NotEqualsException.class)
    public void wrongPrimitiveTest() {
        assertThat(11 + 10, 20);
        assertThat(Double.valueOf("11") + Double.valueOf("20"), Double.valueOf("30"));
        assertThat(1L + 2L, 4L);
        assertTrue(false);

        // assertThat(1L + 2L, is(3L));
        // TODO implement matcher method !!
    }

}


