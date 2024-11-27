package com.cmj.seminario2_pm.ejercicio3

fun main(){
    var listaContactos: MutableList<Contacto> = mutableListOf()
    var input: String
    var opcion: Int

    println("-------- Agenda de Contactos fachera V1 --------")
    while(true){
        println("\n1. Anadir contacto\n2. Eliminar contacto\n3. Mostrar contactos\n4. Salir")

        print("Elige una opcion: ")
        input = readln()

        if(input.all { it.isDigit() }){
            opcion = input.toInt()

            when(opcion){
                1 -> {
                    input = ""

                    var nombre: String = ""
                    var telefono: Int = -1
                    var email: String = ""

                    print("Nombre del contacto: ")
                    while(nombre.isBlank()){
                        nombre = readln()
                    }

                    print("Telefono del contacto: ")
                    while(telefono == -1){
                        input = readln()

                        if(input.isNotBlank() && input.all { it.isDigit() }){
                            telefono = input.toInt()
                        }
                    }

                    print("Email del contacto: ")
                    while(email.isBlank()){
                        email = readln()
                    }

                    listaContactos.add(Contacto(nombre, telefono, email))
                }
                2 -> {
                    if(listaContactos.isNotEmpty()){
                        for(i in listaContactos.indices){
                            println("${i + 1}. ${listaContactos[i].nombre}")
                        }

                        print("\nElige el contacto a eliminar: ")
                        while(true){
                            input = readln()

                            if(input.all { it.isDigit() }){
                                opcion = input.toInt()

                                if(listaContactos.getOrNull(opcion - 1) != null){
                                    listaContactos.removeAt(opcion - 1)

                                    println("Contacto eliminado.")
                                    break
                                }else println("Seleccion invalida.")
                            }
                        }
                    }else println("No hay contactos anadidos.")
                }
                3 -> {
                    if(listaContactos.isNotEmpty()){
                        for(contacto in listaContactos){
                            println(contacto)
                        }
                    }else println("No hay contactos anadidos.")
                }
                4 -> break
                else -> println("Opcion invalida.")
            }
        }else{
            println("Opcion invalida.")
        }
    }

    println("Ejecucion finalizada.")
}