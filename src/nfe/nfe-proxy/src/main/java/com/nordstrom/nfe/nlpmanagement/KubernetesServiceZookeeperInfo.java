/**
 * Copyright (C) 2018 Nordstrom, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nordstrom.nfe.nlpmanagement;

import com.nordstrom.gtm.kubernetesdeployment.ServiceInfo;
import lombok.Getter;

@Getter
public class KubernetesServiceZookeeperInfo {
  private final String name;
  private final int podCount;

  public KubernetesServiceZookeeperInfo(String name, int podCount) {
    this.name = name;
    this.podCount = podCount;
  }

  public KubernetesServiceZookeeperInfo(ServiceInfo serviceInfo) {
    this.name = serviceInfo.getName();
    this.podCount = serviceInfo.getNodePodCount();
  }

  KubernetesServiceZookeeperInfo() {
    this.name = "";
    this.podCount = 0;
  }
}
