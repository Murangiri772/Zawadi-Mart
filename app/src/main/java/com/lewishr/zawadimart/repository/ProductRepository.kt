package com.lewishr.zawadimart.repository

import android.content.Context
import com.lewishr.zawadimart.data.ProductDatabase
import com.lewishr.zawadimart.model.Product

class ProductRepository(context: Context) {
    private val productDao = ProductDatabase.getDatabase(context).productDao()

    suspend fun insertProduct(product: Product) {
        productDao.insertProduct(product)
    }

    fun getAllProducts() = productDao.getAllProducts()

    suspend fun deleteProduct(product: Product) = productDao.deleteProduct(product)
}