package features.java13;

public class TextblockPreview {

	public static void main(final String[] args) {

		String multiLineString = """
				THIS IS A MULTI
				LINE STRING WITH A BACKSLASH \\
				""";
		System.out.println(multiLineString);

		String html = """
				<html>
					<body>
						<h1>Hello World</h1>
					</body>
				</html>
				""";
		System.out.println(html);

		String json = """
				{
					"Name": "James",
					"Lastname": "Bond",
					"Alias": "007"
				}
				""";
		System.out.println(json);
	}
}
