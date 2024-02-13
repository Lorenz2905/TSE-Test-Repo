package org.calculator

import kotlin.math.sqrt

/**
 * Die Calculator-Klasse repräsentiert eine einfache Klasse zur Durchführung
 * arithmetischer Operationen und zum Verwalten von zwei Werten.
 */
class Calculator {
    /**
     * Konstruktor für die Calculator-Klasse.
     */
    init {
    }

    /**
     * Addiert zwei ganze Zahlen.
     *
     * @param a Die erste ganze Zahl.
     * @param b Die zweite ganze Zahl.
     * @return Die Summe der beiden ganzen Zahlen.
     */
    fun add(a: Int, b: Int): Int {
        return a + b // Gibt einfach die Summe von a und b zurück
    }

    /**
     * Subtrahiert die zweite ganze Zahl von der ersten.
     *
     * @param a Die erste ganze Zahl.
     * @param b Die zweite ganze Zahl.
     * @return Das Ergebnis der Subtraktion.
     */
    fun sub(a: Int, b: Int): Int {
        return a - b
    }

    /**
     * Multipliziert die Variablen a und b.
     *
     * @param a Der erste Wert.
     * @param b Der zweite Wert.
     * @return Das Ergebnis der Multiplikation.
     */
    fun pro(a: Float, b: Float): Float {
        return a * b
    }

    /**
     * Teilt den ersten Wert durch den zweiten Wert.
     *
     * @param a Der Dividend.
     * @param b Der Divisor.
     * @return Das Ergebnis der Division.
     * @throws ArithmeticException, wenn der Divisor Null ist.
     */
    fun div(a: Float, b: Float): Float {
        if (b == 0f) {
            throw ArithmeticException("Kann nicht durch Null teilen")
        }
        return a / b
    }

    /**
     * Berechnet die Quadratwurzel einer Zahl.
     *
     * @param a Die Zahl, für die die Quadratwurzel berechnet wird.
     * @return Die Quadratwurzel der Zahl.
     */
    private fun sqrt(a: Float): Float {
        return sqrt(a)
    }
}

