package com.example.affirmation

import android.content.Context
import com.example.affirmation.adapter.ItemAdapter
import com.example.affirmation.data.Datasource
import com.example.affirmation.model.Affirmation
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationsAdapterTest {
    private val context = mock(Context::class.java)

    @Test
    fun adapter_size(){
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
        val itemAdapter = ItemAdapter(context, data)
        assertEquals("ItemAdapter is not the correct size", data.size, itemAdapter.itemCount)
    }
}