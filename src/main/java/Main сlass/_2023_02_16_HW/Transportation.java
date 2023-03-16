package _2023_02_16_HW;

public enum Transportation {
    САМОЛЕТ(1.5),
    ПОЕЗД(4),
    АВТО(6),
    ВЕЛОСИПЕД(8),
    ПЕШКОМ(24);

    private final double durationInHours;

    Transportation(double durationInHours) {
        this.durationInHours = durationInHours;
    }

    public double getDurationInHours() {
        return durationInHours;
    }

    public double getDurationInDays() {
        return durationInHours / 24;
    }

    public double getDurationInMinutes() {
        return durationInHours * 60;
    }

    public double getDurationInSeconds() {
        return durationInHours * 60 * 60;
    }
}
