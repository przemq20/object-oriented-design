package pl.agh.edu.dp.labirynth;

public class CountingMazeBuilder implements MazeBuilder {
    private int rooms;
    private int doors;
    private int walls;
    private Maze currentMaze;

    public CountingMazeBuilder() {
        this.rooms = 0;
        this.doors = 0;
        this.walls = 0;
        this.currentMaze = new Maze();
    }

    @Override
    public void addRoom(Room room) {
        rooms++;
        walls += 4;
    }

    @Override
    public void createDoor(Room r1, Room r2) {
        walls--;
        doors++;
    }

    @Override
    public void createWall(Direction firstRoomDir, Room r1, Room r2) {
        walls--;
    }

    public int getCounts() {
        return rooms + walls + doors;
    }

    public Maze getCurrentMaze() {
        return currentMaze;
    }
}
