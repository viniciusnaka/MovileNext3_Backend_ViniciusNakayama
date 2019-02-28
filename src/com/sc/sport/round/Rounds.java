package com.sc.sport.round;

import com.sc.sport.championship.Championship;

public interface Rounds<T> {

    public T getRound(int round, Championship championship);

}
