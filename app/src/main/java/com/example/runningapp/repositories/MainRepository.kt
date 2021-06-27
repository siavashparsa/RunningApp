package com.example.runningapp.repositories

import com.example.runningapp.db.Run
import com.example.runningapp.db.RunDao
import javax.inject.Inject

class MainRepository @Inject constructor(

    val runDao: RunDao

){

    suspend fun insertRun(run:Run) = runDao.insertRun(run)

    suspend fun deleteRun(run:Run) = runDao.deleteRun(run)

    fun getAllRunSortedByDate() = runDao.getAllRunsSortedByDate()

    fun getAllRunsSortedByAvgDistance() = runDao.getAllRunsSortedByAvgDistance()

    fun getAllRunsSortedByTimesInMillis() = runDao.getAllRunsSortedByTimesInMillis()

    fun getAllRunsSortedByAvgSpeed() = runDao.getAllRunsSortedByAvgSpeed()

    fun getAllRunsSortedByCaloriesBurned() = runDao.getAllRunsSortedByCaloriesBurned()

    fun getTotalAvgSpeed() = runDao.getTotalAvgSpeed()

    fun getTotalDistance() = runDao.getTotalDistance()

    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()

    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()



}