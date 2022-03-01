package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/*
 * Insert a description here.
 *
 * Bugs: none known
 *
 * @author  abedini abedini@doxee.com
 * @createDate  28/02/2022
 *
 * Copyright (C) 2022 Doxee S.p.A. C.F. - P.IVA: IT02714390362. All Rights Reserved
 */
@Controller
public class MyController {

  public String sayHello() {
    System.out.println("Hello world!");

    return "Hi Folks!";
  }

}
