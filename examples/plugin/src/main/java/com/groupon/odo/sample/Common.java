/*
 Copyright 2014 Groupon, Inc.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
*/
package com.groupon.odo.sample;

import com.groupon.odo.proxylib.plugin.ResponseOverride;

public class Common {
    @ResponseOverride(
            httpCode=200,
            description="Slow Down Response")
    public static String delay(String source, Integer milliseconds) throws Exception {
        Thread.sleep(milliseconds);
        return source;
    }
}