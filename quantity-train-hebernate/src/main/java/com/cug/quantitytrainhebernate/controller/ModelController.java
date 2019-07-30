package com.cug.quantitytrainhebernate.controller;

import com.cug.quantitytrainhebernate.service.ModelService;
import com.cug.quantitytrainhebernate.service.ModelVoService;
import com.cug.quantitytrainhebernate.vo.ModelVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zhaoheng
 * @date 2019/7/30 0030
 */
@RestController
@RequestMapping(value = "model")
public class ModelController {
    @Resource
    ModelService modelService;

    @Resource
    ModelVoService modelVoService;

    /**
     * 向数据库中插入model对象，直接以对象的形式
     * @param modelVo
     * @return
     */
    @PutMapping(value = "insert")
    public Object insertModel(ModelVo modelVo) {
        return modelVoService.insertModelVo(modelVo);
    }

    /**
     * 传入ID，查询model
     * @param id
     * @return
     */
    @GetMapping(value = "{id}")
    public Object insertModel(@PathVariable("id") String id) {
        return modelVoService.getModelById(id);
    }

    /**
     * 根据传入的Id和name修改数据表中的Model，返回值为0或1
     * @param id
     * @param name
     * @return
     */
    @PostMapping(value = "{id}")
    public String updateModel(@PathVariable("id") String id, @RequestParam("name") String name) {

        int i = modelVoService.updateModel(id, name);
        if(i > 0) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }

    @DeleteMapping(value = "{id}")
    public String deleteModel(@PathVariable("id") String id) {
        int i = modelVoService.deleteModelById(id);
        if(i > 0) {
            return "删除成功！";
        } else {
            return "删除失败！";
        }
    }
}
