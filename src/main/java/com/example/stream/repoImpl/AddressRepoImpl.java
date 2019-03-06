package com.example.stream.repoImpl;

import com.example.stream.dto.Address;
import com.example.stream.repo.AddressRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AddressRepoImpl implements AddressRepo {

    @Override
    public List<Address> getAddress() {

        List<Address> addressList = new ArrayList<>();

        addressList.add(new Address("Leśna", "Wrocław", "50-555"));

        return addressList;
    }
}
