package com.ComIT.CellCity.Service;

import com.ComIT.CellCity.Model.Mobile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MobileService {
    private MobileRepository mobileRepository;

    @Autowired
    public MobileService(MobileRepository mobileRepository) {
        this.mobileRepository = mobileRepository;
    }

    public void saveMobile (Mobile mobile) {
        mobileRepository.save(mobile);
    }

    public Optional<Mobile> findMobileById(Long id) {
        return mobileRepository.findById(id);
    }
}
