package com.ang.part6.command;

/**
 * @author: 于昂
 * @date: 2022/11/8
 **/
public interface Command {
    void execute();

    void undo();
}
