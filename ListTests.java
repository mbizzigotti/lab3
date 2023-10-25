import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests {
    public class containsA implements StringChecker {
        public boolean checkString(String s) {
            return s.contains("A");
        }
    }

	@Test 
	public void testFilter() {
        List<String> input1 = new ArrayList<String>();
        input1.add("A");
        input1.add("Apple");
        List<String> output1 = ListExamples.filter(input1, new containsA());
        assertEquals(output1.get(0), ("A"));
        assertEquals(output1.get(1), ("Apple"));
	}


    @Test
    public void testMerge() {
        List<String> input1 = new ArrayList<String>();
//        input1.add("a");
//        input1.add("b");
        List<String> input2 = new ArrayList<String>();
        input2.add("c");
        List<String> output1 = ListExamples.merge(input1, input2);
//        assertEquals(output1.get(0), ("a"));
//        assertEquals(output1.get(1), ("b"));
        assertEquals(output1.get(0), ("c"));
    }
}
