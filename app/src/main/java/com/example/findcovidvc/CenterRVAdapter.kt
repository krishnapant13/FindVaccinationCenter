package com.example.findcovidvc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CenterRVAdapter (private  val centerList:List<centerRvModel>): RecyclerView.Adapter<CenterRVAdapter.CenterRVViewHolder>(){

    class CenterRVViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val centerNameTV : TextView  = itemView.findViewById(R.id.idTVCenterName)
        val centerAddress : TextView  = itemView.findViewById(R.id.idTVCenterAddress)
        val centerTimeTV : TextView  = itemView.findViewById(R.id.idTVCenterTimings)
        val vaccineNameTV : TextView  = itemView.findViewById(R.id.idTVVaccineName)
        val vaccineFeesTV : TextView  = itemView.findViewById(R.id.idTVFeeType)
        val ageLimitTV : TextView = itemView.findViewById(R.id.idTVAgeLimit)
        val availabilityTV : TextView = itemView.findViewById(R.id.idTVAvaliablity)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CenterRVViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.center_rv_item,parent,false)
        return CenterRVViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return centerList.size



    }

    override fun onBindViewHolder(holder: CenterRVViewHolder, position: Int) {
        val center = centerList[position]
        holder.centerNameTV.text = center.centerName
        holder.centerAddress.text = center.centerAdress
        holder.centerTimeTV.text = ("from :"+center.centerFromTime+" To:"+center.centerToTime)
        holder.vaccineNameTV.text = center.vaccineName
        holder.vaccineFeesTV.text = center.fee_Type
        holder.ageLimitTV.text = ("Age Limit: "+ center.ageLimit.toString())
        holder.availabilityTV.text = ("Availability : "+ center.availableCapacity.toString())

    }

}