package myFirstSpringMVC.controller;


import myFirstSpringMVC.model.CulcUser;
import myFirstWorkDB.EnterPoint;
import myFirstWorkDB.entity.User1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {

    /*First method on start application*/
    /*Попадаем сюда на старте приложения (см. параметры аннтоции и настройки пути после деплоя) */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userJSP", new User1());
        modelAndView.setViewName("index");
        return modelAndView;
    }

    /*как только на index.jsp подтвердится форма
    <spring:form method="post"  modelAttribute="userJSP" action="check-user">,
    то попадем вот сюда
     */
    @RequestMapping(value = "/check-user")
    public ModelAndView checkUser(@ModelAttribute("userJSP") User1 culcUser) {
        ModelAndView modelAndView = new ModelAndView();

        EnterPoint enterPoint = new EnterPoint();

        if (culcUser.getNonoperatingIncome_3() + culcUser.getIncome_2() > culcUser.getCostsBusiness_13()){
            culcUser.caclulate();
            enterPoint.addToDB(culcUser);
        }
        //culcUser.culcTax();

        //записываем в атрибут userJSP (используется на странице *.jsp объект user
        modelAndView.addObject("userJSP", culcUser);
        modelAndView.setViewName("index");

        return modelAndView; //после уйдем на представление, указанное чуть выше, если оно будет найдено.
    }
}
