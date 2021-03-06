/*
 * Licensed to Metamarkets Group Inc. (Metamarkets) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Metamarkets licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.druid.cli;

import io.airlift.airline.Command;
import io.druid.initialization.DruidModule;
import io.druid.initialization.Initialization;
import io.druid.server.StatusResource;

@Command(
    name = "version",
    description = "Returns Druid version information"
)
public class Version implements Runnable
{
  @Override
  public void run()
  {
    System.out.println(new StatusResource.Status(Initialization.getLoadedImplementations(DruidModule.class)));
  }
}
