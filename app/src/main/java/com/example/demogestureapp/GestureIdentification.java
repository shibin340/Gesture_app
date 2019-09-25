package com.example.demogestureapp;

import android.view.GestureDetector;
import android.view.MotionEvent;

public class GestureIdentification implements GestureDetector.OnGestureListener {

    public static final int SWIPE_THRESHOLD = 100;
    public static final int VELOCITY_THRESHOLD = 100;
    private MainActivity activity=null;
    public MainActivity getActivity()
    {
        return  activity;
    }
    public void setActivity(MainActivity activity)
    {
        this.activity=activity;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent downEvent, MotionEvent moveEvent, float velocityX, float velocityY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onFling(MotionEvent downEvent, MotionEvent moveEvent, float velocityX, float velocityY) {
        boolean result=false;
        float diffY=moveEvent.getY()-downEvent.getY();
        float diffX=moveEvent.getX()-downEvent.getX();
        if(Math.abs(diffX)>Math.abs(diffY))
        {
            if(Math.abs(diffX)> SWIPE_THRESHOLD && Math.abs(velocityX)> VELOCITY_THRESHOLD)
            {
                if(diffX >0)
                    activity.swipeRight();
                else
                    activity.swipeLeft();

                result=true;
            }

        }
        else
        {
            if(Math.abs(diffY)> SWIPE_THRESHOLD && Math.abs(velocityY)> VELOCITY_THRESHOLD)
            {
                if(diffY >0)
                    activity.swipeUp();
                else
                    activity.swipeDown();

                result=true;
            }

        }
        return result;
    }
}