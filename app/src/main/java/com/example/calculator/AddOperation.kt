package com.example.calculator

class AddOperation() : AbstractOperation() {
    override fun operation(x:Double, y:Double): Double {
        var result = x.plus(y)
        return result
    }
}