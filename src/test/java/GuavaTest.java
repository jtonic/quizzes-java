import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

/**
 * Antonel Pazargic (pazaran)
 * <p>Date: 04/09/2014
 * <p>Time: 08:46
 */
public class GuavaTest {

    @Test
    public void testToString() throws Exception {
        final HashSet<String> strings = Sets.newHashSet("one", "two");
        final String toStr = Joiner.on(',').join(strings);
        System.out.println("toStr = " + toStr);
    }

    @Test
    public void testSplitter() {
        String dgsFilter = "DG1, DG2, DG3";
        List<String> listDgs = Lists.newArrayList(Splitter.on(',').split(dgsFilter));
        System.out.println("Iterables.toString(listDgs) = " + Iterables.toString(listDgs));
        MatcherAssert.assertThat(listDgs, Matchers.hasSize(3));
    }

}
