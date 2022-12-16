package com.manit.mess_management_system.database;

import com.manit.mess_management_system.Data.entity.Resident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResidentRepo extends JpaRepository<Resident,String> {


}
