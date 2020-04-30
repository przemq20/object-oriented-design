package pl.agh.edu.dp.labirynth;

public class MazeGame {
    public Maze createMaze(MazeFactory mazeFactory, CountingMazeBuilder countingMazeBuilder) {
        Maze maze = new Maze();

        Room room1 = mazeFactory.createRoom(new Vector2D(1, 2));
        Room room2 = new Room(new Vector2D(2, 2));

        countingMazeBuilder.addRoom(room1);
        countingMazeBuilder.addRoom(room2);
        countingMazeBuilder.createWall(Direction.South, room1, room2);
        countingMazeBuilder.createDoor(room1, room2);

        return countingMazeBuilder.getCurrentMaze();
    }
}
