package pl.agh.edu.dp.labirynth;

public class Vector2D {
    private final int x;
    private final int y;

    Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public Vector2D next(Direction dir) {
        switch (dir) {
            case South:
                return new Vector2D(this.x, this.y - 1);
            case East:
                return new Vector2D(this.x + 1, this.y);
            case West:
                return new Vector2D(this.x - 1, this.y);
            case North:
                return new Vector2D(this.x, this.y + 1);
        }
        throw new NullPointerException("Pos doesnt exist");
    }

    public Vector2D upperRight(Vector2D other) {
        return new Vector2D(Math.max(this.x, other.x), Math.max(this.y, other.y));
    }
}
