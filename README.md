# HAI913I_TP5


##	Introduction to software traceability with [Spoon](https://spoon.gforge.inria.fr/).


# How to run our app 

- Open "HAI913I_TP5_TL" as Maven Project with Java IDE like Eclipse
- Run "Spoon.java" the project "q1Testing" will be instrumented by Spoon, you can view the result in "spooned" folder
- Right click on "spooned/src" folder in Eclipse, Build Path -> Use as source folder
- You can see instrumented project in your build path, resolver some import problem if needed
- Lunch "Main.java", file "loggingRepository" will be generate, enjoy ! 

# Extract of result

```json
"who":{
 "UserID":1,
 "Name":"DNS"},
"where":"class Repository.addProduct",
"what":"Product with ID : 1 Product Name : Eggs Product price : 3.5 Expiration date : 25/11/2021",
"when":"Sat Dec 11 17:49:12 CET 2021"
}
```




