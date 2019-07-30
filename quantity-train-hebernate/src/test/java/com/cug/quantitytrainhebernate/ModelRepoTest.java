package com.cug.quantitytrainhebernate;

import com.cug.quantitytrainhebernate.pojo.Fault;
import com.cug.quantitytrainhebernate.pojo.Model;
import com.cug.quantitytrainhebernate.repository.FaultRepository;
import com.cug.quantitytrainhebernate.repository.ModelRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.UUID;

/**
 * @author zhaoheng
 * @date 2019/7/30 0030
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ModelRepoTest {
    @Resource
    ModelRepository modelRepository;

    @Resource
    FaultRepository faultRepository;
    @Test
    public void insertModel() {
        Model model = new Model();
        model.setId(UUID.randomUUID().toString());
        model.setName("新27断块");
        model.setLocation("克拉玛依");
        modelRepository.save(model);

        Fault fault = new Fault();
        fault.setId(UUID.randomUUID().toString());
        fault.setName("汾河断裂");
        fault.setCode("ac009");
        fault.setModel_id(model.getId());
        faultRepository.save(fault);
    }
}
