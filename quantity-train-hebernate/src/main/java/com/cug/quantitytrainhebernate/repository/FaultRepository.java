package com.cug.quantitytrainhebernate.repository;

import com.cug.quantitytrainhebernate.pojo.Fault;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zhaoheng
 * @date 2019/7/30 0030
 */
@Repository
public interface FaultRepository extends JpaRepository<Fault, String> {

}
