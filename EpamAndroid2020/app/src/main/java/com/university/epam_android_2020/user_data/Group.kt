package com.university.epam_android_2020.user_data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Parcelize
data class Group(val name:String, val members: List<User?>) : Parcelable