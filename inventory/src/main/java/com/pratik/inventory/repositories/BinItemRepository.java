package com.pratik.inventory.repositories;

import com.pratik.inventory.models.BinItem;

import java.util.List;

public interface BinItemRepository {

    BinItem createBinItem(BinItem binItem);

    BinItem updateBinItem(BinItem binItem);

    List<BinItem> getBinItem();

    BinItem getBinItemByID(String binItemID);

}
