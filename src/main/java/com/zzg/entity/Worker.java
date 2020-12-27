package com.zzg.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@TableName("worker")
public class Worker implements Serializable {
	@TableId(value = "WorkerID", type = IdType.ASSIGN_UUID)
    private String workerid;

    private String workername;

    private String workersex;

    private String workeridnumber;

    private String workerposition;

    private String workerpassword;
}