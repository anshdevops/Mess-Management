package com.manit.mess_management_system.Data.entity;


import com.manit.mess_management_system.Data.entity.DineHistory;
import com.manit.mess_management_system.Data.entity.Payment;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Data
@Entity
public class Resident {

    @Id
    private String residentId;
    private String name;
    private String course;
    private String branch;
    private Integer totalPaid;
    private Integer dueAmount;
    private Boolean isEnrolled;

//    private List<Payment> paymentsHistory;
//    private List<DineHistory> dineHistories;




}
