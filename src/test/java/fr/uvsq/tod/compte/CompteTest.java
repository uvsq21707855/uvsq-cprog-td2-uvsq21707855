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

  @Test
  public void testdebiter() {
    Compte compte= new Compte(100);
    compte.debiter(30);
    assertEquals(70,compte.getBalance());
  }

  @Test
  public void testvirement() {
    Compte c1=new Compte(100);
    Compte c=new Compte(20);
    c1.virement(c,50);
    assertEquals(70,c1.getBalance());
  }

  
}
