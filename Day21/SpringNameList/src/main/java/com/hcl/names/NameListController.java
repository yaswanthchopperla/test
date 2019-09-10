package com.hcl.names;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameListController {
  @RequestMapping("/names")
  public ModelAndView nameDemo() {
	  List<String> lstNames=new ArrayList<String>();
	  lstNames.add("yaswanth");
	  lstNames.add("SaiKumar");
	  lstNames.add("SatyaSai");
	  lstNames.add("Venkat");
	  lstNames.add("Vinod");
	  return new ModelAndView("ShowPage","lists",lstNames);
  }
}
