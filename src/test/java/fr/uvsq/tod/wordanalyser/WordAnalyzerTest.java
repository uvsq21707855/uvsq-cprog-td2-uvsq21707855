package fr.uvsq.tod.wordanalyser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class WordAnalyzerTest {
  @Test
  public void shouldTest() {
    fail("Not yet implemented.");
  }

  public void firstRepeatedCharactertest() {
    WordAnalyzer w = new WordAnalyzer("maan");
    assertEquals('a', w.firstRepeatedCharacter());
  }

  @Test
  public void  irstRepeatedCharactertest1() {
    WordAnalyzer wa=new WordAnalyzer("france");
    assertEquals('0', wa.firstRepeatedCharacter());
  }
}