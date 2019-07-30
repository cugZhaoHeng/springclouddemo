package com.cug.quantitytrainhebernate.service;

import com.cug.quantitytrainhebernate.pojo.Model;
import com.cug.quantitytrainhebernate.repository.ModelRepository;
import com.cug.quantitytrainhebernate.vo.ModelVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author zhaoheng
 * @date 2019/7/30 0030
 */
@Service(value = "modelVoService")
public class ModelVoService {

    @Resource
    ModelRepository modelRepository;

    public Model insertModelVo(ModelVo modelVo) {
        Model model = new Model();
        BeanUtils.copyProperties(modelVo, model);
        modelRepository.save(model);
        return model;
    }

    public Model getModelById(String id) {
        Optional<Model> model = modelRepository.findById(id);
        return model.get();
    }

    public int updateModel(String id, String name) {
        return modelRepository.updateModel(id, name);
    }

    public int deleteModelById(String id) {
        return modelRepository.deleteModelById(id);
    }
}
