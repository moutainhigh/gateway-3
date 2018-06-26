/**
 * Copyright [2015-2017]
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.zitopay.gateway.channel;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gateway.channel.service.alive.IChannelAliveService;
import com.zitopay.gateway.BaseTest;

/**
 * @author xiaoshiwen<xiaoshiwen@zitopay.com>
 * @since 2017年5月17日
 */
public class ChannelTest extends BaseTest {

	@Autowired
	private IChannelAliveService channelAliveService;

	@Test
	public void test() {
		logger.info("service :{}", channelAliveService);
	}

}
