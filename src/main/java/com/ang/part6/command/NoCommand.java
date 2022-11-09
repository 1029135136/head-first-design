package com.ang.part6.command;

/**
 * @author: 于昂
 * @date: 2022/11/8
 **/
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("空命令");
    }

    @Override
    public void undo() {
        System.out.println("空命令");
    }
}
