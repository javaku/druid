/*
 * Copyright 1999-2011 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.druid.support.jconsole;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import com.alibaba.druid.support.jconsole.model.DruidTableModel;

/**
 * 请求地址：/basic.json
 * 
 * 请求返回的json格式：
 * {"ResultCode":1,"Content":
 * 			{"Version":"0.2.6","Drivers":
 * 					["sun.jdbc.odbc.JdbcOdbcDriver","com.alibaba.druid.mock.MockDriver",
 * 					"com.mysql.jdbc.Driver","com.alibaba.druid.proxy.DruidDriver"]
 * 			}
 * }
 * */
public class DruidDriverPanel extends DruidPanel {

    private static final long serialVersionUID = 1L;
    private static final String REQUEST_URL = "/basic.json";
    
    public DruidDriverPanel() {
    	super();
    	url = REQUEST_URL;
    }

	@Override
	protected void tableDataProcess(
			ArrayList<LinkedHashMap<String, Object>> data) {
		tableModel = new DruidTableModel(data);
		table.setModel(tableModel);
	}    
}

