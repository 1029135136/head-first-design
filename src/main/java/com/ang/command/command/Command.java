package com.ang.command.command;

/**
 * @author: 于昂
 * @date: 2022/8/5
 **/
public interface Command {
    /**
     * 执行
     */
    void execute();

    /**
     * 撤销
     */
    void undo();
}
