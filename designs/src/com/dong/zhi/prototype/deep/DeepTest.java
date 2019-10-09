package com.dong.zhi.prototype.deep;

public class DeepTest {

    public static void main(String[] args) {
        /*try {
            QiTianDaSheng q1 = new QiTianDaSheng();
            QiTianDaSheng q2 = (QiTianDaSheng)q1.clone();
            //false，说明对象不是同一个，拷贝的不再是引用
            System.out.println(q1.jinGuBang == q2.jinGuBang);
        }catch (Exception e){
            e.printStackTrace();
        }*/

        QiTianDaSheng q1 = new QiTianDaSheng();
        QiTianDaSheng q2 = q1.copy(q1);
        //false
        System.out.println(q1.jinGuBang == q2.jinGuBang);


    }
}
