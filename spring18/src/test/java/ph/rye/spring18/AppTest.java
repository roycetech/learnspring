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
package ph.rye.spring18;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ph.rye.spring18.config.Spring18TestConfig;


/**
 * @author royce
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
        Spring18TestConfig.class })
public class AppTest {


    @Autowired
    Developer developer;

    @Autowired
    MockPrintStream printStream;


    @After
    public void clearPrintStream() {
        printStream.clear();
    }


    @Test
    public void shouldInjectDeveloperWithDuty() {
        developer.performDuty();
        assertEquals("Write Unit Test.\n", printStream.getPrintedString());
    }

}
