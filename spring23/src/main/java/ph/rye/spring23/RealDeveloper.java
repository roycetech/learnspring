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
package ph.rye.spring23;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author royce
 */
@Component
public class RealDeveloper implements Developer {


    private final Duty duty;

    @Autowired
    public RealDeveloper(final Duty duty) {
        this.duty = duty;
    }


    /* (non-Javadoc)
     * @see ph.rye.spring05.Developer#performTask()
     *
     * @param time regular 0 or overtime 1.
     */
    @Override
    public void performDuty() {
        duty.perform();
    }


    /** Test Seam */
    Duty getDuty() {
        return duty;
    }


    @Override
    public void focusPriority(final int priority) {
        System.out.println("Setting priority to: " + priority);
    }


}
