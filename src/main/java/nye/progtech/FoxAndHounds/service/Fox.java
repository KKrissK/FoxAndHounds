package nye.progtech.FoxAndHounds.service;

import java.io.Serializable;
import java.util.Vector;


public class Fox extends Movement implements Serializable, Cloneable {

    public Fox() {
        qValues = new double[CurrentState.NUM_STATES][4];
    }


    public synchronized double[] qValues(CurrentState state) {
        double[] result = new double[4];
        int stateIndex = state.toInt();
        Vector<CurrentState> neighbours = state.foxNeighbours(true);
        for (int resultPos = 0, qValuePos = 0; resultPos < 4; ++resultPos) {
            if (neighbours.elementAt(resultPos) == null) {
                result[resultPos] = 0;
            } else {
                result[resultPos] = qValues[stateIndex][qValuePos++];
            }
        }
        return result;
    }


    public CurrentState startGame() {
        return move(new CurrentState());
    }

    protected Vector<CurrentState> neighbours(CurrentState state) {
        return state.foxNeighbours(false);
    }



    public Object clone() {
        return super.clone();
    }
}
