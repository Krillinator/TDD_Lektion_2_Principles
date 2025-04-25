package com.demo.lektion2.principle.yagni.showcase;

/* Purpose
*   TODO - User story: As a User, I want to be able to print a simple
*    message so that I can see the result of the input message
*   Showcase the problem
* */

public class YagniKissExample {

    // Does the following code break the YAGNI / KISS principle?
    // Answer: YES
    // Explanation: Currently we are implementing two solutions for
    // two different problems... Unnecessary code!
    // User story never asks for an HTML formatter...
    private MessageFormatter messageFormatter;
    private HtmlMessageFormatter htmlMessageFormatter;
    
}
