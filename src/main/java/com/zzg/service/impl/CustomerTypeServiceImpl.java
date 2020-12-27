package com.zzg.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzg.entity.CustomerType;
import com.zzg.mapper.CustomerTypeMapper;
import com.zzg.service.CustomerTypeService;

@Service
public class CustomerTypeServiceImpl extends ServiceImpl<CustomerTypeMapper, CustomerType> implements CustomerTypeService  {

}
