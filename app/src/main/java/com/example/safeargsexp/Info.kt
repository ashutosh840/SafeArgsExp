package com.example.safeargsexp

import android.os.Parcel
import android.os.ParcelFileDescriptor
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Info(

   val Name: String?,
   val Message:String,
   val Number:Int
):Parcelable