package uk.andrewjack.notzwift.services

interface Trainer {
    fun findDevices()
    fun connect(id: String)
    fun listen()
    fun disconnect()
}
