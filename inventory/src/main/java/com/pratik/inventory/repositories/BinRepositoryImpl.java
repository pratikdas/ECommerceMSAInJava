package com.pratik.inventory.repositories;


import com.pratik.inventory.models.Bin;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BinRepositoryImpl implements BinRepository{
    @Override
    public List<Bin> getBins() {
        return null;
    }

    @Override
    public int createBin(Bin bin) {
        return 0;
    }

    @Override
    public int updateBin(Bin bin) {
        return 0;
    }

    @Override
    public int deleteBin() {
        return 0;
    }
}
