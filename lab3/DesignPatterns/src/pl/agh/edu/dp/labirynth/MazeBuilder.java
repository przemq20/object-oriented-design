package pl.agh.edu.dp.labirynth;

public interface MazeBuilder {
    void addRoom(Room room);
    void createDoor(Room r1, Room r2) throws Exception;
    void createWall(Direction firstRoomDir, Room r1, Room r2);
}
