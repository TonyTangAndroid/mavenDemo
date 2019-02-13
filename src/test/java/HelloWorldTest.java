import com.google.common.truth.Truth;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void get() {

        Truth.assertThat(1+1).isEqualTo(2);
    }
}