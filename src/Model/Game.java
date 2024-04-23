package Model;

import java.util.*;
import Enums.GameState;

public class Game {
    Board board;
    List<Player> playerList;
    int nextPlayerMoveIndex;
    GameState gameState;
    List<Move> moveList;
    Player winner;
}
