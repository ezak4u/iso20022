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
 *
 */

package ch.dvbern.oss.lib.iso20022.camt053.v00104;

import ch.dvbern.oss.lib.iso20022.camt.CamtValidateUtility;
import ch.dvbern.oss.lib.iso20022.exceptions.Iso20022RuntimeException;
import org.junit.Assert;
import org.junit.Test;

import static ch.dvbern.oss.lib.iso20022.camt053.v00104.Camt053V00104Service.PATH_CAMT_053_001_04_XSD;

/**
 * Tests the validation of an xml with its xsd
 */
public class Camt053V00104ServiceValidateXmlWithXsdTest extends Camt053V00104ServiceAbstractTest {

	@Test
	public void validateXmlWithXsdSuccessTest() throws Exception {

		// prepare
		setXmlAsBytes("ch/dvbern/oss/lib/iso20022/camt053/v00104/camt.053_P_CH0309000000250090342_380000000_0_2016053100163801.xml");

		// run and test
		Assert.assertTrue(CamtValidateUtility.validateXmlWithXsd(getXmlAsBytes(), PATH_CAMT_053_001_04_XSD));
	}

	@Test
	public void validateXmlWithXsdFailureTest() throws Exception {

		// prepare
		setXmlAsBytes("ch/dvbern/oss/lib/iso20022/camt053/v00104/camt_053_Beispiel_NotificationMissing.xml");

		// run and test
		Assert.assertFalse(CamtValidateUtility.validateXmlWithXsd(getXmlAsBytes(), PATH_CAMT_053_001_04_XSD));
	}
}