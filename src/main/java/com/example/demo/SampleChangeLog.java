package com.example.demo;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

@ChangeLog
public class SampleChangeLog {

    @ChangeSet(id = "withMongoDatabase", order = "001", author = "Mongock")
    public void changeSet1(MongoDatabase mongoDatabase) {
        mongoDatabase.getCollection("sampleCol")
            .insertOne(new Document().append("name", "John").append("surname", "Doe"));
    }
}
