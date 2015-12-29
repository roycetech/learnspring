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
package ph.rye.spring14;

import java.io.PrintStream;
import java.util.List;

/**
 * @author royce
 *
 */
public class RealDeveloper implements Developer {


    private final Duty duty;

    private final PrintStream stream;

    private Skill skill;

    private List<String> contacts;

    private List<Tool> tools;


    public RealDeveloper(final Duty duty, final PrintStream stream) {
        this.duty = duty;
        this.stream = stream;
    }

    /* (non-Javadoc)
     * @see ph.rye.spring05.Developer#performTask()
     */
    @Override
    public void performDuty() {
        if (skill != null) {
            skill.apply();
        }
        if (contacts != null) {
            stream.println(
                "If need be, I have these contact numbers: " + contacts);
        }

        if (tools != null) {
            stream.println(
                "I have these tools to make great products : " + tools);
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

    List<String> getContacts() {
        return contacts;
    }

    public void setContacts(final List<String> contacts) {
        this.contacts = contacts;
    }

    List<Tool> getTools() {
        return tools;
    }

    public void setTools(final List<Tool> tools) {
        this.tools = tools;
    }


}
