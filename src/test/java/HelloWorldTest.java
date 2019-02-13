import com.google.common.truth.Truth;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @org.junit.Test
    public void get() {

        Truth.assertThat(1+1).isEqualTo(2);
    }
}