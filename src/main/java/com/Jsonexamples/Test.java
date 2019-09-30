package com.Jsonexamples;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws IOException {
        String json="{\n" +
                "      \"documents\":{\n" +
                "         \"documentType\":\"eip_disclosure\",\n" +
                "         \"count\":\"2\",\n" +
                "         \"tagInfo\":{\n" +
                "            \"fromDate\":\"20180209\",\n" +
                "            \"toDate\":\"201801009\",\n" +
                "            \"channel\":\"RETAIL\",\n" +
                "            \"language\":\"en-US\",\n" +
                "            \"storeState\":\"WA\"\n" +
                "         }\n" +
                "      },\n" +
                "      \"docReturnType\":\"content\"\n" +
                "   }";

        Map<String,Object> obj=  new ObjectMapper ().readValue ( json, new TypeReference<Map<String,Object>> (){} );
        System.out.println (obj);
        String res=new ObjectMapper().writeValueAsString ( obj );
        System.out.println (res);
    }
}
