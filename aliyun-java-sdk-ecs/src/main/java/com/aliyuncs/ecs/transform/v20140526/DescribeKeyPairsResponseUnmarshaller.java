/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeKeyPairsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeKeyPairsResponse.KeyPair;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeKeyPairsResponseUnmarshaller {

	public static DescribeKeyPairsResponse unmarshall(DescribeKeyPairsResponse describeKeyPairsResponse, UnmarshallerContext context) {
		
		describeKeyPairsResponse.setRequestId(context.stringValue("DescribeKeyPairsResponse.RequestId"));
		describeKeyPairsResponse.setTotalCount(context.integerValue("DescribeKeyPairsResponse.TotalCount"));
		describeKeyPairsResponse.setPageNumber(context.integerValue("DescribeKeyPairsResponse.PageNumber"));
		describeKeyPairsResponse.setPageSize(context.integerValue("DescribeKeyPairsResponse.PageSize"));

		List<KeyPair> keyPairsList = new ArrayList<KeyPair>();
		for (int i = 0; i < context.lengthValue("DescribeKeyPairsResponse.KeyPairs.Length"); i++) {
			KeyPair keyPair = new KeyPair();
			keyPair.setKeyPairName(context.stringValue("DescribeKeyPairsResponse.KeyPairs["+ i +"].KeyPairName"));
			keyPair.setKeyPairFingerPrint(context.stringValue("DescribeKeyPairsResponse.KeyPairs["+ i +"].KeyPairFingerPrint"));

			keyPairsList.add(keyPair);
		}
		describeKeyPairsResponse.setKeyPairs(keyPairsList);
	 
	 	return describeKeyPairsResponse;
	}
}