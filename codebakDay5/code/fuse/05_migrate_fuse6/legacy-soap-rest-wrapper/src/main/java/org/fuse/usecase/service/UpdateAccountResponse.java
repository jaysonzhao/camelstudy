
package org.fuse.usecase.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>updateAccountResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="updateAccountResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://service.usecase.fuse.org/}corporateAccount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateAccountResponse", propOrder = {
    "_return"
})
public class UpdateAccountResponse {

    @XmlElement(name = "return")
    protected CorporateAccount _return;

    /**
     * ��ȡreturn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CorporateAccount }
     *     
     */
    public CorporateAccount getReturn() {
        return _return;
    }

    /**
     * ����return���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAccount }
     *     
     */
    public void setReturn(CorporateAccount value) {
        this._return = value;
    }

}
