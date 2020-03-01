public class UtilidadesServlets {

	public static String getCabecera(String titulo) {
		return "<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"    <meta charset=\"UTF-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n" + 
				"    <title>Document</title>\r\n" + 
				"    <style>\r\n" + 
				"         form > div {\r\n" + 
				"            display:flex;\r\n" + 
				"            justify-content: space-between;\r\n" + 
				"            width:220px;\r\n" + 
				"            margin-bottom: 5px;\r\n" + 
				"        }\r\n" + 
				"        header {\r\n" + 
				"            background-color: #73af55;\r\n" + 
				"        }\r\n" + 
				"        footer {\r\n" + 
				"            background-color: #515151;\r\n" + 
				"        }\r\n" + 
				"        footer, header {\r\n" + 
				"            height: 120px;\r\n" + 
				"            display: flex;\r\n" + 
				"            align-items: center; \r\n" + 
				"            padding-left: 50px;\r\n" + 
				"        }\r\n" + 
				"        h4 {\r\n" + 
				"            color:#73af55;\r\n" + 
				"        }\r\n" + 
				"        main {\r\n" + 
				"            width: 800px;\r\n" + 
				"            margin:20px auto;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"    </style>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"    <header>\r\n" + 
				"        <h1>Curso IFCT034PO - Desarrollo de aplicaciones con java </h1>\r\n" + 
				"    </header>\r\n" + 
				"    <main>";
	}
	public static String getPie() {
		return "</main>\r\n" + 
				"    <footer>\r\n" + 
				"        <h4>IFCT034PO - Desarrollo de aplicaciones con Java</h4>\r\n" + 
				"    </footer>\r\n" + 
				"</body>\r\n" + 
				"</html>";
	}
}
