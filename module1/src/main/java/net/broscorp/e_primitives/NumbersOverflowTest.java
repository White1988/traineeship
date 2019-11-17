import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumbersOverflowTest {

  @Test
  public void shouldAnalyseByteOverflow() {
    byte byteTest = Byte.MAX_VALUE;
    byte result = ++byteTest;
    assertEquals(Byte.MAX_VALUE + 1, result);
  }

  @Test
  public void shouldAnalyseShortOverflow() {
    short shortTest = Short.MAX_VALUE;
    short result = ++shortTest;
    assertEquals(Short.MAX_VALUE + 1, result);
  }


  @Test
  public void shouldAnalyseIntegerOverflow() {
    int intTest = Integer.MAX_VALUE;
    int result = ++intTest;
    assertEquals((long) Integer.MAX_VALUE + 1, result);
  }

  @Test
  public void shouldAnalyseLongOverflow() {
    long longTest = Long.MAX_VALUE;
    long result = ++longTest;
    assertEquals(-9223372036854775808L, result);
  }

  @Test
  public void shouldAnalyseFloatOverflow() {
    float floatTest = Float.MAX_VALUE;
    float result = ++floatTest;
    assertEquals(Float.MAX_VALUE, result);

  }

  @Test
  public void shouldAnalyseDoubleOverflow() {
    double doubleTest = Double.MAX_VALUE;
    double result = ++doubleTest;
    assertEquals(Double.MAX_VALUE, result);
  }

  @Test
  public void shouldAnalysePrimitivesConversion() {
    long b = (long) Integer.MAX_VALUE;
    b++;
    int result = (int) b;
    assertEquals(b, result);
  }

  @Test
  public void shouldAnalyseFloatNumbers() {
    double result = 2.0 - 1.1;
    assertEquals(0.9, result);
  }
}