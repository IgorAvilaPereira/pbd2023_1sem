/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package apresentacao;

import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import static spark.Spark.get;
import static spark.Spark.staticFiles;
import spark.template.mustache.MustacheTemplateEngine;

/**
 *
 * @author iapereira
 */
public class ApplicationMain {

    public static void main(String[] args) {
        
        staticFiles.location("/public");
        
        Map map = new HashMap();
        map.put("name", "igor");
        get("/hello", (rq, rs) -> new ModelAndView(map, "hello.html"), new MustacheTemplateEngine());
        get("/", (request, response) -> "Hello World");
    }

}