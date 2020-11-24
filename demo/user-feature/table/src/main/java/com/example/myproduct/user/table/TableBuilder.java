package com.example.myproduct.user.table;

import com.example.myproduct.model.MyProductRelease;
import com.example.myproduct.user.data.DataRetriever;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TableBuilder {

    public static List<List<String>> build() {
        List<MyProductRelease> releases = DataRetriever.retrieve().getReleases();
        return build(releases);
    }

    protected static List<List<String>> build(List<MyProductRelease> releases) {
        return releases.stream().map(r ->
                Arrays.asList(r.getVersion(), r.getReleaseNotes())).collect(Collectors.toList());
    }

}
