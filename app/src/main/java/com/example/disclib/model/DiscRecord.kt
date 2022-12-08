package com.example.disclib.model

import java.time.LocalDateTime

class DiscRecord(val movieIndex: Int,
                 val discId: String,
                 val movieName: String,
                 var updated: LocalDateTime? = null) {
    init {
        if (movieIndex < 0) {
            throw IllegalArgumentException()
        }
        if (discId.isBlank()) {
            throw IllegalArgumentException()
        }
        if (movieName.isBlank()) {
            throw IllegalArgumentException()
        }
        if (updated == null) {
            updated = LocalDateTime.now()
        }
    }
}