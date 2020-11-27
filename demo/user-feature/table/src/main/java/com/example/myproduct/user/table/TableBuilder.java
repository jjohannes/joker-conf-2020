package com.example.myproduct.user.table;

import com.example.myproduct.model.MyProductRelease;
import com.example.myproduct.user.data.DataRetriever;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TableBuilder {

    public static Map<String, String> build() {
        List<MyProductRelease> releases = DataRetriever.retrieve().getReleases();
        return build(releases);
    }

    protected static Map<String, String> build(List<MyProductRelease> releases) {
        return releases.stream().collect(Collectors.toMap(
                MyProductRelease::getVersion, MyProductRelease::getReleaseNotes));
    }

}
