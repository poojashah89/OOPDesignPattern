package com.MVC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

public class test2 {
	public static void main(String[] args)  {

		View view = new View();
		Model model = new Model();
		
		Controller ctrl = new Controller(view , model);
		view.setVisible(true);
		
    }
}
