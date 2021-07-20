package com.odianyun.internship.web;

import com.odianyun.internship.model.DTO.UUserDTO;
import com.odianyun.internship.model.UUser;
import com.odianyun.internship.service.UserService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("uuser")
public class UUserController {

    @Resource
    private UserService userService;

    @GetMapping("getById")
    public UUser getById(@RequestParam("id") Long id) {
        return userService.getById(id);
    }

    @PostMapping("update")
    public UUser update(@RequestBody UUserDTO dto){
        userService.update(dto);
        return userService.getById(dto.getId());
    }


    @PostMapping("updateForMap")
    public UUser updateForMap(@RequestBody Map<String, Object> dto){
        userService.updateForMap(dto);
        return userService.getById((Long) dto.get("id"));
    }


    @PostMapping("updateParam")
    public UUser updateParam(@RequestBody UUserDTO dto){
        userService.updateParam(dto);
        return userService.getById(dto.getId());
    }

    @PostMapping("add")
    public UUser add(@RequestBody UUserDTO dto){
        UUser user = userService.add(dto);
        return user;
    }

    @PostMapping("addAnno")
    public UUser addAnno(@RequestBody UUserDTO dto){
        UUser user = userService.addAnno(dto);
        return user;
    }

    @PostMapping("batchAdd")
    public void batchAdd(@RequestBody List<UUserDTO> dtoList){
        userService.batchAdd(dtoList);
    }


    @PostMapping("list")
    public List<UUser> list(@RequestBody UUserDTO dto){
        List<UUser> list = userService.list(dto);
        return list;
    }

}
