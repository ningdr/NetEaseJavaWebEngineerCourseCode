package com.netease;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.netease.Kitchen;

public class NoodlesServlet extends HttpServlet {
	
    private static final Logger LOGGER = Logger.getLogger(NoodlesServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PrintWriter writer = response.getWriter();
        String vegetable = request.getParameter("vegetable");
        LOGGER.info("Context:" + vegetable);
        String noodles = Kitchen.makeNoodles(vegetable);
        writer.println(noodles);
    }
}
