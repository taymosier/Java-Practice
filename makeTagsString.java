/*
 
The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given 
tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
 */

public class makeTagsString {
	public String makeTags(String tag, String word) {
		tag = "<" + tag + ">";
		String endtag = "</" + tag.substring(1, tag.length());
		return tag + word + endtag;
	}

}
