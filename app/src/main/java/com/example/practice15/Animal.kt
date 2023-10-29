package com.example.practice15

import android.os.Parcel
import android.os.Parcelable

class Animal() : Parcelable {

    private var breed : String = ""
    private var year : Int = 0
    private var mounth : Int = 0

    constructor(parcel: Parcel) : this() {
        breed = parcel.readString().toString()
        year = parcel.readInt()
        mounth = parcel.readInt()

    }

    companion object CREATOR : Parcelable.Creator<Animal> {
        override fun createFromParcel(parcel: Parcel): Animal {
            return Animal(parcel)
        }

        override fun newArray(size: Int): Array<Animal?> {
            return arrayOfNulls(size)
        }

    }
    constructor(_breed: String, _year: Int, _mounth: Int) : this(){
        breed = _breed
        year = _year
        mounth = _mounth
    }

    fun setBreed(_breed: String){
        breed = _breed
    }

    fun getBreed() : String{
        return breed
    }

    fun setYear(_year: Int){
        year = _year
    }

    fun getYear() : Int{
        return year
    }

    fun setMounth(_mounth: Int){
        mounth = _mounth
    }

    fun getMounth() : Int{
        return mounth
    }
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(breed)
        parcel.writeInt(year)
        parcel.writeInt(mounth)
    }

    override fun describeContents(): Int {
        return 0
    }

}