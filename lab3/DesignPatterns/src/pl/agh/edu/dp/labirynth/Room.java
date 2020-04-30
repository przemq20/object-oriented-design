package pl.agh.edu.dp.labirynth;

import java.util.EnumMap;
import java.util.Map;

public class Room extends MapSite
{
    private Map<Direction, MapSite> sides;
    private Vector2D position;

    Room(Vector2D position) {
        this.sides = new EnumMap<>(Direction.class);
        this.position = position;
    }

    Vector2D getPosition(){
        return position;
    }

    MapSite getSide(Direction direction){
        return this.sides.get(direction);
    }

    void setSide(Direction direction, MapSite ms){
        this.sides.put(direction, ms);
    }

    @Override
    public void Enter(){

    }
}
