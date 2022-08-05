package com.ang.command.command;

import java.util.Objects;

/**
 * @author: 于昂
 * @date: 2022/8/5
 **/
public class NoCommand implements Command {
    private static NoCommand instance;

    private NoCommand() {
    }

    public static NoCommand getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (NoCommand.class) {
                instance = new NoCommand();
            }
        }
        return instance;
    }

    @Override
    public void execute() {
    }

    @Override
    public void undo() {
    }
}
