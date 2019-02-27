package com.sc.sport.round;

import com.sc.sport.championship.Championship;

import java.util.Set;

public interface Rounds<T, E> {

    public Set<T> getRounds(Championship<E> championship);
    public T getRoundsByRound(int round, Championship<T> championship);

}
