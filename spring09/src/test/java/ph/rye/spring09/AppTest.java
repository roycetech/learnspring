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
package ph.rye.spring09;

import org.junit.Assert;
import org.junit.Test;

import ph.rye.spring09.App;
import ph.rye.spring09.RealDeveloper;


/**
 * @author royce
 */
public class AppTest {


    private final App sut = new App();


    /**
     * Test method for {@link ph.rye.spring09.App#getBean()}.
     */
    @Test
    public void testBeanInstantatedAndPropertyInjected() {
        final RealDeveloper developerBean = (RealDeveloper) sut.getBean();
        Assert.assertNotNull(developerBean.getDuty());
        Assert.assertNotNull(developerBean.getSkill());
    }

}
