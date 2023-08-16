package com.login.service;

import com.login.entity.Registration;

import java.util.Set;

public interface Service {
    public Registration saveReg(Registration reg);
    public  void deleteReg(String regId);
    public Registration getReg(String regId);
    public Registration updateReg(Registration reg, String regId);
}
