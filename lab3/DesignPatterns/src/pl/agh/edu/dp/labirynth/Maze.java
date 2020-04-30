package pl.agh.edu.dp.labirynth;

import java.util.Optional;
import java.util.Vector;

public class Maze {
    private Vector<Room> rooms;

    Maze() {
        this.rooms = new Vector<Room>();
    }

    void addRoom(Room room) {
        rooms.add(room);
    }

    public void setRooms(Vector<Room> rooms) {
        this.rooms = rooms;
    }

    public int getRoomNumbers() {
        return rooms.size();
    }

    public Room findRoom(Vector2D pos) {
        Optional<Room> foundRoom = rooms.stream().filter(room -> room.getPosition().equals(pos)).findAny();
        if (foundRoom.isPresent()) {
            return foundRoom.get();
        } else return null;
    }
}
