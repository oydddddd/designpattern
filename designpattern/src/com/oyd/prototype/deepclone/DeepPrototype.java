package com.oyd.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class DeepPrototype implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String name;

	public DeepCloneableTarget deepCloneableTarget;

	public DeepPrototype() {

	}

	//深拷贝 - 方法一使用clone方法
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object deep = null;
		try {
			deep = super.clone();//这里完成对基本数据类型（属性）和String的克隆
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		//对引用类型的属性。进行单独处理
		DeepPrototype deepPrototype = (DeepPrototype) deep;
		//
		deepPrototype.deepCloneableTarget = (DeepCloneableTarget) deepPrototype.deepCloneableTarget.clone();
		return deepPrototype;
	}

	//深拷贝 - 方法二通过对象的序列化实现
	public Object deepClone() {
		 //创建对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //return super.clone();//
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//当前这个对象以对象流的方式输出
            
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype copy = (DeepPrototype)ois.readObject();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally{
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	}
}
