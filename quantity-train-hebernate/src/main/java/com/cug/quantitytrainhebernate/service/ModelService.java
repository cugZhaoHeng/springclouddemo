package com.cug.quantitytrainhebernate.service;

import com.cug.quantitytrainhebernate.pojo.Model;
import com.cug.quantitytrainhebernate.repository.ModelRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhaoheng
 * @date 2019/7/30 0030
 */
@Service(value = "modelService")
public class ModelService {

    @Resource
    ModelRepository modelRepository;

    public Model insertModel(Model model) {
        return modelRepository.save(model);
    }
}
