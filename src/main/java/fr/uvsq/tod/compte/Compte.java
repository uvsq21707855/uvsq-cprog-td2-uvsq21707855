package fr.uvsq.tod.compte;

/**
 * La classe <code>Compte</code> représente un compte bancaire.
 *
 * @author hal
 * @version 2020
 */
public class Compte {
  private int solde;        // solde du compte


  public Compte(int initialBalance) {
    if (initialBalance>0) {
      this.solde = initialBalance;
    }
  }

  public int getBalance() {
    return solde;
  }

  public void crediter(int montant) {
    solde += montant;
  }

  public void debiter(int montant) {
    solde -= montant;
  }

  public void virement(Compte c, int mt){
    c.crediter(mt);
    debiter(mt);
  }

}
