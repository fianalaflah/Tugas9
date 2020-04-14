package com.example.tugas9

class WordRepository(private val wordDao: WordDao) {
    val allWords = wordDao.getAlphabetizedWords()
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}