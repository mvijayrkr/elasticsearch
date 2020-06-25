package com.dbs.edsf.elasticsearch.controller;

import com.dbs.edsf.elasticsearch.entity.TextSearch;
import com.dbs.edsf.elasticsearch.entity.Users;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHost;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ElasticDateRange {
    public static void main(String[] args) throws IOException {

        LocalDateTime datetime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String totimestamp = dateTimeFormatter4.format(datetime);
        String fromtimestamp = dateTimeFormatter4.format(datetime.minusMinutes(15000));
        System.out.println(fromtimestamp);
        System.out.println(totimestamp);

        List<Users> users = new ArrayList<>();
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("localhost", 9200, "http")));

        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        sourceBuilder.query(QueryBuilders.rangeQuery("created_on").from(fromtimestamp).to(totimestamp));

        SearchRequest searchRequest = new SearchRequest("user");
        searchRequest.source(sourceBuilder);

        SearchResponse searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);
        //System.out.println(searchResponse.getHits().totalHits);
        for(SearchHit searchHit : searchResponse.getHits().getHits()){
            Users missedevents = new ObjectMapper().readValue(searchHit.getSourceAsString(),Users.class);
            users.add(missedevents);
        }
        for(Users user :users){
            System.out.println("-------------------->"+ user.getFull_name());
        }


        client.close();
    }
}