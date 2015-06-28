import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by jtonic on 28.06.2015.
 */
public class CollectionDynamicalChangeTest {


    @DataProvider(name = "dp")
    public Object[][] provideDate() {
        return new Object[][] {
            {Sets.<String>newHashSet("uuid1", "uuid2", "uuid3")}
        };
    }

    @Test(dataProvider = "dp")
    public void testIt(Set<String> uuids) {
        Joiner.MapJoiner mapJoiner = Joiner.on(";").withKeyValueSeparator(":");
        Map<String, VO> map = getMetadata(uuids);

        System.err.println("[Before] Maps: " + mapJoiner.join(map));
        removeFromMapBasedOnCondition(map);

        String mapAsString = mapJoiner.join(map);
        System.err.println("[After] Maps: " + mapAsString);

        MatcherAssert.assertThat(map.keySet(), Matchers.hasSize(2));
    }


    private static Map<String, VO> getMetadata(Set<String> uuids) {
        Map<String, VO> map = new HashMap<>();
        for (String s : uuids) {
            map.put(s, new VO(s, "valueOf_" + s));
        }
        return map;
    }


    static void removeFromMapBasedOnCondition(Map<String, VO> metadata) {
        Iterator<Map.Entry<String, VO>> it = metadata.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, VO> entry = it.next();
            if (entry.getValue().id.equals("uuid2")) {
                it.remove();
            }
        }
    }


    static class VO {
        public String id;
        public String value;

        public VO(String id, String value) {
            super();
            this.id = id;
            this.value = value;
        }

        @Override
        public String toString() {
            return Objects.toStringHelper(this)
                    .add("id", id)
                    .add("value", value)
                    .toString();
        }
    }

}
