package com.ang.command.command;

import com.ang.command.model.CeilingFan;

import static com.ang.command.model.CeilingFan.*;

/**
 * @author: 于昂
 * @date: 2022/8/5
 **/
public class CeilingFanHighCommand extends CeilingFanCommand implements Command {
    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        /**
         * 保存前一个速度
         */
        preSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }
}
