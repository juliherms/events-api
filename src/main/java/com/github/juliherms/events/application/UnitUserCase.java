package com.github.juliherms.events.application;

public abstract class UnitUserCase<INPUT> {

    public abstract void execute(INPUT input);
}
