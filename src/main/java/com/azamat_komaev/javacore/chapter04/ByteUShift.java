// Беззнаковый сдвиг двоичных разрядв значения типа byte
class ByteUShift {
    public static void main(String args[]) {
        char hex[] = {
            '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte byte1 = (byte) 0xf1;
        byte byte2 = (byte) (byte1 >> 4);
        byte byte3 = (byte) (byte1 >>> 4);
        byte byte4 = (byte) ((byte1 & 0xff) >> 4);

        System.out.println("byte1 = 0x" +
            hex[(byte1 >> 4) & 0x0f] + hex[byte1 & 0x0f]);
        System.out.println("byte2 >> 4 = 0x" +
            hex[(byte2 >> 4) & 0x0f] + hex[byte2 & 0x0f]);
        System.out.println("byte3 >>> 4 = 0x" +
            hex[(byte3 >>> 4) & 0x0f] + hex[byte3 & 0x0f]);
        System.out.println("(byte4 & 0xff) >> 4 = 0x" +
            hex[(byte4 >> 4) & 0x0f] + hex[byte4 & 0x0f]);
    }
}