package FizzBuzz;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class FizzBuzzTest {
  @Test public void testGeneratesCorrectValue() {
    FizzBuzz fb = new FizzBuzz(15);
    assertEquals(String.valueOf("1"), fb.generateValue(1));
    assertEquals(String.valueOf("Fizz"), fb.generateValue(3));
    assertEquals(String.valueOf("Buzz"), fb.generateValue(5));
    assertEquals(String.valueOf("FizzBuzz"), fb.generateValue(15));
  }
  
  @Test public void testGeneratesCorrectSequence() {
    FizzBuzz fb = new FizzBuzz(5);
    ArrayList<String> testSequence = new ArrayList<>(Arrays.asList("1", "2", "Fizz", "4", "Buzz"));
    assertEquals(testSequence, fb.generateSequence());
  }
}
