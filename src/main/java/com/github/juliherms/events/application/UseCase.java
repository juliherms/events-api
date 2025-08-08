package com.github.juliherms.events.application;

public abstract class UseCase<INPUT, OUTPUT> {

    // 1. cada caso de uso tem um input e output próprio. Não retortna a entidade, o agregado ou objeto de valor
    // 2. o caso de uso implementa o padrão commmand

    public abstract OUTPUT execute(INPUT input);

}
