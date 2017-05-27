package com.mindwork.receive.service;

import com.mindwork.receive.model.UpdatesHeap;
import org.junit.Test;

import static org.junit.Assert.*;

public class UpdatesBrokerTest {

    @Test
    public void getAllUpdates() throws Exception {
        UpdatesBroker updatesBroker = new UpdatesBroker();
        UpdatesHeap heap = updatesBroker.getAllUpdates();

        System.out.println(heap.getUpdates().toString());
    }

}