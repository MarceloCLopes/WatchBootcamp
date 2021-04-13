package com.mcl.watchbootcamp

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.mcl.shared.Meal
import java.io.BufferedReader
import java.io.InputStreamReader

object MealStore {

    fun fetchMeals(context: Context): MutableList<Meal> {
        val stream = context.resources.openRawResource(R.raw.meals)
        val reader = BufferedReader(InputStreamReader(stream, "UTF-8"))
        val listType = object : TypeToken<ArrayList<Meal>>() {}.type
        return Gson().fromJson(reader, listType)
    }
}