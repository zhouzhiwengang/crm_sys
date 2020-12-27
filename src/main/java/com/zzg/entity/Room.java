package com.zzg.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@TableName("room")
public class Room implements Serializable {
	@TableId(value = "RoomID", type = IdType.ASSIGN_UUID)
    private String roomid;

    private String roomtype;

    private Float roomprice;

    private String roomstate;

}