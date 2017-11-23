
/*
 * Copyright 2017 DV Bern AG
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 */

package ch.dvbern.oss.lib.iso20022.pain001.v00103ch02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeRateType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExchangeRateType1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SPOT"/>
 *     &lt;enumeration value="SALE"/>
 *     &lt;enumeration value="AGRD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExchangeRateType1Code", namespace = "http://www.six-interbank-clearing.com/de/pain.001.001.03.ch.02.xsd")
@XmlEnum
public enum ExchangeRateType1Code {

    SPOT,
    SALE,
    AGRD;

    public String value() {
        return name();
    }

    public static ExchangeRateType1Code fromValue(String v) {
        return valueOf(v);
    }

}
