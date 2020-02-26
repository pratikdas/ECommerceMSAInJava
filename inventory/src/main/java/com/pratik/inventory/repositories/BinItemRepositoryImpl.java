package com.pratik.inventory.repositories;

import com.pratik.inventory.models.BinItem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BinItemRepositoryImpl implements BinItemRepository {
    @Override
    public BinItem createBinItem(BinItem binItem) {
        return null;
    }

    @Override
    public BinItem updateBinItem(BinItem binItem) {
        return null;
    }

    @Override
    public List<BinItem> getBinItem() {
        return null;
    }

    @Override
    public BinItem getBinItemByID(String binItemID) {
        return null;
    }
}
