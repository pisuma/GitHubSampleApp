package com.example.githubsampleapp.ui.main
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val id = ObservableField<String>()
    val repoUrl = ObservableField<String>()
    val loading = ObservableField<Boolean>()
    val nameEdit = ObservableField<String>()

}