package com.javamultiplex.principle.solid.isp.bad;

import com.javamultiplex.principle.solid.isp.Document;

/**
 * @author Rohit Agarwal on 19/08/20 11:31 pm
 * @copyright www.javamultiplex.com
 */
public interface Machine {
    void print(Document d);

    void scan(Document d);

    void fax(Document d);
}
