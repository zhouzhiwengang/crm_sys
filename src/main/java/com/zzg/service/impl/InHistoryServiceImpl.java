package com.zzg.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzg.entity.InHistory;
import com.zzg.mapper.InHistoryMapper;
import com.zzg.service.InHistoryService;

@Service
public class InHistoryServiceImpl extends ServiceImpl<InHistoryMapper, InHistory> implements InHistoryService {

}
