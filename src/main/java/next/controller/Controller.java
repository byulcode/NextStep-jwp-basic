package next.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
    //execute의 반환값이 String
    String execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
