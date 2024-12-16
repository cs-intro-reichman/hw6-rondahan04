import java.awt.Color;
public class Editor4 {


    public static void main (String[] args) {
		String picture = args[0];
        int alpha = Integer.parseInt(args[1]);
        Color[][] imageReg = Runigram.read(picture);
        Color[][] imageGrey =Runigram.grayScaled(imageReg);
        Runigram.setCanvas(imageReg);
        Runigram.morph(imageReg, imageGrey, alpha); 
	}
}
