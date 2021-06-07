package com.avijitmondal.awake;

public class MousePointer {
    private float x;
    private float y;

    public MousePointer(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "MousePointer{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
