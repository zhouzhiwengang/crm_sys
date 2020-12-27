package com.zzg.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@TableName("outhistory")
public class OutHistory implements Serializable {
	@TableId(value = "OutID", type = IdType.ASSIGN_UUID)
    private String outid;

    private String customerid;

    private String customertype;

    private String customerindate;

    private String customeroutdate;

    private String roomid;

    private String worker;

}