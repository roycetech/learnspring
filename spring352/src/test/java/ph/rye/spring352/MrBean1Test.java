/**
 *   Copyright 2015 Royce Remulla
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package ph.rye.spring352;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ph.rye.spring352.config.Spring352Config;


/**
 * @author royce
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
        Spring352Config.class })
public class MrBean1Test {


    @Autowired
    private transient MrBean1 mrBean;


    @Test
    public void testSpelOnjection() {

        Assert.assertTrue(
            ReflectionToStringBuilder
                .toString(mrBean)
                .matches(".*\\[field1=1\\]"));

    }

}

