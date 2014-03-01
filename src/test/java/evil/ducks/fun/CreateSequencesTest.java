package evil.ducks.fun;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyIterable;
import static org.hamcrest.Matchers.is;

public class CreateSequencesTest {
    @Test
    public void nilIsEmpty() {
        assertThat(Sequence.Nil, is(emptyIterable()));
    }
}