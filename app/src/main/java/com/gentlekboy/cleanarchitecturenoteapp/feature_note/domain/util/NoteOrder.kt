package com.gentlekboy.cleanarchitecturenoteapp.feature_note.domain.util

/**
 * Sealed class for determining ordering by [Title], [Date] or [Colour]
 */
sealed class NoteOrder(val orderType: OrderType) {
    class Title(orderType: OrderType) : NoteOrder(orderType)
    class Date(orderType: OrderType) : NoteOrder(orderType)
    class Colour(orderType: OrderType) : NoteOrder(orderType)

    fun copy(orderType: OrderType): NoteOrder {
        return when (this) {
            is Title -> Title(orderType)
            is Date -> Date(orderType)
            is Colour -> Colour(orderType)
        }
    }
}
