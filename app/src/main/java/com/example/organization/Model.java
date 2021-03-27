package com.example.organization;

import com.google.firebase.database.PropertyName;

public class Model {

    String name, eventDetails, link;

    @PropertyName("name")
    public String getName() {
        return name;
    }

    @PropertyName("eventDetails")
    public String getEventDetails() {
        return eventDetails;
    }

    @PropertyName("link")
    public String getLink() { return link; }
}
