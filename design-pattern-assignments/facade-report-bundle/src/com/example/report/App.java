package com.example.report;
import java.nio.file.*; import java.util.*;

public class App {
    public static void main(String[] args) {
       ReportBundleFacade facade = new ReportBundleFacade(new JsonWriter(), new Zipper(), new AuditLog());
       Map<String,Object> data = Map.of("name", "Quarterly");
       Path zip = facade.export(data, Path.of("out"), "report");
       System.out.println("DONE " + zip);
    }
}
