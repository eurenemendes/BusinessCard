package br.com.rene.businesscard

import android.app.Application
import br.com.rene.businesscard.data.AppDatabase
import br.com.rene.businesscard.data.BusinessCardRepository

class App : Application(){

    val database by lazy { AppDatabase.getDatabase(this)}
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}