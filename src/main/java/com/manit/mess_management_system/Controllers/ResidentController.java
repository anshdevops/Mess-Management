package com.manit.mess_management_system.Controllers;


import com.manit.mess_management_system.Data.entity.Resident;
import com.manit.mess_management_system.Services.ResidentService;
import com.manit.mess_management_system.exceptions.ResidentAlreadyExistsException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ResidentController {


    @Autowired
    ResidentService residentService;

    /*
    Api to Register a New Resident to enroll in mess
     */
    @PostMapping("/resident/register/")
    public Resident register(@RequestBody Resident resident) throws ResidentAlreadyExistsException {
        log.info("Resident Id is {}",resident.getResidentId());

        return residentService.register(resident);

    }

}
