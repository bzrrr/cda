package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.MJZRecordDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MJZRecordDetailDao extends JpaRepository<MJZRecordDetail,String> {
    MJZRecordDetail findBy电子申请单编号(String id);
}
