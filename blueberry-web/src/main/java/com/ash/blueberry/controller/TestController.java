package com.ash.blueberry.controller;

import com.ash.blueberry.common.ApiResponse;
import com.ash.blueberry.common.BlueberryException;
import com.ash.blueberry.common.ErrorCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

/**
 * @author xiayichao
 * @version 1.0
 * @since 2024-06-28
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/hello")
    public String test() {
        return "hello world";
    }

    @GetMapping("/greeting")
    public String greeting(HttpServletRequest request, Model model) {
        Locale locale =
            (Locale)request.getAttribute("org.springframework.web.servlet.i18n.LocaleContextResolver.LOCALE");
        String greetingMessage = messageSource.getMessage("hello", null, locale);
        model.addAttribute("message", greetingMessage);
        return "hello";
    }

    @GetMapping("/error")
    @ResponseBody
    public ApiResponse<String> throwError(Long id) {
        throw new BlueberryException(ErrorCodeEnum.UPDATE_ERROR, "id=" + id);
    }

    @GetMapping("/error1")
    @ResponseBody
    public ApiResponse<Integer> Error() {
        return ApiResponse.success(1 / 0);
    }

}
