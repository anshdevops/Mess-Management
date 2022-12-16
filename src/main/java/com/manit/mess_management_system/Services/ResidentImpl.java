package com.manit.mess_management_system.Services;

import com.manit.mess_management_system.Data.entity.Resident;
import com.manit.mess_management_system.database.ResidentRepo;
import com.manit.mess_management_system.exceptions.ResidentAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ResidentImpl implements ResidentService {


    @Autowired
    ResidentRepo residentRepo;

    @Override
    public Resident register(Resident resident) throws ResidentAlreadyExistsException {

        Optional<Resident> r = residentRepo.findById(resident.getResidentId());

        if (r.isEmpty()) {

            return residentRepo.save(resident);

        } else {
            throw new ResidentAlreadyExistsException("Resident with name " + resident.getName()
                    + " is already Registered with ID " + resident.getResidentId());

        }
    }


}
