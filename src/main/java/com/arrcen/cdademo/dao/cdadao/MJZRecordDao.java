package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.MJZRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MJZRecordDao extends JpaRepository<MJZRecord,String> {

    MJZRecord findBy门急诊号(String id);
}

