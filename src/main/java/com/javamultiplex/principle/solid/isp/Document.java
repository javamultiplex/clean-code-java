package com.javamultiplex.principle.solid.isp;

/**
 * @author Rohit Agarwal on 19/08/20 11:30 pm
 * @copyright www.javamultiplex.com
 */
public class Document {
    private String name;
    private String size;
    private byte[] content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
