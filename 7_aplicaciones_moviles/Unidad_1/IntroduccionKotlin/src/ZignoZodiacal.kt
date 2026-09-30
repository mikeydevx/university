fun main() {

    var mes: Int = 0
    var diaNumero: Int = 0

    print("Ingresa tu mes de nacimiento: ")
    mes = readln().toIntOrNull() ?: 0

    print("Ingresa tu dia de nacimiento: ")
    diaNumero = readln().toIntOrNull() ?: 0

    when (mes) {

        1 ->
            if (diaNumero >= 1 && diaNumero <= 19) {
                print("Capricornio")
            } else if (diaNumero >= 20 && diaNumero <= 31) {
                print("Acuario")
            } else {
                print("Dia no existente")
            }

        2 ->
            if (diaNumero >= 1 && diaNumero <= 18) {
                print("Acuario")
            } else if (diaNumero >= 19 && diaNumero <= 29) {
                print("Piscis")
            } else {
                print("Dia no existente")
            }

        3 ->
            if (diaNumero >= 1 && diaNumero <= 20) {
                print("Piscis")
            } else if (diaNumero >= 21 && diaNumero <= 31) {
                print("Aries")
            } else {
                print("Dia no existente")
            }

        4 ->
            if (diaNumero >= 1 && diaNumero <= 19) {
                print("Aries")
            } else if (diaNumero >= 20 && diaNumero <= 30) {
                print("Tauro")
            } else {
                print("Dia no existente")
            }

        5 ->
            if (diaNumero >= 1 && diaNumero <= 20) {
                print("Tauro")
            } else if (diaNumero >= 21 && diaNumero <= 31) {
                print("Geminis")
            } else {
                print("Dia no existente")
            }

        6 ->
            if (diaNumero >= 1 && diaNumero <= 20) {
                print("Geminis")
            } else if (diaNumero >= 21 && diaNumero <= 30) {
                print("Cancer")
            } else {
                print("Dia no existente")
            }

        7 ->
            if (diaNumero >= 1 && diaNumero <= 22) {
                print("Cancer")
            } else if (diaNumero >= 23 && diaNumero <= 31) {
                print("Leo")
            } else {
                print("Dia no existente")
            }

        8 ->
            if (diaNumero >= 1 && diaNumero <= 22) {
                print("Leo")
            } else if (diaNumero >= 23 && diaNumero <= 31) {
                print("Virgo")
            } else {
                print("Dia no existente")
            }

        9 ->
            if (diaNumero >= 1 && diaNumero <= 22) {
                print("Virgo")
            } else if (diaNumero >= 23 && diaNumero <= 30) {
                print("Libra")
            } else {
                print("Dia no existente")
            }

        10 ->
            if (diaNumero >= 1 && diaNumero <= 22) {
                print("Libra")
            } else if (diaNumero >= 23 && diaNumero <= 31) {
                print("Escorpio")
            } else {
                print("Dia no existente")
            }

        11 ->
            if (diaNumero >= 1 && diaNumero <= 21) {
                print("Escorpio")
            } else if (diaNumero >= 22 && diaNumero <= 30) {
                print("Sagitario")
            } else {
                print("Dia no existente")
            }

        12 ->
            if (diaNumero >= 1 && diaNumero <= 21) {
                print("Sagitario")
            } else if (diaNumero >= 22 && diaNumero <= 31) {
                print("Capricornio")
            } else {
                print("Dia no existente")
            }

        else -> println("Mes no existente")
    }
}