package com.zzg.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@TableName("customer")
public class Customer implements Serializable {
	@TableId(value = "CustomerID", type = IdType.ASSIGN_UUID)
    private String customerid;

    private String customername;

    private String customersex;

    private String customeridnumber;

    private String customertype;

    private String customerphone;

    private Date customercreatedate;

}