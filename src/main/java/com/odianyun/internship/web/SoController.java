package com.odianyun.internship.web;

import com.google.common.collect.Lists;
import com.odianyun.internship.model.DTO.SoDTO;
import com.odianyun.internship.model.ListResult;
import com.odianyun.internship.model.VO.SoVO;
import com.odianyun.internship.service.SoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("so")
public class SoController {

    @Resource
    private SoService soService;

    @RequestMapping("list")
    public List<SoVO> list(@RequestBody SoDTO dto) {
        List<SoVO> list = soService.list(dto);
        return list;
    }

    @RequestMapping("listPage")
    public ListResult<SoVO> listPage(@RequestBody SoDTO dto) {
        ListResult<SoVO> list = soService.listPage(dto);
        return list;
    }


    @PostMapping("batchUpdate")
    public String batchUpdateStatus(@RequestBody List<String> dtoList) {
        soService.batchUpdateStatus(dtoList);
        return "success";
    }
}
