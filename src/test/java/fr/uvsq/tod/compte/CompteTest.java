package fr.uvsq.tod.compte;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class CompteTest {


  @Test
  public void shouldCreateAnAccountWithTheSpecifiedBalance() {

      Compte c = new Compte(100);
      assertEquals(100, c.getBalance());
    }

  @Test
  public void testcrediter() {
    Compte compte = new Compte(100);

    compte.crediter(57);

    assertEquals(157, compte.getBalance());

  }

/*
  @Test
  public void shouldcomptepositif(){
    assertEquals();

  }

 */
}
