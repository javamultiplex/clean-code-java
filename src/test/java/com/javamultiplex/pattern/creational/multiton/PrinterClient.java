package com.javamultiplex.pattern.creational.multiton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 29/08/20 11:59 pm
 * @copyright www.javamultiplex.com
 */
public class PrinterClient {

    @Test
    public void shouldCreatePrinterForPrimarySubsystem() {
        Printer printer1 = Printer.get(SubSystem.PRIMARY);
        Printer printer2 = Printer.get(SubSystem.PRIMARY);
        Assertions.assertSame(printer1, printer2);
    }

    @Test
    public void shouldCreatePrinterForAuxiliarySubsystem() {
        Printer printer1 = Printer.get(SubSystem.AUXILIARY);
        Printer printer2 = Printer.get(SubSystem.AUXILIARY);
        Assertions.assertSame(printer1, printer2);
    }

    @Test
    public void shouldCreatePrinterForFallbackSubsystem() {
        Printer printer1 = Printer.get(SubSystem.FALLBACK);
        Printer printer2 = Printer.get(SubSystem.FALLBACK);
        Assertions.assertSame(printer1, printer2);
    }
}
