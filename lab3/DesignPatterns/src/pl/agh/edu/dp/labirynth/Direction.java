package pl.agh.edu.dp.labirynth;

public enum Direction {
    North, South, East, West;

    public Direction opposite() {
        switch (this){
            case North:
                return South;
            case South:
                return North;
            case East:
                return West;
            case West:
                return East;
            default:
                return null;
        }
    }
    public Direction next() {
        switch (this){
            case North:
                return East;
            case South:
                return West;
            case East:
                return South;
            case West:
                return North;
            default:
                return null;
        }
    }
    public Direction previous() {
        switch (this){
            case North:
                return West;
            case South:
                return East;
            case East:
                return North;
            case West:
                return South;
            default:
                return null;
        }
    }
}