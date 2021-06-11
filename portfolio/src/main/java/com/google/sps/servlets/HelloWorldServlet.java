package com.google.sps.servlets;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html;");


    String quote1 = "You always own the option of having no opinion.";
    String quote2 = "We suffer more in imagination than in reality";
    String quote3 = "It is not that we have a short space of time, but that we waste much of it.";
    String quote4 = "Wherever you go, go with all your heart.";
    String quote5 = "Convictions are more dangerous foes of truth than lies.";
    String quote6 = "If you never doubt your beliefs, then you’re wrong a lot.";  
    
    
    ArrayList<String>  quotes = new ArrayList<String>();
    quotes.add(quote1);
    quotes.add(quote2);
    quotes.add(quote3);
    quotes.add(quote4);
    quotes.add(quote5);
    quotes.add(quote6);
    String json = convertToJsonUsingGson(quotes);
    response.getWriter().println(json);
    }

  private String convertToJsonUsingGson(ArrayList<String> quotes) {
    Gson gson = new Gson();
    String json = gson.toJson(quotes); // uses gson library to convert to json
    System.out.println(json);
    return json;
  }
}
    /*
  private String convertToJson(String quotes) { // just adding quotation marks and commas
    String json = "{";
    json += "\"quote1\": ";
    json += "\"" + quotes[1] + "\"";
    json += ", ";
    json += "\"quote2\": ";
    json += "\"" + quotes.getquote2() + "\"";
    json += ", ";
    json += "\"quote3\": ";
    json += quotes.getquote3();
    json += "}";
    return json;
  }
  */



      /*
    can't iterate during conversion and gson can't use this
    ArrayList<String> quotes = new ArrayList<String>();
    
    String quote1 = "Concentrate every minute on doing what is in front of you with precise and genuine seriousness, tenderly, willingly, with justice and on freeing yourself from all other distractions";
    String quote2 = "We suffer more in imagination than in reality";
    String quote3 = "It is not that we have a short space of time, but that we waste much of it.";
    quotes.add(quote1);
    quotes.add(quote2);
    quotes.add(quote3);
    */

    /*
    list of strings seems impossible to use
    String[] quotes = new String[3];
    String quote1 = "Concentrate every minute on doing what is in front of you with precise and genuine seriousness, tenderly, willingly, with justice and on freeing yourself from all other distractions";
    String quote2 = "We suffer more in imagination than in reality";
    String quote3 = "It is not that we have a short space of time, but that we waste much of it.";
    quotes[0] = quote1;
    quotes[0] = quote2;
    quotes[0] = quote3;
    */
    
    /*
    //This works the best so far, at least it returns something
    String json = "{";
    json += "\"quote1\": ";
    json += "\"" + quote1 + "\"";
    json += ", ";
    json += "\"quote2\": ";
    json += "\"" + quote2 + "\"";
    json += ", ";
    json += "\"quote3\": ";
    json += quote3;
    json += "}";

    //String quotes = new quotes(quote1, quote2, quote3);
    //String json = convertToJsonUsingGson(quotes);
    response.getWriter().println(json);
    }

    */
