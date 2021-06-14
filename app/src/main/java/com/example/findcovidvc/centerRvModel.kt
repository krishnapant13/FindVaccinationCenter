package com.example.findcovidvc

data class centerRvModel (
    val centerName: String,
    val centerAdress: String,
    val centerFromTime: String,
    val centerToTime : String,
    val fee_Type: String,
    val ageLimit:Int,
    val vaccineName:String,
    val availableCapacity :Int
)
