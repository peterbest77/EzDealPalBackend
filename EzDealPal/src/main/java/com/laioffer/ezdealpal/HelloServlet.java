package com.laioffer.ezdealpal;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laioffer.ezdealpal.entity.User;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//
//        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
        response.setContentType("application/json");

        User c = new User();
        c.setUserId("sun@laioffer.com");
        c.setPassword("123456");
        c.setName("rick");
        c.setEnabled(true);

        ObjectMapper mapper = new ObjectMapper();

        response.getWriter().print(mapper.writeValueAsString(c));


        JSONObject customer = new JSONObject();
        customer.put("userId", "sun@laioffer.com");
        customer.put("name", "rick");
        customer.put("age", 50);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Read customer information from request body
        JSONObject jsonRequest = new JSONObject(IOUtils.toString(request.getReader()));
        String email = jsonRequest.getString("userId");
        String name = jsonRequest.getString("name");

        // Print customer information to IDE console
        System.out.println("Email is: " + email);
        System.out.println("name is: " + name);

        // Return status = ok as response body to the client
        response.setContentType("application/json");
        JSONObject jsonResponse = new JSONObject();
        jsonResponse.put("status", "ok");
        response.getWriter().print(jsonResponse);
    }

    public void destroy() {
    }
}