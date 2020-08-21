package com.hod;

import org.junit.Test;

public class MessagePrinterTest {

    @Test
    public void testMsgPrinter() {
        final MessagePrinter msgPrinter = new MessagePrinter();
        final int status = msgPrinter.printMsg("How you doing?");
        assert status == 1;
    }
}
