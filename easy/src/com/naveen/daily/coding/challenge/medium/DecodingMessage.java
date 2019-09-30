package com.naveen.daily.coding.challenge.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * This problem was asked by Facebook.
 *
 * <p>Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways
 * it can be decoded.
 *
 * <p>For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and
 * 'ak'.
 *
 * <p>You can assume that the messages are decodable. For example, '001' is not allowed.
 */
public class DecodingMessage {
  public static Map<Integer, Character> characterMap = new HashMap<Integer, Character>();

  public DecodingMessage() {
    for (int i = 97; i < (97 + 26); i++) {
      characterMap.put(i, (char) i);
    }
  }

  public static void main(String[] args) {
    String encodedMessage = "111";
    System.out.println("encoded message="+ encodedMessage);
    //System.out.println("decoded messages="+ decodeMessage(encodedMessage));
  }

}
