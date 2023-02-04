package com.example.shift.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BinInfoDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBin (bin: BinDbModal)

    @Query("SELECT * FROM bin_item ORDER BY bin")
    fun binList () : Flow<List<BinDbModal>>
}