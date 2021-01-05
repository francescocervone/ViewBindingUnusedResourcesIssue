package com.example.viewbindingunusedresourcesissue

import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

fun interface ActivityViewBindingFactory<T : ViewBinding> {
    fun create(inflater: LayoutInflater): T
}

fun <T : ViewBinding> AppCompatActivity.viewBinding(viewBindingFactory: ActivityViewBindingFactory<T>): Lazy<T> =
    lazy { viewBindingFactory.create(layoutInflater) }