package com.smiles.utils;

import java.util.List;
import java.util.stream.Collectors;

import org.bson.Document;

public class StreamJSONData {

    private final List<Document> moleculeList;

    private StreamJSONData(List<Document> moleculeList) {
        this.moleculeList = moleculeList;
    }

    public static StreamJSONData of(List<Document> moleculeList) {
        return new StreamJSONData(moleculeList);
    }

    public String toJsonString() {
        return moleculeList.stream()
            .limit(50)
            .map(Document::toJson)
            .collect(Collectors.joining(",", "{\"data\": [", "]}"));
    }
}
