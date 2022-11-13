package com.smiles.controller;

import static com.mongodb.client.model.Filters.eq;

import com.google.protobuf.Struct;
import com.google.protobuf.util.JsonFormat;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.smiles.GetMoleculeRequest;
import com.smiles.MoleculeServiceGrpc.MoleculeServiceImplBase;
import com.smiles.utils.StreamJSONData;

import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

public class ChemDataImpl extends MoleculeServiceImplBase {

    // Mongo Instance connection string
//    MongoClient mongoClient = MongoClients.create("mongodb://root:indiana@149.165.159.151:27017");
    MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
    // MongoDB Database name
    MongoDatabase mongoDatabase = mongoClient.getDatabase("indiana");
    // MongoDB Collection name
    MongoCollection<Document> mongoCollection = mongoDatabase.getCollection(
        "chemDataExtract"
    );

    List<Document> moleculeList = mongoCollection
        .find()
        .into(new ArrayList<>());

    @Override
    public void getMolecule(
        GetMoleculeRequest request,
        StreamObserver<Struct> responseObserver
    ) {
        Struct.Builder structBuilder = Struct.newBuilder();

        try {
            JsonFormat
                .parser()
                .merge(StreamJSONData.of(moleculeList).toJsonString(), structBuilder);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(structBuilder.build());
        responseObserver.onNext(structBuilder.build());
        responseObserver.onCompleted();
    }
}
