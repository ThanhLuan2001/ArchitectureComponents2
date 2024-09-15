package com.learn.english.architecture_components.lifecycle

import android.content.Context
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyObserver (val context: Context,val lifecycle: Lifecycle) : LifecycleObserver{
    val TAG = "MyObserver"

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(){
        Log.e(TAG,"ON_CREATE")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart(){
        Log.e(TAG,"ON_START")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume(){
        Log.e(TAG,"ON_RESUME")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause(){
        Log.e(TAG,"ON_PAUSE")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop(){
        Log.e(TAG,"ON_STOP")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy(){
        Log.e(TAG,"ON_DESTROY")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun onAny(){
        Log.e(TAG,"ON_ANY")
    }
}