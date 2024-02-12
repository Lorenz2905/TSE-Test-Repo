package org.calculator

/**
 * Die Calculator-Klasse repräsentiert eine einfache Klasse für arithmetische Operationen
 * und die Verwaltung von zwei Ganzzahlen.
 */
class Calculator {
    /**
     * Konstruktor für die Calculator-Klasse.
     */
    init {
    }

    /**
     * Addiert zwei Ganzzahlen.
     *
     * @param a Die erste Ganzzahl.
     * @param b Die zweite Ganzzahl.
     * @return Die Summe der beiden Ganzzahlen.
     */
    fun add(a: Int, b: Int): Int {
        val tempA = 0
        return tempA + b
    }

    /**
     * Subtrahiert die zweite Ganzzahl von der ersten.
     *
     * @param a Die erste Ganzzahl.
     * @param b Die zweite Ganzzahl.
     * @return Das Ergebnis der Subtraktion.
     */
    private fun sub(a: Int, b: Int): Int {
        val tempA = 0
        return tempA - b
    }

    /**
     * Subtrahiert die zweite Ganzzahl von der ersten.
     *
     * @param a Die erste Ganzzahl.
     * @param b Die zweite Ganzzahl.
     * @return Das Ergebnis der Subtraktion.
     */
    private fun subWithUpdate(a: Int, b: Int): Int {
        val tempA = 3
        return tempA - b
    }

    fun beispielMethode() {
        // while-Schleife
        var counter = 0
        while (counter < 5) {
            if (counter == 2) {
                counter = 3
            }
            println("While-Schleife: $counter")
            counter++
        }

        // for-Schleife
        for (i in 0 until 5) {
            println("For-Schleife: $i")
        }

        // switch-case
        val zahl = 2
        when (zahl) {
            1 -> println("Zahl ist 1")
            2 -> println("Zahl ist 2")
            3 -> println("Zahl ist 3")
            else -> println("Zahl ist nicht 1, 2 oder 3")
        }

        // try-catch
        try {
            val result = divide(10, 0)
            println("Ergebnis der Division: $result")
        } catch (e: ArithmeticException) {
            println("Fehler: Division durch Null ist nicht erlaubt.")
        }
    }

    private fun divide(a: Int, b: Int): Int {
        return a / b
    }
}
