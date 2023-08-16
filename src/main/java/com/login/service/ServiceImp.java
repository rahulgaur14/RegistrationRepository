package com.login.service;

import com.login.entity.Registration;
import com.login.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;

@org.springframework.stereotype.Service
public class ServiceImp implements Service{
    @Autowired
    public Repo repo;

    @Override
    public Registration saveReg(Registration reg) {
//        if (reg == null) {
//            throw new NullPointerException("Registration object cannot be null");
//        }

//        String fn = reg.getFName();
//        String ln =reg.getLName();
        String regPwd = reg.getRegPwd();
        String cnfPwd = reg.getCnfPwd();

        if (regPwd == null || cnfPwd == null  || !regPwd.equals(cnfPwd)) {
            throw new IllegalArgumentException("Passwords do not match");

        }
        if (repo.existsById(reg.getRegId()))
        {
            throw new DuplicateKeyException("Duplicate data not allowed");
        }

        return repo.save(reg);

         //Assuming 'repo' is a repository or data access object for saving registrations
    }

    @Override
    public void deleteReg(String regId) {
        repo.deleteById(regId);

    }

    @Override
    public Registration getReg(String regId) {
          return repo.findById(regId).get();
    }

    @Override
    public Registration updateReg(Registration reg, String regId) {
        Registration s2 = repo.findById(regId).get();
        s2.setRegId(regId);
        s2.setFName(reg.getFName());
        s2.setLName(reg.getLName());
        s2.setMobNo(reg.getMobNo());
        return repo.save(s2);
    }
}
