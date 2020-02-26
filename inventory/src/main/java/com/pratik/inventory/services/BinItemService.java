package com.pratik.inventory.services;


import com.pratik.inventory.controllers.requests.CreateBinItemRequest;
import com.pratik.inventory.controllers.responses.CreateBinItemResponse;
import com.pratik.inventory.models.BinItem;
import com.pratik.inventory.repositories.BinItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BinItemService {

    private BinItemRepository binItemRepository;

    @Autowired
    public BinItemService(final BinItemRepository binItemRepository){
        this.binItemRepository = binItemRepository;
    }

    public CreateBinItemResponse addBinItem(CreateBinItemRequest request){

        BinItem binItem = copyToBinItem(request);
        BinItem binItemResult = binItemRepository.createBinItem(binItem);
        return copyFromBinItem(binItemResult);
    }


    private BinItem copyToBinItem(final CreateBinItemRequest request){
        BinItem binItem = new BinItem();

        return binItem;
    }

    private CreateBinItemResponse copyFromBinItem(final BinItem binItem){
        CreateBinItemResponse createBinItemResponse = new CreateBinItemResponse();

        return createBinItemResponse;
    }



}
