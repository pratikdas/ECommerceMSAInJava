package com.pratik.inventory.repositories;


import com.pratik.inventory.models.Bin;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BinRepository {

    List<Bin> getBins();

    int createBin(Bin bin);

    int updateBin(Bin bin);

    int deleteBin();


}
