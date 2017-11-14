package com.example.demo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AddressInfo.do")
public class AddressInfo extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String userAgent = req.getHeader("User-Agent");
        System.out.println(req.getSession().getAttribute("golemina"));
        PrintWriter pw = resp.getWriter();
        pw.println();
    }
}
