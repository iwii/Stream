package com.example.stream.serviceImpl;

import com.example.stream.dto.Address;
import com.example.stream.repo.AddressRepo;
import com.example.stream.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("addressService")
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepo addressRepo;

    @Override
    public List<Address> getAddress() {
        return addressRepo.getAddress();
    }
}
