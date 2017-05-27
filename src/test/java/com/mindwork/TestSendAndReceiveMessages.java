package com.mindwork;

import com.mindwork.receive.model.message.MessageWrapped;
import com.mindwork.receive.model.UpdatesHeap;
import com.mindwork.receive.service.UpdatesBroker;
import com.mindwork.send.model.TextMessageForSend;
import com.mindwork.send.service.MessageSender;
import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.concurrent.ExecutionException;


@RunWith(JUnit4ClassRunner.class)
public class TestSendAndReceiveMessages {

    @Test
    public void testSendAndReceiveOneMessage() throws ExecutionException, InterruptedException, IOException {
        //send textMessageForSend to bot from bot
        TextMessageForSend textMessageForSend = new TextMessageForSend(208159377, "666");

        MessageSender sender = new MessageSender();
        MessageWrapped sendedMessage = sender.sendMessage(textMessageForSend);

        Assert.assertTrue(sendedMessage != null);

        //aaaand read the sended textMessageForSend, current implementation gives us guaranties for idempotent result
        UpdatesBroker updatesBroker = new UpdatesBroker();
        UpdatesHeap heap = updatesBroker.getAllUpdates();

        System.out.println(heap.getUpdates().toString());

        Assert.assertTrue(!heap.getUpdates().isEmpty());
    }
}
