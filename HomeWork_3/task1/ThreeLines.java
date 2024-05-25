package task1;

public class ThreeLines {

    String line_One, line_Two, line_Three;

    public ThreeLines(String line_One, String line_Two, String line_Three){
        this.line_One = line_One;
        this.line_Two = line_Two;
        this.line_Three = line_Three;
    }

    public int shortestLine (){
        int shortLine = line_One.length();
        if (shortLine < line_Two.length()){
            if (shortLine < line_Three.length()) {
                return 1;
            } else if (shortLine > line_Three.length()){
                return 3;
            } else {
                return 4;
            }
        } else if (shortLine > line_Two.length()) {
            shortLine = line_Two.length();
            if (shortLine < line_Three.length()){
                return 2;
            } else if (shortLine > line_Three.length()){
                return 3;
            } else {
                return 5;
            }
        } else {
            if (shortLine < line_Three.length()){
                return -3;
            } else if (shortLine > line_Three.length()) {
                return 3;
            } else {
                return 6;
            }
        }
    }

    public int longestLine (){
        int longLine = line_One.length();
        if (longLine > line_Two.length()){
            if (longLine > line_Three.length()) {
                return 1;
            } else if (longLine < line_Three.length()){
                return 3;
            } else {
                return 4;
            }
        } else if (longLine < line_Two.length()) {
            longLine = line_Two.length();
            if (longLine > line_Three.length()){
                return 2;
            } else if (longLine < line_Three.length()){
                return 3;
            } else {
                return 5;
            }
        } else {
            if (longLine > line_Three.length()){
                return -3;
            } else if (longLine < line_Three.length()) {
                return 3;
            } else {
                return 6;
            }
        }
    }
}
