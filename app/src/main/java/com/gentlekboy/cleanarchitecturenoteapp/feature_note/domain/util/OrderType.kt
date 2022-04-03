package com.gentlekboy.cleanarchitecturenoteapp.feature_note.domain.util

/**
 * Sealed class for determining ordering by [Ascending] or [Descending]
 */
sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}
