package br.com.rmbrito

import br.com.rmbrito.classes.Document
import br.com.rmbrito.classes.Person

fun main() {
    val regiane = Person (
        name = "Regiane",
        age = 33
    )
    regiane.toSpeak()

    val document = Document (
        rg = "42.960.244-3",
        cpf = "161.724.600-05"
    )

    println(regiane)
    println(document)

    /** Copying **/
    val newDocument = document.copy(cpf = "834.334.440-56")
    println("Documento copied: $newDocument")

    /** Data classes and destructuring declarations **/
    val (cpf, rg) = document
    println("CPF: $cpf, RG: $rg")

}