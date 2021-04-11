package cz.czechitas.java2webapps.ukol2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller()
public class myController{

 private final Random random = new Random();
 private final List<String> pozadi = Arrays.asList("JpuEAl6vXfI","no0XfLjMGJY","Xt9QnzqQikk","QbLsbDLtgC8","qGUUW4qryjM","wc9jceiLz1U");
 private List<String> texty = Arrays.asList();
 String text1= "A user interface is like a joke. If you have to explain it, it's not that good.";
 String text2 = "A user interface is like a joke. If you have to explain it, it's not that good.";
 String text3 = "Debugging /de·bugh·ing/ (verb): The Classic Mystery Game where you are the detective, the victim, and the murderer.";
 String text4 = "To replace programmers with robots, clients will have to accurately describe what they want. We're safe.";
 String text5 = "I have a joke on programming but it only works on my computer.";
 String text6 = "Programmer (noun.): A machine that turns coffee into code.";



   @GetMapping("/")
    public ModelAndView citatdne(){
       texty.add(text1);
       texty.add(text2);
       texty.add(text3);
       texty.add(text4);
       texty.add(text5);
       texty.add(text6);
   int cisloObrazku = random.nextInt(6)+1;
    String kodObrazku;
       kodObrazku = pozadi.get(cisloObrazku);


   int cisloCitatu=random.nextInt(6)+1;
     String citatek=texty.get(cisloCitatu);

    ModelAndView result = new ModelAndView("citatdne");
       result.addObject("obrazek", String.format("https://source.unsplash.com/%s", kodObrazku));
       result.addObject("citat",citatek);
       return result;
    }

}
