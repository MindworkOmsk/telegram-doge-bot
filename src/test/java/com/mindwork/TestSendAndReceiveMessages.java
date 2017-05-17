package com.mindwork;

import com.mindwork.model.receive.UpdatesHeap;
import com.mindwork.model.send.Message;
import com.mindwork.service.receive.UpdatesBroker;
import com.mindwork.service.send.MessageSender;
import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;


@RunWith(JUnit4ClassRunner.class)
public class TestSendAndReceiveMessages {

    @Test
    public void testSendAndReceiveOneMessage() {
        Message message = new Message();
        message.setChatName("@wow_so_bot");
        message.setText("wow testSendAndReceiveOneMessage much tests");

        MessageSender sender = new MessageSender();
        sender.sendMessage(message);

        UpdatesBroker updatesBroker = new UpdatesBroker();
        UpdatesHeap heap = updatesBroker.getAllUpdates();

        System.out.println(heap.getUpdates().toString());

        Assert.assertTrue(!heap.getUpdates().isEmpty());
    }
}
