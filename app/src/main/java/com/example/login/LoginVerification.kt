package com.example.login

class LoginVerification{
    fun verify(email: String, password: String, phone: String): Boolean{
        return email == "test@globomantics.com" &&
                password == "test123" &&
                phone == "1234567890"
    }
}