package app

import annotations.NotBlank
import data.CreateCategoryRequest
import data.CreateProductRequest
import exception.ValidationException
import kotlin.reflect.full.findAnnotations
import kotlin.reflect.full.memberProperties


fun validationRequest(request: Any){
    val clazz = request::class
    val properties = clazz.memberProperties

    //iterate
    for (property in properties){
        if (property.findAnnotations<NotBlank>() != null){
            val value = property.call(request)

            when(value){
                is String -> {
                    if ("" == value){
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }

        }
    }
}

fun main() {
    val request = CreateProductRequest("1", "anjay", 2000)
    validationRequest(request)

    val request2 = CreateCategoryRequest("10", "Food")
    validationRequest(request2)
}