package com.hiczp.bilibili.api.live.socket.event;

import com.hiczp.bilibili.api.live.socket.entity.PreparingEntity;

public class PreparingPackageEvent extends ReceiveRoomStatusPackageEvent<PreparingEntity> {
    public PreparingPackageEvent(Object source, PreparingEntity entity) {
        super(source, entity);
    }
}
