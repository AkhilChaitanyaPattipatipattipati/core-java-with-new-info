package com.io;

import java.io.*;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File(new FileDemo().getClass().getClassLoader().getResource("sample.json").getFile());
        System.out.println (file.exists ());
        FileReader fileReader=new FileReader ( file );
        //Character Data
       /* int i=fileReader.read ();
       while( i!=-1){
           System.out.println ((char)i);
           i=fileReader.read ();
       }*/
       //Read Line By Line
      /*  BufferedReader br=new BufferedReader ( fileReader );
       String line=   br.readLine ();
       while(line!=null){
           System.out.println (line);
           line=br.readLine ();
       }*/
       //Fils.
      /*  List<String> allLines  = Files.readAllLines ( file.toPath ());
       List filteredlines= allLines.stream ().filter ( i->i.contains ( "key1" ) ).collect ( Collectors.toList () );
        System.out.println (filteredlines);*/
        List<String> allLines  = Files.readAllLines ( file.toPath ());
        String filteredlines= allLines.stream ().filter ( i->!i.contains ( "key1" ) ).collect ( Collectors.joining ("") );

        String data="<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "   <soapenv:Header>\n" +
                "      <wsse:Security soapenv:mustUnderstand=\"1\" xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\">\n" +
                "         <wsse:UsernameToken wsu:Id=\"UsernameToken-1\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">\n" +
                "            <wsse:Username>rspuui</wsse:Username>\n" +
                "            <wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">@Password1</wsse:Password>\n" +
                "         </wsse:UsernameToken>\n" +
                "      </wsse:Security>\n" +
                "   </soapenv:Header>\n" +
                "   <soapenv:Body>\n" +
                "      <sdo:activationRequest xmlns:sdo=\"http://retail.tmobile.com/sdo\">\n" +
                "         <sdo:header rspServiceVersion=\"1.13.1\">\n" +
                "            <sdo:partnerId>WATSON</sdo:partnerId>\n" +
                "            <sdo:partnerTransactionId>WAT1000</sdo:partnerTransactionId>\n" +
                "            <sdo:partnerTimestamp>{{date}}T11:42:32.856-04:00</sdo:partnerTimestamp>\n" +
                "            <sdo:storeId>451</sdo:storeId>\n" +
                "            <sdo:dealerCode>3015820</sdo:dealerCode>\n" +
                "            <sdo:authenticatedId>tbd</sdo:authenticatedId>\n" +
                "         </sdo:header>\n" +
                "         <sdo:customerLookup>\n" +
                "            <sdo:wipCustomerId>{{wipCustomerId}}</sdo:wipCustomerId>\n" +
                "         </sdo:customerLookup>\n" +
                "         <sdo:accountType>INDIVIDUAL_REGULAR</sdo:accountType>\n" +
                "         <sdo:lineDetails>\n" +
                "            <sdo:lineId>1</sdo:lineId>\n" +
                "            <sdo:selectedRateplan>FRLTUNL</sdo:selectedRateplan>\n" +
                "            <sdo:marketCode>{{marketcode}}</sdo:marketCode>\n" +
                "            <sdo:npaInfo>\n" +
                "               <sdo:npa>{{npa}}</sdo:npa>\n" +
                "               <sdo:description>Atlanta, GA</sdo:description>\n" +
                "               <sdo:marketCode>{{marketcode}}</sdo:marketCode>\n" +
                "            </sdo:npaInfo>\n" +
                "            <sdo:serviceBeginDate>{{date}}</sdo:serviceBeginDate>\n" +
                "            <sdo:contractLength>0</sdo:contractLength>\n" +
                "            <sdo:selectedService>\n" +
                "               <sdo:soc>ACJUMPG4</sdo:soc>\n" +
                "            </sdo:selectedService>\n" +
                "            <sdo:subsidyType>EIP</sdo:subsidyType>\n" +
                "            <sdo:productType>GSM</sdo:productType>\n" +
                "            <sdo:sim>{{sim_1}}</sdo:sim>\n" +
                "            <sdo:imei>{{IMEI_ACT}}</sdo:imei>\n" +
                "         </sdo:lineDetails>\n" +
                "         <sdo:billLanguageOption>ENGLISH</sdo:billLanguageOption>\n" +
                "         <sdo:multiBanRequest>false</sdo:multiBanRequest>\n" +
                "         <sdo:mailingAddress>\n" +
                "            <sdo:address1>22213 30TH DR SE</sdo:address1>\n" +
                "            <sdo:city>BOTHELL</sdo:city>\n" +
                "            <sdo:state>WA</sdo:state>\n" +
                "            <sdo:zipCode>98021</sdo:zipCode>\n" +
                "            <sdo:zipCodeExtension>1350</sdo:zipCodeExtension>\n" +
                "         </sdo:mailingAddress>\n" +
                "      </sdo:activationRequest>\n" +
                "   </soapenv:Body>\n" +
                "</soapenv:Envelope>";

        System.out.print ( data );
    }
}
