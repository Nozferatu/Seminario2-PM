package com.cmj.seminario2_pm.ejercicio5

fun main(){
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