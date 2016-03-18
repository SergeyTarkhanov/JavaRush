package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* РќСѓР¶РЅРѕ РґРѕР±Р°РІРёС‚СЊ РІ РїСЂРѕРіСЂР°РјРјСѓ РЅРѕРІСѓСЋ С„СѓРЅРєС†РёРѕРЅР°Р»СЊРЅРѕСЃС‚СЊ
Р—Р°РґР°С‡Р°: РџСЂРѕРіСЂР°РјРјР° РѕРїСЂРµРґРµР»СЏРµС‚, РєР°РєР°СЏ СЃРµРјСЊСЏ (С„Р°РјРёР»РёСЋ) Р¶РёРІС‘С‚ РІ РґРѕРјРµ СЃ СѓРєР°Р·Р°РЅРЅС‹Рј РЅРѕРјРµСЂРѕРј.
РќРѕРІР°СЏ Р·Р°РґР°С‡Р°: РџСЂРѕРіСЂР°РјРјР° РґРѕР»Р¶РЅР° СЂР°Р±РѕС‚Р°С‚СЊ РЅРµ СЃ РЅРѕРјРµСЂР°РјРё РґРѕРјРѕРІ, Р° СЃ РіРѕСЂРѕРґР°РјРё:
РџСЂРёРјРµСЂ РІРІРѕРґР°:
РњРѕСЃРєРІР°
Р�РІР°РЅРѕРІС‹
РљРёРµРІ
РџРµС‚СЂРѕРІС‹
Р›РѕРЅРґРѕРЅ
РђР±СЂР°РјРѕРІРёС‡Рё

Р›РѕРЅРґРѕРЅ

РџСЂРёРјРµСЂ РІС‹РІРѕРґР°:
РђР±СЂР°РјРѕРІРёС‡Рё
*/

public class Solution
{
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true) {
            try {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                list.add(Integer.parseInt(br.readLine()));
            }catch (NumberFormatException e){
               for (int numb : list)
                   System.out.println(numb);
            } catch(IOException e) {
             e.printStackTrace();
            }
        }
    }
}
