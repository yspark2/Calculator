package com.example.calculator

class SubstractOperation() : AbstractOperation(){
    override fun operation(x:Double, y:Double) : Double{
        var result = x.minus(y)
        return result
    }
}