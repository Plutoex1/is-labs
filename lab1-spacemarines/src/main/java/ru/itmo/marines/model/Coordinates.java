package ru.itmo.marines.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.DecimalMin;

@Embeddable
public class Coordinates {

    @DecimalMin(value = "-634", inclusive = false, message = "Координата X должна быть больше -634")
    @Column(name = "coord_x", nullable = false)
    private double x;

    @DecimalMin(value = "-126", inclusive = false, message = "Координата Y должна быть больше -126")
    @Column(name = "coord_y", nullable = false)
    private float y;

    public Coordinates() {
    }

    public Coordinates(double x, float y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}