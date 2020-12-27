package com.zzg.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzg.entity.OutHistory;
import com.zzg.mapper.OutHistoryMapper;
import com.zzg.service.OutHistoryService;

@Service
public class OutHistoryServiceImpl extends ServiceImpl<OutHistoryMapper, OutHistory> implements OutHistoryService {

}
