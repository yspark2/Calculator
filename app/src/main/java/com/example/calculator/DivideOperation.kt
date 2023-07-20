package com.example.calculator

class DivideOperation() : AbstractOperation(){
    override fun operation(x:Double, y:Double) : Double{
        var result = x.div(y)
        return result
    }
}