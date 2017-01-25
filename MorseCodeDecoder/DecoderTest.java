public class DecoderTest {
		
	public static void main(String[] args) {
		String bits = "11100010101010001000000011101110101110001010111000101000111010111010001110101110000000111010101000101110100011101110111000101110111000111010000000101011101000111011101110001110101011100000001011101110111000101011100011101110001011101110100010101000000011101110111000101010111000100010111010000000111000101010100010000000101110101000101110001110111010100011101011101110000000111010100011101110111000111011101000101110101110101110";
		String morse=Decoder.decodeBits(bits);
		System.out.println(morse);
		String result=Decoder.decodeMorse(morse);
		System.out.println(result);
		System.out.println("Expected: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.");
	}

}