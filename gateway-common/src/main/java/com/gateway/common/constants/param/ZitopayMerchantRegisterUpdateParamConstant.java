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
package com.gateway.common.constants.param;

/**
 * 融智付商户入驻参数常量类
 * 
 * 作者：王政
 * 创建时间：2017年3月15日 上午10:52:18
 */
public class ZitopayMerchantRegisterUpdateParamConstant extends MerchantRegisterUpdateParamConstant {
	
	/**
	 * mer_id 融智付分配的商户号(zitopay_person.pid)
	 */
	public static final String param_merchantId = "mer_id";

	/**
	 * mer_app_id 融智付分配的应用ID(zitopay_person_application.app_id)
	 */
	public static final String param_appId = "mer_app_id";
	
	
}
