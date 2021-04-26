package com.openclassrooms.entrevoisins.events;

import com.openclassrooms.entrevoisins.model.Neighbour;

/**
 * Created by yanis on 26/04/2021.
 */
public class DetailNeighbourEvent {

    public Neighbour neighbour;

    public DetailNeighbourEvent(Neighbour neighbour) {
        this.neighbour = neighbour;
    }
}
