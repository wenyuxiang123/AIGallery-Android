package com.google.ai.edge.gallery.ui.common.chat;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "sensorManager", "Landroid/hardware/SensorManager;", "accelerometer", "Landroid/hardware/Sensor;", "currentRotation", "", "getCurrentRotation", "()I", "setCurrentRotation", "(I)V", "onResume", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onPause", "onSensorChanged", NotificationCompat.CATEGORY_EVENT, "Landroid/hardware/SensorEvent;", "onAccuracyChanged", "sensor", "accuracy", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
final class SensorObserver implements DefaultLifecycleObserver, SensorEventListener {
    private final Sensor accelerometer;
    private int currentRotation;
    private final SensorManager sensorManager;

    public SensorObserver(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        this.sensorManager = (SensorManager) systemService;
        this.accelerometer = this.sensorManager.getDefaultSensor(1);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner owner) {
        super.onCreate(owner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        super.onDestroy(owner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        super.onStart(owner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        super.onStop(owner);
    }

    public final int getCurrentRotation() {
        return this.currentRotation;
    }

    public final void setCurrentRotation(int i) {
        this.currentRotation = i;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        Sensor it = this.accelerometer;
        if (it != null) {
            this.sensorManager.registerListener(this, it, 3);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onPause(owner);
        this.sensorManager.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        Sensor sensor;
        int newOrientation = 0;
        if ((event == null || (sensor = event.sensor) == null || sensor.getType() != 1) ? false : true) {
            float x = event.values[0];
            float y = event.values[1];
            if (x < -7.0d) {
                newOrientation = 90;
            } else if (x > 7.0d) {
                newOrientation = -90;
            } else if (y < -7.0d) {
                newOrientation = 180;
            } else if (y <= 7.0d) {
                newOrientation = this.currentRotation;
            }
            if (newOrientation != this.currentRotation) {
                this.currentRotation = newOrientation;
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }
}
