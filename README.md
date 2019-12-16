# CurrencySignExample
Android library that format price and add currency sign to the price


## Prerequisites

Add this in your root build.gradle file (not your module build.gradle file):


```shell
allprojects {
		repositories {
			
			maven { url 'https://jitpack.io' }
		}
	}
```

  
  ## Dependency
  
  Step 2. Add the dependency
  
 
  ```shell
dependencies {
	        implementation 'com.github.ayetolusamuel:CurrencySignExample:1.0.2'
	}
```


## Usuage

How to use this library:

in your xml:

EditText

    
   
   make sure you include (android:inputType="numberDecimal") to your price edittext.
       
	
	
	
	
	
	
	
	
	in your code:
	  Utils.inNaira(this,price_from_edittext); 
	  There are many methods, just call the method you want and pass context and the price.
	  #list of method
	  inNaira(context,price);
	  inCedis(context,price);
	  inRupee(context,price); etc
	  
	  
	  #The library will format your price and add currency sign,based on the method.
	
	
	
	
