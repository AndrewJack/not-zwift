package uk.andrewjack.notzwift.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import uk.andrewjack.notzwift.MainActivity
import uk.andrewjack.notzwift.services.Trainer
import uk.andrewjack.notzwift.services.WahooTrainer

@InstallIn(MainActivity::class)
@Module
abstract class TrainerModule {
    @Binds
    abstract fun bindTrainerService(impl: WahooTrainer): Trainer
}