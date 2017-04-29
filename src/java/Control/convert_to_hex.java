/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author nasrallah
 */
public class convert_to_hex {

    public String stringToHex(String base) {
        StringBuffer buffer = new StringBuffer();
        int intValue;
        for (int x = 0; x < base.length(); x++) {
            int cursor = 0;
            intValue = base.charAt(x);
            String binaryChar = new String(Integer.toBinaryString(base.charAt(x)));
            for (int i = 0; i < binaryChar.length(); i++) {
                if (binaryChar.charAt(i) == '1') {
                    cursor += 1;
                }
            }
            if ((cursor % 2) > 0) {
                intValue += 128;
            }
            buffer.append(Integer.toHexString(intValue) + " ");
        }
        return buffer.toString().replaceAll("\\s+", "");
    }

}
