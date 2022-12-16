package com.manit.mess_management_system.Services;

import com.manit.mess_management_system.Data.entity.Resident;
import com.manit.mess_management_system.exceptions.ResidentAlreadyExistsException;

public interface ResidentService {

    Resident register(Resident resident) throws ResidentAlreadyExistsException;

}
