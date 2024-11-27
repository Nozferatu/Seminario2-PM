package com.cmj.seminario2_pm.ejercicio4

fun main(){
    var listaEstudiantes: MutableList<Estudiante> = mutableListOf()
    var input: String
    var opcion: Int

    println("-------- Lista de Estudiantes fachera V1 --------")
    while(true){
        println("\n1. Anadir estudiante\n2. Mostrar info estudiante\n3. Calcular promedio calificaciones\n4. Salir")

        print("Elige una opcion: ")
        input = readln()

        if(input.all { it.isDigit() }){
            opcion = input.toInt()

            when(opcion){
                1 -> {
                    input = ""

                    var nombre: String = ""
                    var edad: Int = -1
                    var calificaciones: MutableList<Float> = mutableListOf()

                    print("Nombre del estudiante: ")
                    while(nombre.isBlank()){
                        nombre = readln()
                    }

                    print("Edad del estudiante: ")
                    while(edad <= 0){
                        input = readln()

                        if(input.isNotBlank() && input.all { it.isDigit() }){
                            edad = input.toInt()
                        }
                    }

                    print("Calificaciones del estudiante (-1 para terminar de introducir): ")
                    var calificacion = 0F
                    while(calificacion != -1F){
                        input = readln()

                        if(input.isNotBlank()){
                            calificacion = input.toFloat()
                            if(calificacion != -1F) calificaciones.add(calificacion)
                        }
                    }

                    listaEstudiantes.add(Estudiante(nombre, edad, calificaciones))
                    println("Estudiante añadido")
                }
                2 -> {
                    if(listaEstudiantes.isNotEmpty()){
                        for(i in listaEstudiantes.indices){
                            println("${i + 1}. ${listaEstudiantes[i]}")
                        }
                    }else println("No hay estudiantes anadidos.")
                }
                3 -> {
                    if(listaEstudiantes.isNotEmpty()){
                        var promedio = 0F

                        for(estudiante in listaEstudiantes) promedio += estudiante.calificaciones.sum()

                        promedio /= listaEstudiantes.size
                        println("Promedio de calificaciones entre los estudiantes: $promedio")
                    }else println("No hay estudiantes anadidos.")
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