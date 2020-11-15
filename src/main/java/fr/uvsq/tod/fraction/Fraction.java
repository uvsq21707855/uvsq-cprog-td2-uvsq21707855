// une classe immuable : Un objet immuable
// est une instance de classe dont les membres exportés
// ne peuvent être modifiés après création

// impact qui aura sur l'implémentation :
// on met les attributs en private final.

package fr.uvsq.tod.fraction;

import java.math.BigInteger;


/**
 * La classe <code>Fraction</code> représente un nombre rationnel.
 *
 * @author hal
 * @version 2020
 */
public class Fraction implements Comparable<Fraction> {
  private final BigInteger denominateur;
  private final BigInteger numerator;
  private BigInteger a;
  private BigInteger b;


  static Fraction ZERO = new Fraction(BigInteger.valueOf(0),BigInteger.valueOf(1));
  static Fraction UN_DEMI  = new Fraction(BigInteger.valueOf(1),BigInteger.valueOf(2));
  static Fraction UN = new Fraction(BigInteger.valueOf(1),BigInteger.valueOf(1));
  /**
   * Initialise un nombre rationnel avec un numérateur et un dénominateur.
   * @param numerator le numérateur
   * @param denominator le dénominateur
   */
  public Fraction(BigInteger numerator, BigInteger denominator) {
  this.numerator = numerator;
  this.denominateur = denominator;
  }

  /**
   * Initialise un nombre rationnel avec un numérateur et le dénominateur fixé à 1.
   * @param numerator le numérateur
   */
  public Fraction(BigInteger numerator) {
  this.numerator = numerator;
  this.denominateur= BigInteger.valueOf(0);
  }
  // modification : on transforme l'int au BigInteger

  /**
   * Initialise un nombre rationnel avec 0 comme numérateur et 1 comme dénominateur.
   */
  public Fraction() {
    this.numerator= BigInteger.valueOf(0);
    this.denominateur= BigInteger.valueOf(1);
  }

  /**
   * Retourne le numérateur de la fraction.
   * @return le numérateur
   */
  public BigInteger getNumerator() {

    return numerator ;
  }

  /**
   * Retourne le dénominateur de la fraction.
   * @return le dénominateur
   */
  public BigInteger getDenominator() {

    return denominateur;
  }

  /**
   * Retourne la valeur de la fraction en nombre à virgule flottante.
   * @return la valeur de la fraction
   */
  public double doubleValue() {

    return 0.0;
  }

  /**
   * Retourne une fraction somme de la fraction courante et du paramètre.
   * @param aFraction la fraction à ajouter
   * @return la fraction somme
   */
  public Fraction add(Fraction aFraction) {

    a = (this.numerator.multiply(aFraction.numerator) ) - (this.denominateur.multiply(aFraction.denominateur));
    b = this.denominateur.multiply(aFraction.denominateur);

    return new Fraction(a,b);
  }

  /**
   * Retourn respectivement un nombre négatif, nul ou positif si l'objet courant est plus petit, égal ou plus grand que l'argument.
   * @param aFraction la fraction à comparer
   * @return un nombre négatif, nul ou positif
   */
  @Override
  public int compareTo(Fraction aFraction) {
    return 0;
  }
}

public String toString(){
  return "" + numerator + "/" + denominateur;
}