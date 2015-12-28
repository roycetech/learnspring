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
package ph.rye.spring08.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ph.rye.spring08.Developer;
import ph.rye.spring08.DrySkill;
import ph.rye.spring08.Duty;
import ph.rye.spring08.RealDeveloper;
import ph.rye.spring08.Skill;
import ph.rye.spring08.WriteUnitTestDuty;

/**
 * @author royce
 *
 */
@Configuration
public class Spring08Config {


    @Bean
    public Developer developer() {
        final RealDeveloper developerBean = new RealDeveloper(task());
        developerBean.setSkill(skill());
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


}

