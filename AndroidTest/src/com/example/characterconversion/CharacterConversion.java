package com.example.characterconversion;

public class CharacterConversion {
    private String parseBytesToString(byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            char ch = (char) bytes[i];
            sb.append(ch);
        }
        return sb.toString();
    }

    private int parseStringToInt(String st) {
        try {
            if (st == null || "".equals(st)) {
                return 0;
            }
            String tem = st.replaceAll("[^(1-9)]", "");
            if (tem.length() < 1) {
                return 0;
            }
            tem = tem.substring(0, 1);
            tem = st.substring(st.indexOf(tem));
            return Integer.parseInt(tem);
        } catch (Exception e) {
            return 0;
        }
    }
}
