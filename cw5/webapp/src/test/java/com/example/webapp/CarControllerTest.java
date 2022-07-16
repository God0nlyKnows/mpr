package com.example.webapp;

import static org.mockito.Mockito.when;

import com.example.webapp.controler.CarController;
import com.example.webapp.exceptions.CarExceptionNotFound;
import com.example.webapp.model.Car;
import com.example.webapp.services.CarService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder.get;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(CarController.class)
public class CarControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CarService carService;

    @Test
    public void getCarReturnCar() throws Exception, CarExceptionNotFound {
        Car testCar = new Car("bmw","Black",500);
        when(carService.getCarFromRepo("2")).thenReturn(testCar);

        mvc.perform(get("/car/2").);
    }
}
