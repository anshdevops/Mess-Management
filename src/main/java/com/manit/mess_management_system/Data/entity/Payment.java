package com.manit.mess_management_system.Data.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Payment {
    /*
    This entity contains the entries for payments received.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String residentId;
    private String paymentId;
    private Date paymentFrom;
    private Date paymentTo;



}
