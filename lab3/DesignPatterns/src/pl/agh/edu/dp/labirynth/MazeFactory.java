package pl.agh.edu.dp.labirynth;

public class MazeFactory {

    private static MazeFactory instance;

    public static MazeFactory getInstance() {
        if (instance == null) instance = new MazeFactory();
        return instance;
    }

    public Door createDoor(Room room1, Room room2) {
        return new Door(room1, room2);
    }

    public Room createRoom(Vector2D position) {
        return new Room(position);
    }

    public Wall createWall() {
        return new Wall();
    }
}
