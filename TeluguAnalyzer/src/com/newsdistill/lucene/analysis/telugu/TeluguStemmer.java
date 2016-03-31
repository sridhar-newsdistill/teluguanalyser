package com.newsdistill.lucene.analysis.telugu;

import static org.apache.lucene.analysis.util.StemmerUtil.endsWith;

public class TeluguStemmer {
	public int stem(char buffer[], int len) {
	    // 5
		System.out.println("In telugu stemmer : "+buffer.toString());
//	    if ( (endsWith(buffer, len,"DAM")
//	        || endsWith(buffer, len,"dam")
//	      ))
//	      return len - 3;
//	    
//	    if ( (endsWith(buffer, len,"LU") || endsWith(buffer, len,"lu")))
//		      return len - 2;
//	    
//	    if ( (endsWith(buffer, len,"GA") || endsWith(buffer, len,"ga")))
//		      return len - 2;
	    
	    //parinnamimchimdi --> parinnamimchi
		
	    if((endsWith(buffer, len, "imdi"))){
	    	return len-3;
	    }
	   // if(())
	    
	    if(endsWith(buffer, len, "gaa") && len > 3){
	    	return len-3;
	    }
	    
	    //punnyaksheetramlo --> punnyaksheetram
	    if((endsWith(buffer, len, "amlo")) && len > 4){
	    	return len-2;
	    }
	    
	    
	    //veeddukalu --> veedduka
	    if((endsWith(buffer, len, "alu")) && endsWith(buffer, len, "aalu") == false){
	    	return len-2;
	    }
	    
	    //hrdayaalu --> hrdaya
	    if(endsWith(buffer, len, "aalu") && len > 4){
	    	return len-4;
	    }
	    
	    
	    //cheerukunnaaru --> cheeruk, vastaanannaaru --> vastaana
	    if((endsWith(buffer, len, "nnaaru")) && endsWith(buffer, len, "annaaru") == false){
	    	return len-5;
	    }
	    
	    if((endsWith(buffer, len, "annaaru"))){
	    	return len-6;
	    }
	    
	  //cheerukoni --> cheeruk
	    if((endsWith(buffer, len, "koni"))){
	    	return len-3;
	    }
	    
	    
	    //mottukumttunnaa --> mottukumttu
	    if((endsWith(buffer, len, "ttunnaa"))){
	    	return len-4;
	    }
	    
	    //aalayamlo --> aalayam, hrudayamlo --> hrudayam
	    if((endsWith(buffer, len, "amlo"))){
	    	return len-2;
	    }
	    
	    
	    //ammavaariki --> ammavaar, nannagariki --> nannagaar
	    if((endsWith(buffer, len, "yamlo"))){
	    	return len-2;
	    }
	    
	    //nirvahimchaaru --> nirvahimch
	    if((endsWith(buffer, len, "chaaru"))){
	    	return len-4;
	    }
	    
	    
	   //nirvahimchaaru --> nirvahimch, samdarshimchaaru --> samdarshim
	    if((endsWith(buffer, len, "chaaru"))){
	    	return len-4;
	    }
	    
	  //nirvahimchaaru --> nirvahimch
	    if((endsWith(buffer, len, "chaaru"))){
	    	return len-4;
	    }
	    
	    
	    //rojullo --> roju
	    if((endsWith(buffer, len, "llo"))){
	    	return len-3;
	    }
	    
	    //rojulo --> roju
	    if((endsWith(buffer, len, "lo")  && endsWith(buffer, len, "llo") == false)){
	    	return len-2;
	    }
	    
	    //vivaraalloki --> vivaraal
	    if((endsWith(buffer, len, "loki"))){
	    	return len-4;
	    }
	    
	    
	    //talapettttaddamto --> talapetttt
	    if((endsWith(buffer, len, "addamto"))){
	    	return len-7;
	    }
	    
	    //talapettttaddamee --> talapetttt
	    if((endsWith(buffer, len, "addamee"))){
	    	return len-7;
	    }
	    
	    //panicheesimdani --> panicheesimd, kalpimchaledani --> kalpimchaled
	    if((endsWith(buffer, len, "dani"))){
	    	return len-3;
	    }
	    /*if((endsWith(buffer,len,"kunna")))
	    {
	    	return len-5;
	    }*/
	    
	    
	    //kalpimchaalani --> kalpimch
	    if((endsWith(buffer, len, "chaalani")) && len > 8){
	    	return len-8;
	    }
	    
	    
	    // ramgamloki -->  ramgam , veluguloki --> velugu
	    if((endsWith(buffer, len, "loki"))){
	    	return len-4;
	    }
	    
	    // teluguto -->  telugu
	    if(endsWith(buffer, len, "to" ) && len > 5 && endsWith(buffer, len, "addamto") == false){
	    	return len-2;
	    }
	    
	    //dhvajamettaaru -->  dhvajam
	    if(endsWith(buffer, len, "ettaaru") && len > 7){
	    	return len-7;
	    }
	    
	    //ennikalappuddu -->  ennikal
	    if(endsWith(buffer, len, "appuddu") && len > 7){
	    	return len-7;
	    }
	    
	    //darshanaaniki -->  darshana
	    if((endsWith(buffer, len, "aniki"))){
	    	return len-5;
	    }
	    
	    //nelakolpeemduku -->  nelakolp
	    if((endsWith(buffer, len, "eemduku"))){
	    	return len-7;
	    }
	    
	    //nelakolpeemduku -->  nelakolp
	    if((endsWith(buffer, len, "eemduku"))){
	    	return len-7;
	    }
	    
	    
	    //parishramala -->  parishram
	    if(endsWith(buffer, len, "ala") && len > 4){
	    	return len-7;
	    }
	    
	    //vadileeyaalamttuu -->  vadileeyaal
	    if(endsWith(buffer, len, "amttuu")){
	    	return len-6;
	    }
	    
	    //prashnimchaaddu -->  prashnich
	    if(endsWith(buffer, len, "aaddu") && len > 5){
	    	return len-5;
	    }
	    
	    //cheestunnaarani -->  cheestunn
	    if(endsWith(buffer, len, "aarani")){
	    	return len-6;
	    }
	    
	    //bhayapaddipotunnaayi -->  bhayapaddipotunn
	    if(endsWith(buffer, len, "aayi")){
	    	return len-4;
	    }
	    
	    //maattlaaddutunnattttu -->  maattlaaddutunn
	    if(endsWith(buffer, len, "attttu")){
	    	return len-6;
	    }
	    //boggutonee --> bogguto 
	    if(endsWith(buffer,len,"nee"))
	    {
	    	return len-2;
	    }
	    
	    //prashnalaku --> prashnala
	    if(endsWith(buffer,len,"ku"))
	    {
	    return len-2;
	    }
	    
	    if(endsWith(buffer,len,"to")&&len>5)
	    {
	    	return len-2;
	    }
	    if(endsWith(buffer,len,"ki")&&len>5)
	    {
	    	return len-2;
	    }
	    if(endsWith(buffer,len,"ni")&&len>5)
	    {
	    	return len-2;
	    }
	    if(endsWith(buffer,len,"pai")&&len>5)
	    {
	    	return len-3;
	    }
	    
	    
	    return len;
	}
}
