package com.ang.command.command;

import com.ang.command.model.CeilingFan;

import static com.ang.command.model.CeilingFan.HIGH;
import static com.ang.command.model.CeilingFan.LOW;

/**
 * @author: 于昂
 * @date: 2022/8/5
 **/
public class CeilingFanLowCommand extends CeilingFanCommand implements Command {

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
       super(ceilingFan);
    }

    @Override
    public void execute() {
        /**
         * 保存前一个速度
         */
        preSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }
}
