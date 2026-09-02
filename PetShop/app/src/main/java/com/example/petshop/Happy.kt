package com.example.petshop

class Happy(date: String): Mood(date) {
    override fun currMood(): String {
        return "Happy"
    }
}