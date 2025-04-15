package com.lewishr.zawadimart.repository

import com.lewishr.zawadimart.data.UserDao
import com.lewishr.zawadimart.model.User

class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}