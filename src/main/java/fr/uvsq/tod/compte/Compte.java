package fr.uvsq.tod.compte;

/**
 * La classe <code>Compte</code> représente un compte bancaire.
 *
 * @author hal
 * @version 2020
 */
public class Compte {
  int init ;

  public Compte(int initialBalance) {
  this.init=initialBalance;
  }


  public int getBalance() {

    return init;
  }
}
