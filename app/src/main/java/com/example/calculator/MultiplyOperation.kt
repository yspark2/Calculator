package com.example.calculator

class MultiplyOperation() : AbstractOperation(){
    override fun operation(x:Double, y:Double) : Double{
        var result = x.times(y)
        return result
    }
}