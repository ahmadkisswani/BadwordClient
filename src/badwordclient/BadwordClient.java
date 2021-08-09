
package badwordclient;

import ApiConfiguration.configuration;
import initializr.getApi;

public class BadwordClient {

 
    public static void main(String[] args) {
       configuration con =  new configuration();
       initializr.getApi out =  new getApi(con);
        System.out.println( out.replaceBadBordFull("ass").getClean());
    }
    
}
