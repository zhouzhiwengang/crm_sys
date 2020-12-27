package com.zzg.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
@SuppressWarnings("serial")
@Data
@TableName("inhistory")
public class InHistory implements Serializable {
	@TableId(value = "InID", type = IdType.ASSIGN_UUID)
    private String inid;

    private String customerid;

    private String customertype;

    private Date customerindate;

    private Date customeroutdate;

    private String roomid;

    private String worker;

}