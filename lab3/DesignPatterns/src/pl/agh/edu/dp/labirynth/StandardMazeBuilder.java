package pl.agh.edu.dp.labirynth;

public class StandardMazeBuilder implements MazeBuilder {
    private Maze currentMaze;

    public StandardMazeBuilder() {
        this.currentMaze = new Maze();
    }

    public Maze getCurrentMaze() {
        return currentMaze;
    }

    @Override
    public void addRoom(Room room) {
        room.setSide(Direction.North, new Wall());
        room.setSide(Direction.East, new Wall());
        room.setSide(Direction.South, new Wall());
        room.setSide(Direction.West, new Wall());
        currentMaze.addRoom(room);
    }

    @Override
    public void createDoor(Room room1, Room room2)  {
        Direction firstRoomDir = commonWall(room1, room2);
        Door door = new Door(room1, room2);
        room1.setSide(firstRoomDir, door);
        room2.setSide(firstRoomDir.opposite(), door);
    }

    @Override
    public void createWall(Direction firstRoomDir, Room room1, Room room2) {
        if (room1.getSide(firstRoomDir) == null)
            return;
        room2.setSide(firstRoomDir.opposite(), room1.getSide(firstRoomDir));
    }

    private Direction commonWall(Room room1, Room room2) {
        for (Direction direction : Direction.values()) {
            if (room1.getSide(direction).equals(room2.getSide(direction.opposite()))) {
                return direction;
            }
        }
        return null;
    }
}
