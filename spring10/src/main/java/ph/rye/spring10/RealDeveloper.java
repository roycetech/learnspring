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
package ph.rye.spring10;

/**
 * @author royce
 *
 */
public class RealDeveloper implements Developer {


    private final Duty duty;

    private Skill skill;


    public RealDeveloper(final Duty duty) {
        this.duty = duty;
    }

    /* (non-Javadoc)
     * @see ph.rye.spring05.Developer#performTask()
     */
    @Override
    public void performDuty() {
        if (skill != null) {
            skill.apply();
        }
        duty.perform();
    }

    /** Test Seam */
    Duty getDuty() {
        return duty;
    }


    /** Test Seam */
    Skill getSkill() {
        return skill;
    }

    public void setSkill(final Skill skill) {
        this.skill = skill;
    }


}
