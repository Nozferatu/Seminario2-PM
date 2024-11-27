package com.cmj.seminario2_pm

fun main(){
    print("Elige el ejercicio a probar (1-22): ")

    var opcion = readln().toInt()

    when(opcion){
        1 -> {
            var planeta1 = Planeta("Tierra", "lmao", 100F)
            println(planeta1)

            var planeta2 = Planeta()
            println(planeta2)

            var sistemaSolar = SistemaSolar(mutableListOf(planeta1, planeta2))
            println("Planeta con mayor masa: ${sistemaSolar.planetaMayor()}")

            println("Masa media de todos los planetas: ${sistemaSolar.masaMedia()}")
        }

        2 -> {
            var triangulo = Triangulo(13.0, 12.0, 5.0, "equilátero")

            println(triangulo)
            println(triangulo.rectangulo())
        }

        3 -> {
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

        4 -> {
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

        5 -> {
            var listaProductos: MutableList<Producto> = mutableListOf()
            var input: String
            var opcion: Int

            println("-------- Lista de Productos fachera V1 --------")
            while(true){
                println("\n1. Anadir producto\n2. Actualizar stock producto\n3. Mostrar inventario\n4. Salir")

                print("Elige una opcion: ")
                input = readln()

                if(input.all { it.isDigit() }){
                    opcion = input.toInt()

                    when(opcion){
                        1 -> {
                            input = ""

                            var nombre = ""
                            var precio = 0F
                            var stock: Int = -1

                            print("Nombre del producto: ")
                            while(nombre.isBlank()){
                                nombre = readln()
                            }

                            print("Precio del producto: ")
                            while(precio <= 0){
                                input = readln()

                                if(input.isNotBlank() && input.all { it.isDigit() }){
                                    precio = input.toFloat()
                                }
                            }

                            print("Stock del producto: ")
                            while(stock < 0){
                                input = readln()

                                if(input.isNotBlank() && input.all { it.isDigit() }){
                                    stock = input.toInt()
                                }
                            }

                            listaProductos.add(Producto(nombre, precio, stock))
                            println("Producto anadido")
                        }
                        2 -> {
                            if(listaProductos.isNotEmpty()){
                                for(i in listaProductos.indices){
                                    println("${i + 1}. ${listaProductos[i]}")
                                }

                                print("\nElige el producto a actualizar: ")
                                while(true){
                                    input = readln()

                                    if(input.all { it.isDigit() }){
                                        opcion = input.toInt()

                                        if(listaProductos.getOrNull(opcion - 1) != null){
                                            var productoSeleccionado = listaProductos[opcion - 1]

                                            var nuevoStock = -1

                                            print("Introduce el nuevo stock: ")
                                            while(nuevoStock < 0){
                                                input = readln()

                                                if(input.isNotBlank() && input.all { it.isDigit() }){
                                                    nuevoStock = input.toInt()

                                                    productoSeleccionado.cantidadStock = nuevoStock

                                                    println("Stock actualizado.")
                                                }
                                            }

                                            break
                                        }else println("Seleccion invalida.")
                                    }
                                }
                            }else println("No hay productos anadidos.")
                        }
                        3 -> {
                            if(listaProductos.isNotEmpty()){
                                for(i in listaProductos.indices){
                                    println("${i + 1}. ${listaProductos[i]}")
                                }
                            }else println("No hay productos anadidos.")
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

        6 -> {
            var planetasSistemaSolar = SistemaSolar(mutableListOf(
                Planeta("Mercurio", "Rocoso", 0f),
                Planeta("Venus", "Rocoso", 0f),
                Planeta("Tierra", "Rocoso", 0f),
                Planeta("Marte", "Rocoso", 0f),
                Planeta("Júpiter", "Gaseoso", 0f),
                Planeta("Saturno", "Gaseoso", 0f),
                Planeta("Urano", "Gaseoso", 0f),
                Planeta("Neptuno", "Gaseoso", 0f)
            ))
        }

        7 -> {
            var planetasSistemaSolar = SistemaSolar(mutableListOf(
                Planeta("Mercurio", "Rocoso", 0f),
                Planeta("Venus", "Rocoso", 0f),
                Planeta("Tierra", "Rocoso", 0f),
                Planeta("Marte", "Rocoso", 0f),
                Planeta("Júpiter", "Gaseoso", 0f),
                Planeta("Saturno", "Gaseoso", 0f),
                Planeta("Urano", "Gaseoso", 0f),
                Planeta("Neptuno", "Gaseoso", 0f)
            ))

            planetasSistemaSolar.planetas.forEach{ planeta ->
                println(planeta)
            }
        }

        8 -> {
            var planetasSistemaSolar = SistemaSolar(mutableListOf(
                Planeta("Mercurio", "Rocoso", 0f),
                Planeta("Venus", "Rocoso", 0f),
                Planeta("Tierra", "Rocoso", 0f),
                Planeta("Marte", "Rocoso", 0f),
                Planeta("Júpiter", "Gaseoso", 0f),
                Planeta("Saturno", "Gaseoso", 0f),
                Planeta("Urano", "Gaseoso", 0f),
                Planeta("Neptuno", "Gaseoso", 0f)
            ))

            planetasSistemaSolar.planetas.forEach { planeta ->
                if(planeta.nombre.startsWith("M")) println(planeta)
            }
        }

        9 -> {
            var planetasSistemaSolar = SistemaSolar(mutableListOf(
                Planeta("Mercurio", "Rocoso", 0f),
                Planeta("Venus", "Rocoso", 0f),
                Planeta("Tierra", "Rocoso", 1f),
                Planeta("Marte", "Rocoso", 0f),
                Planeta("Júpiter", "Gaseoso", 25f),
                Planeta("Saturno", "Gaseoso", 20f),
                Planeta("Urano", "Gaseoso", 0f),
                Planeta("Neptuno", "Gaseoso", 0f)
            ))

            var tierra = planetasSistemaSolar.planetas[2]
            planetasSistemaSolar.planetas.forEach{ planeta ->
                if(planeta.masa > tierra.masa * 20f) println(planeta)
            }
        }

        10 -> {
            var planetasSistemaSolar = SistemaSolar(mutableListOf(
                Planeta("Mercurio", "Rocoso", 0f),
                Planeta("Venus", "Rocoso", 0f),
                Planeta("Tierra", "Rocoso", 1f),
                Planeta("Marte", "Rocoso", 0f),
                Planeta("Júpiter", "Gaseoso", 25f),
                Planeta("Saturno", "Gaseoso", 20f),
                Planeta("Urano", "Gaseoso", 0f),
                Planeta("Neptuno", "Gaseoso", 0f)
            ))

            println(planetasSistemaSolar.masaMedia())
        }

        11 -> {
            println("A")
        }

        12 -> {
            var listaEquiposFutbol: MutableList<EquipoFutbol> = mutableListOf(
                EquipoFutbol("Atlético", "España"),
                EquipoFutbol("Celta", "España"),
                EquipoFutbol("Betis", "España"),
                EquipoFutbol("Real Madrid", "España"),
                EquipoFutbol("Manchester City", "Inglaterra"),
                EquipoFutbol("Chelsea", "Inglaterra"),
                EquipoFutbol("Liverpool", "Inglaterra"),
                EquipoFutbol("Arsenal", "Inglaterra"),
                EquipoFutbol("Juventus", "Italia"),
                EquipoFutbol("Atalanta", "Italia"),
                EquipoFutbol("Inter", "Italia"),
                EquipoFutbol("Pyunik", "Armenia"),
                EquipoFutbol("Al-Nassr", "Arabia Saudita"),
                EquipoFutbol("Al-Hilal SFC", "Arabia Saudita"),
                EquipoFutbol("B. Dortmund", "Alemania"),
                EquipoFutbol("Bayern München", "Alemania")
            )
        }

        16 -> {
            val mates = Matematicas()

            println(mates.sumar(4, 5))
            println(mates.restar(4, 5))
            println(mates.multiplicar(4, 5))
            println(mates.dividir(4f, 5f))
        }
    }
}