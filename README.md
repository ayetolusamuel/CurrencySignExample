# CurrencySignExample
library that format price and add currency sign to the price

To use the library
Step 1. Add the JitPack repository to your build file(app module)

Add it in your root build.gradle at the end of repositories:



allprojects {
		repositories {
			
			maven { url 'https://jitpack.io' }
		}
	}
  
  Step 2. Add the dependency
  
  
  
  
  dependencies {
	        implementation 'com.github.ayetolusamuel:CurrencySignExample:1.0.0'
	}




How to use this library:

in your xml:

EditText

    
   
   make sure you include (android:inputType="number") to your price edittext.
       
	
	
	
	
	
	
	
	
	in your code:
	  Utils.inNaira(this,price_from_edittext); 
	  There are many methods, just call the method you want and pass context and the price.
	  #list of method
	  inNaira(context,price);
	  inCedis(context,price);
	  inRupee(context,price); etc
	  
	  
	  #The library will format your price and add currency sign,based on the method.
	
	
	
	
