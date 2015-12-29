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
package ph.rye.spring12.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ph.rye.spring12.CodeEditor;
import ph.rye.spring12.Developer;
import ph.rye.spring12.DrySkill;
import ph.rye.spring12.Duty;
import ph.rye.spring12.RealDeveloper;
import ph.rye.spring12.Skill;
import ph.rye.spring12.Tool;
import ph.rye.spring12.VersionControl;
import ph.rye.spring12.WriteUnitTestDuty;

/**
 * @author royce
 */
@Configuration
public class Spring12Config {


    @Bean
    public Developer developer() {
        final RealDeveloper developerBean =
                new RealDeveloper(task(), System.out);
        developerBean.setSkill(skill());
        developerBean.setTools(tools());
        return developerBean;
    }

    @Bean
    public Duty task() {
        return new WriteUnitTestDuty(System.out);
    }

    @Bean
    public Skill skill() {
        return new DrySkill(System.out);
    }

    @Bean
    public Tool toolEditor() {
        return new CodeEditor(System.out);
    }

    @Bean
    public Tool versionControl() {
        return new VersionControl(System.out);
    }

    @Bean
    List<Tool> tools() {
        return Arrays.asList(new Tool[] {
                toolEditor(),
                versionControl() });
    }


}

