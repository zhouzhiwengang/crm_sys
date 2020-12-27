package com.zzg.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@TableName("customertype")
public class CustomerType implements Serializable {
	@TableId(value = "TypeName")
    private String typename;

    private Float discount;

    private Float fine;

}