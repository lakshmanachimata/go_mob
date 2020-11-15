package com.nearhop.nhgoif.gocom

import java.lang.IllegalArgumentException
import NHLibGO.NHLibGO;

class GOInterface {
     fun getNumtoString (number : Int): String{
        try {
            var numberString = NHLibGO.convert(number.toLong())
            return numberString;
        }catch (e : IllegalArgumentException){
            return "Invalid Arguement"
        }catch (e : Exception){
            return "Invalid Arguement"
        }
        return ""
    }
}