package com.zzg.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@TableName("manager")
public class Manager implements Serializable {
	@TableId(value = "ManagerID", type = IdType.ASSIGN_UUID)
    private String managerid;

    private String managername;

    private String managerpassword;

}