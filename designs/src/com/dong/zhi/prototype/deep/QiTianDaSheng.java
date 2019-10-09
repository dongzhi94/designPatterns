package com.dong.zhi.prototype.deep;

import java.io.*;
import java.util.Date;

public class QiTianDaSheng extends Monkey implements Cloneable,Serializable {
    public JinGuBang jinGuBang;


    public  QiTianDaSheng(){
        //只是初始化
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    public QiTianDaSheng deepClone(){
        try{
            //这种依赖于序列化
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.flush();
            oos.close();

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTianDaSheng copy = (QiTianDaSheng)ois.readObject();
            copy.birthday = new Date();
            ois.close();
            return copy;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    public QiTianDaSheng copy(QiTianDaSheng q1){
        QiTianDaSheng q2 = new QiTianDaSheng();
        q2.height = q1.height;
        q2.weight = q1.weight;

        q2.jinGuBang = new JinGuBang();
        q2.jinGuBang.h = q1.jinGuBang.h;
        q2.jinGuBang.d = q1.jinGuBang.d;

        q2.birthday = new Date();
        return q2;
    }

    public Object reflectObject(Object source){
        return null;
    }
}
