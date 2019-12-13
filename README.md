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

<EditText
        android:id="@+id/edt_price"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="number"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
	
	
	
	
	#to capture your price
	
	
	
	
	in your code:
	  Utils.inNaira(this,price_from_edittext); 
	  There are many method, just call the method you want and pass context and the price.
	  #list of method
	  inNaira(context,price);
	  inCedis(context,price);
	  inRupee(context,price); etc
	
	
	
	
